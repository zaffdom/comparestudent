package comparablestudent;

import java.util.Comparator;

/**
 * This class is to support sorting by age
 *
 * @author Paul Bonenfant
 */
public class StudentByAgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        
        Integer age1 = student1.getAge();
        Integer age2 = student2.getAge();
        
        int returnValue = age1.compareTo(age2); // using compareTo from Integer

//        int returnValue = age1 - age2; // in one step!
        
        return returnValue;
        
    }

}

