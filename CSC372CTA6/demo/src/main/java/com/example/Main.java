package com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) 
    {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jean", "125 S jamerique dr"));
        students.add(new Student(2, "Sean", "1593 E James rd"));
        students.add(new Student(3, "Shaun", "1984 S Jimmy cir"));
        students.add(new Student(4, "Micheal", "12345 Seseame Street"));
        students.add(new Student(5, "Darius", "9675 N Atlantis rd"));

        System.out.println("Original list:");
        System.out.println(students);

        System.out.println("\nSorted by name:");
        SelectionSort.sort(students, new NameComparator());
        System.out.println(students);

        System.out.println("\nSorted by rollno");
        SelectionSort.sort(students, new RollnoComparator());
        System.out.println(students);
    }
}