package testArea;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    public int id;
    public String name;
    public double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Student[] studentList = new Student[n];

        for (int i = 0; i < n; i++){
            studentList[i] = new Student(in.nextInt(), in.next(), in.nextDouble());
        }

        Arrays.sort(studentList, (Student s1, Student s2) -> s1.id - s2.id);
        Arrays.sort(studentList, (Student s1, Student s2) -> s1.name.compareTo(s2.name));
        Arrays.sort(studentList, Comparator.comparingDouble(Student::getGpa).reversed());


        for (Student student : studentList) {
            System.out.println(student.name);
        }







    }
}