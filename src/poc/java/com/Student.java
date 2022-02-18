package poc.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student s) {
        if (id == s.getId())
            return 0;
        else if (id > s.getId())
            return 1;
        else
            return -1;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student2 = new Student(12, "BRIAN");
        Student student1 = new Student(12, "BRON");
        Student student5 = new Student(14, "Nadal");
        Student student3 = new Student(9, "Sachin");
        Student student4 = new Student(19, "Ronaldo");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
//        Collections.sort(students);
        Collections.sort(students, new NameComparator());
        System.out.println(students);
    }
}
