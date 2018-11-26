package lt.bt.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

import static lt.bt.tasks.Student.getAverage;
import static lt.bt.tasks.Student.getMissedLessons;
import static lt.bt.tasks.Utils.printText;

public class TestStudent {

    public static void main(String[] args) {

        //constructor without parameters
        Student student1 = new Student();
        //printText(student1.getName());
        //printText(student1.getLastName());
        student1.setName("Matas");
        student1.setLastName("Matuoklis");
        student1.setClas("8b");
        student1.setGrades(new int[]{10, 1, 5, 8, 6, 7, 9});
        student1.setAttendance(new String[]{"b", "n", "b", "b", "p", "n", "b"});
        printText(student1.getName());
        printText(student1.getLastName());
        printText(student1.getClas());
        printText(Arrays.toString(student1.getGrades()));
        printText(Arrays.toString(student1.getAttendance()));
        printText("-------------------");

        //constructor with one parameter
        Student student2 = new Student("Dominykas");
        student2.setLastName("Dominykiavicius");
        student2.setClas("8a");
        student2.setGrades(new int[]{10, 9, 10, 8, 7, 8, 10, 10});
        student2.setAttendance(new String[]{"p", "n", "b", "b", "n", "n", "b"});
        printText(student2.getName());
        printText(student2.getLastName());
        printText(student2.getClas());
        printText(Arrays.toString(student2.getGrades()));
        printText(Arrays.toString(student2.getAttendance()));
        printText("-------------------");

        //constructor with two parameters
        Student student3 = new Student("Jokubas", "Jokubynas");
        student3.setClas("8c");
        student3.setGrades(new int[]{9, 4, 7, 10, 2, 8, 3, 8});
        student3.setAttendance(new String[]{"b", "p", "p", "n", "b", "b", "p", "b"});
        printText(student3.getName());
        printText(student3.getLastName());
        printText(student1.getClas());
        printText(Arrays.toString(student3.getGrades()));
        printText(Arrays.toString(student3.getAttendance()));
        printText("------------------- ");

        //constructors with five parameters
        Student student4 = new Student("Martynas" , "Martinkus" , "8b", new int[]{10, 5, 6, 8, 10}, new String[] {"n", "b", "p", "n", "n", "n"});
        printText(student4.getName());
        printText(student4.getLastName());
        printText(student4.getClas());
        printText(Arrays.toString(student4.getGrades()));
        printText(Arrays.toString(student4.getAttendance()));
        printText("------------------- ");

        //student1
        int average1 = getAverage(student1.getGrades());
        printText(student1.getName() + " " + student1.getLastName() + ". Pazymiu vidurkis - " + average1);
        int misslessons1 = getMissedLessons(student1.getAttendance());
        printText(student1.getName() + " " + student1.getLastName() + " praleido " + misslessons1 + " pamokas.");


        //student2
        int average2 = getAverage(student2.getGrades());
        printText(student2.getName() + " " + student2.getLastName() + ". Pazymiu vidurkis - " + average2);
        int misslessons2 = getMissedLessons(student2.getAttendance());
        printText(student2.getName() + " " + student2.getLastName() + " praleido " + misslessons2 + " pamokas.");

        //student3
        int average3 = getAverage(student3.getGrades());
        printText(student3.getName() + " " + student3.getLastName() + ". Pazymiu vidurkis - " + average3);
        int misslessons3 = getMissedLessons(student3.getAttendance());
        printText(student3.getName() + " " + student3.getLastName() + " praleido " + misslessons3 + " pamokas.");

        //student4
        int average4 = getAverage(student4.getGrades());
        printText(student4.getName() + " " + student4.getLastName() + ". Pazymiu vidurkis - " + average4);
        int misslessons4 = getMissedLessons(student4.getAttendance());
        printText(student4.getName() + " " + student4.getLastName() + " praleido " + misslessons4 + " pamokas.");


    }


}
