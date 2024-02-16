package aggregation;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

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

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

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

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

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
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin Series", "Prentice Hall");
        Course course = new Course("Software Engineering", instructor, textbook);
        Instructor[] instructors = {
            new Instructor("Nima", "Davarpanah", "3-2636"),
            new Instructor("Tony", "Diaz", "8-49B")
        };
        Textbook[] textbooks = {
            new Textbook("Clean Code", "Robert C. Martin Series", "Prentice Hall"),
            new Textbook("Computer Graphics with Open GL.", "Donald Hearn, Pauline Baker, Warren Carithers", "Pearson")
        };
        Course[] courses = new Course[2];
        courses[0] = new Course("Software Engineering", instructors[0], textbooks[0]);
        courses[1] = new Course("Computer Graphics", instructors[1], textbooks[1]);
         
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
