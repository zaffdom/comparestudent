package comparablestudent;

import java.util.Comparator;

/**
 * This class is to provide comparison by name support
 *
 * @author Paul Bonenfant
 */
public class StudentByNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
     
        // get the names of the students
        String name1 = student1.getName();
        String name2 = student2.getName();
        
        // use the String's compareTo method
        int returnValue = name1.compareTo(name2);
        
        return returnValue;
        
    }
}

