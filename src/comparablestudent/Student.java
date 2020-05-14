package comparablestudent;

/**
 * This class represents a Student in our application
 *
 * @author Paul Bonenfant
 */
public class Student implements Comparable<Student>, Cloneable {
    
    private int age;
    private String name;
    private int studentNumber;

    public Student(int age, String name, int studentNumber) {
        this.age = age;
        this.name = name;
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    @Override
    public String toString() {
    
        String format = "Student %s is %d years old and has student number %d";
        
        return String.format(format, name, age, studentNumber);
    } 
    
    @Override
    public int compareTo(Student student) {
    
        //we decided to sort by student number
        
        int returnValue;
        
        if (this.getStudentNumber() > student.getStudentNumber()) {
            returnValue = 1; // can be any positive
        } else if (this.getStudentNumber() < student.getStudentNumber()) {
            returnValue = -1; // can be any negative
        } else {
            returnValue = 0;
        }
    
        return returnValue;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        return super.clone();
    
    }

    @Override
    public boolean equals(Object obj) {
        return this.getStudentNumber() == ((Student)obj).getStudentNumber();
    }
    

}

