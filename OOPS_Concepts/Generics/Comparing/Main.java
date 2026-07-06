package Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student amogh = new Student(22, 89.76f);
        Student sumant = new Student(23, 95.52f);
        Student arjun = new Student(24, 89.52f);
        Student aashay = new Student(25, 99.52f);
        Student harjot = new Student(26, 92.52f);
        Student nisarg = new Student(27, 79.52f);

        Student[] list = {amogh,sumant,arjun,aashay,harjot,nisarg};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2){
                return -(int)(o1.marks - o2.marks);
            }
        });
        System.out.println(Arrays.toString(list));

        // if (amogh.compareTo(sumant) < 0) {
        //     System.out.println(amogh.compareTo(sumant));
        //     System.out.println("Sumant has more marks");
        // } else if (amogh.compareTo(sumant) > 0) {
        //     System.out.println(amogh.compareTo(sumant));
        //     System.out.println("Amogh has more marks");
        // } else {
        //     System.out.println(amogh.compareTo(sumant));
        //     System.out.println("They are equal");
        // }
    }
}
