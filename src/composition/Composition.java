package composition;

import java.util.ArrayList;
import java.util.List;

class File {
    private String fileName;

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void printFile() {
        System.out.println(fileName);
    }
}

class Folder {
    private String folderName;
    private Folder parentFolder;
    private List<Folder> subFolders;
    private List<File> files;
    
    public Folder() {
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public String getFolderName() {
        return folderName;
    }
    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }
    public Folder getParentFolder() {
        return parentFolder;
    }
    public void setParentFolder(Folder parentFolder) {
        this.parentFolder = parentFolder;
    }

    public void addFile(File file) {
        files.add(file);
    }
    public void addSubFolder(Folder folder) {
        folder.setParentFolder(this);
        subFolders.add(folder);
    }
    public void deleteFolder() {
        for (int i = 0; i < subFolders.size(); i++) {
            Folder subFolder = subFolders.get(i);
            subFolder.deleteFolder();
        }
        
        subFolders.clear();
        files.clear();
        if (parentFolder != null) {
            parentFolder.subFolders.remove(this);
        }
    }
    public void printFolder(String indent, boolean isSubfolder) {
        System.out.println(indent + "Folder: " + folderName);
        for (File file : files) {
            System.out.println("\t" + indent + "File: " + file.getFileName());
        }
        for (int i = 0; i < subFolders.size(); i++) {
            Folder subFolder = subFolders.get(i);
            String subIndent = isSubfolder ? "\t" + indent : indent + "\t↳ "; 
            subFolder.printFolder(subIndent, true); 
        }
    }

}

public class Composition {
    public static void main(String[] args) {
        Folder root = new Folder();
        root.setFolderName("php_demo1");
        Folder sourceFiles = new Folder();
        sourceFiles.setFolderName("Source Files");
        Folder phalcon = new Folder();
        phalcon.setFolderName(".phalcon");
        Folder app = new Folder();
        app.setFolderName("app");
        Folder config = new Folder();
        config.setFolderName("config");
        Folder controllers = new Folder();
        controllers.setFolderName("controllers");
        Folder library = new Folder();
        library.setFolderName("library");
        Folder migrations = new Folder();
        migrations.setFolderName("migrations");
        Folder models = new Folder();
        models.setFolderName("models");
        Folder views = new Folder();
        views.setFolderName("views");
        Folder cache = new Folder();
        cache.setFolderName("cache");
        Folder publicf = new Folder();
        publicf.setFolderName("public");
        File htaccess = new File();
        htaccess.setFileName(".htaccess");
        File htrouter = new File();
        htrouter.setFileName(".htrouter.php");
        File index = new File();
        index.setFileName("index.html");
        Folder includePath = new Folder();
        includePath.setFolderName("Include Path");
        Folder remoteFiles = new Folder();
        remoteFiles.setFolderName("Remote Files");
        
        root.addSubFolder(sourceFiles);
        sourceFiles.addSubFolder(phalcon);
        sourceFiles.addSubFolder(app);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicf);
        publicf.addFile(htaccess);
        publicf.addFile(htrouter);
        publicf.addFile(index);
        root.addSubFolder(includePath);
        root.addSubFolder(remoteFiles);
        
        System.out.println("Step 1. Print structure:");
        root.printFolder("", false);
        System.out.println();
        System.out.println("Step 2. Delete folder 'app' and reprint structure:");
        app.deleteFolder();
        root.printFolder("", false);
        System.out.println();
        System.out.println("Step 3. Delete folder 'public' and reprint structure:");
        publicf.deleteFolder();
        root.printFolder("", false);
    }
}
