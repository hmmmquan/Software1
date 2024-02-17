package aggregation;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public Instructor getInstructor() {
        return instructor;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public Textbook getTextbook() {
        return textbook;
    }
    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void printCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook Title: " + textbook.getTitle());
        System.out.println("Author: " + textbook.getAuthor());
        System.out.println("Publisher: " + textbook.getPublisher());
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.setFirstName("Nima");
        instructor.setLastName("Davarpanah");
        instructor.setOfficeNumber("3-2636");

        Textbook textbook = new Textbook();
        textbook.setTitle("Clean Code");
        textbook.setAuthor("Robert C. Martin Series");
        textbook.setPublisher("Prentice Hall");

        Course course = new Course();
        course.setCourseName("Software Engineering");
        course.setInstructor(instructor);
        course.setTextbook(textbook);
        
        Instructor[] instructors = {
            new Instructor(),
            new Instructor()
        };
        instructors[0].setFirstName("Nima");
        instructors[0].setLastName("Davarpanah");
        instructors[0].setOfficeNumber("3-2636");
        instructors[1].setFirstName("Tony");
        instructors[1].setLastName("Diaz");
        instructors[1].setOfficeNumber("8-49B");
        
        Textbook[] textbooks = {
            new Textbook(),
            new Textbook()
        };
        textbooks[0].setTitle("Clean Code");
        textbooks[0].setAuthor("Robert C. Martin Series");
        textbooks[0].setPublisher("Prentice Hall");
        textbooks[1].setTitle("Computer Graphics with Open GL.");
        textbooks[1].setAuthor("Donald Hearn, Pauline Baker, Warren Carithers");
        textbooks[1].setPublisher("Pearson");
        
        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[0].setCourseName("Software Engineering");
        courses[0].setInstructor(instructors[0]);
        courses[0].setTextbook(textbooks[0]);
        courses[1] = new Course();
        courses[1].setCourseName("Computer Graphics");
        courses[1].setInstructor(instructors[1]);
        courses[1].setTextbook(textbooks[1]);
         
        System.out.println("Example 1: One course");
        System.out.println("-------------------------------");
        course.printCourse();
        System.out.println(); 
        System.out.println("Example 2: Two courses");
        System.out.println("-------------------------------");
        for (Course course12 : courses) {
            course12.printCourse();
            System.out.println(); 
        }
    }
}
