package comparablestudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * This class is to demonstrate working with Comparable 
 * and Comparator interfaces
 *
 * @author Paul Bonenfant
 */
public class ComparableStudent {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        
        ArrayList<Student> students = new ArrayList<>();
        
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter Student name (0 to quit)");
            String name = input.nextLine();
            if (name.equals("0")) {
                break;
            }
            System.out.println("Enter the student's age");
            String ageIn = input.nextLine();
            int age = Integer.parseInt(ageIn);

            System.out.println("Enter the student number");
            String numberIn = input.nextLine();
            int number = Integer.parseInt(numberIn);
            
            Student student = new Student(age, name, number);
            
            students.add(student);
            
        }
        
        // now just print them!
        for (Student student: students) {
            System.out.println(student);
        }
        
        // for testing the compareTo
//        int result = students.get(0).compareTo(students.get(1));
//        
//        System.out.println("compareTo returns " + result);

        // now we will sort the ArrayList
        // sort using the natural order, i.e. The Comparable
        students.sort(null);

        System.out.println("After the sort with null");
        
                
        // now just print them!
        for (Student student: students) {
            System.out.println(student);
        }
        
        System.out.println("Sort with a comparator");
        
        // create the comparator first using our own class
//        StudentByNameComparator nameComparator =
//                new StudentByNameComparator();
        
        // example using the static method comparing
        Comparator<Student> nameComparator =
                Comparator.comparing(Student :: getName);
        
        students.sort(nameComparator);
        
        // now just print them!
        for (Student student: students) {
            System.out.println(student);
        }

        System.out.println("Now the age Comparator");
        
        // create the comparator first
        StudentByAgeComparator ageComparator =
                new StudentByAgeComparator();
        
        students.sort(ageComparator);
        
        // now just print them!
        for (Student student: students) {
            System.out.println(student);
        }
        
        // now test out the cloning
        
        System.out.println("cloning test");
        
        Student student = (Student) students.get(0).clone();
        
        Student student2 = students.get(0);
        
        System.out.println(student.equals(students.get(0)));
        System.out.println(student == students.get(0)); // same reference?
        
        System.out.println(student2.equals(students.get(0)));
        System.out.println(student2 == students.get(0)); // same reference?
        
    }

}

