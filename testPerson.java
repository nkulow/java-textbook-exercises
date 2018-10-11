import java.util.GregorianCalendar;

class Person{
    private String name;
    private String address;
    private String phone;
    private String email;

    //default person
    public Person() {
        this("null", "null", "null", "null");
    }

    public Person(String name, String address, String phone, String email) {
            this.name = name;
            this.address = address;
            this.phone = phone;
            this.email = email;
    }
    // methods to return data fields
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}

    //methods to set new data fields
    public void setName(String name) {this.name = name;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail(String email) {this.email = email;}

    // string description of the class
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phone + "\nEmail address: " + email;
    }
}


class Student
    extends Person{
        private int status;
    public final static int freshman = 1;
    public final static int sophomore = 3;
    public final static int junior = 2;
    public final static int senior = 4;

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }
    // method to set new status
    public void setStatus(int status) {this.status = status;}

    //method to return status
    public String getStatus(){
        switch (status) {
            case 1 : return "freshman";
            case 2 : return "sophomore";
            case 3 : return "junior";
            case 4 : return "senior";
            default : return "Unknown";
        }
    }
    // string description of student
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}


class Employee
    extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    //construct employee

}
class Faculty
    extends Employee {

    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    // Return rank
    public String getRank() {
        return rank;
    }

    // Set new rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    /// Return a string discription of the Faculty
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
class Staff
    extends Employee {
    private String title;

    //constructors
    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }
    //return title
    public String getTitle() {return title;}
    // set new title
    public void setTitle(String title) {this.title = title;}

    //string description of staff
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
// MyDate class from the textbook
class MyDate {
    // Data Fields
    private int year;
    private int month;
    private int day;

    /** Creates a MyDate object for the current date */
    MyDate() {
        GregorianCalendar calander = new GregorianCalendar();
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }

    /** Creates a MyDate object with a specified elapsed time
     *	 since midnight, January 1, 1970, in milliseconds */
    MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    /** Creates a MyDate object with the
     *   specified year, month, and day */
    MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /** Return year */
    public int getYear() {
        return year;
    }

    /** Return month */
    public String getMonth() {
        String m = String.valueOf(month + 1);
        return (month < 10 ? "0" + m : m);
    }

    /** Return day */
    public String getDay() {
        String d = String.valueOf(day);
        return (day < 10 ? "0" + d : d);
    }

    /** Sets a new date for the object using the elapsed time */
    public void setDate(long elapsedTime) {
        GregorianCalendar calander = new GregorianCalendar();
        calander.setTimeInMillis(elapsedTime);
        year = calander.get(GregorianCalendar.YEAR);
        month = calander.get(GregorianCalendar.MONTH);
        day = calander.get(GregorianCalendar.DAY_OF_MONTH);
    }
}


public class testPerson {
    public static void main(String[] args) {
        // Create a Person, Student, Employee, Faculty, and Staff objects
        Person person = new Person("John", "12 Bell street",
                "3473339999", "john12@aol.com");

        Student student = new Student("Mary", "100 Town Ave", "5149993333",
                "mary100@aol.com", Student.freshman);

        Employee employee = new Employee("Mike", "34 West street", "6189999999", "mike80@aol.com", 910, 60000);

        Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
                "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

        Staff staff = new Staff("Tom", "90 Country road", "2030000000",
                "tomcat@aol.com", 12, 65000, "Executive Assistant");

        // Invoke toString of Person, Student, Employee, Faculty and Staff
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
}


