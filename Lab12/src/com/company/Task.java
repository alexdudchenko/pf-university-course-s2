package com.company;

import com.company.model.Abitur;
import com.company.model.Faculty;
import com.company.model.Student;
import com.company.model.University;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Task {

    public static void main(String[] args) {

        LinkedList<Abitur> abiturients = formAbiturients(new LinkedList<>());
        University university = formUniversity(new University("KPI"));
        Task task = new Task();

        task.task1(abiturients, 4);
        System.out.println("---");
        task.task2(university);
        System.out.println("---");
        task.task3(abiturients);
    }

    public void task1(LinkedList<Abitur> list, int skip) {
        list.stream()
                .filter(x -> x.getScore() > 60) //отримуємо список аб. з балом більше 60
                .sorted((x,y)-> -Integer.compare(x.getScore(),y.getScore())) //сортуємо за зростанням
                .skip(skip)
                /*.sorted(Comparator.comparing(Abitur::getName))*/ //сортуємо за алфавітом
                .forEach(System.out::println); // виводимо результат
    }

    public void task2(University university) {

        double middleScore = university.getList().stream()
                .flatMap(x -> x.getList().stream())
                .mapToInt(Student::getMiddleScore)
                .average()
                .orElse(0);

        System.out.println("Middle score = " + middleScore);

        List<Student> topStudents;
        topStudents = university.getList().stream()
                .flatMap(x -> x.getList().stream())
                .filter(x -> x.getMiddleScore() > middleScore)
                .collect(Collectors.toList());

        topStudents.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

    }
    public void task3(LinkedList<Abitur> list) {
        list.stream()
                .filter(x -> x.getScore() <= 60)
                .sorted(Comparator.comparing(Abitur::getName))
                .forEach(System.out::println);
    }


    public static LinkedList<Abitur> formAbiturients(LinkedList<Abitur> abitura){
        abitura.add(new Abitur("Ivanov",54));
        abitura.add(new Abitur("Petrov",66));
        abitura.add(new Abitur("Sidorova",67));
        abitura.add(new Abitur("Krasko",59));
        abitura.add(new Abitur("Kirilenko",93));
        abitura.add(new Abitur("Shevchenko",84));
        abitura.add(new Abitur("Miroshnik",72));
        abitura.add(new Abitur("Anufrieva",63));
        abitura.add(new Abitur("Todorischin",100));

        return abitura;
    }

    public static University formUniversity(University univer){

        Faculty faculty1 = new Faculty("FICT");
        Faculty faculty2 = new Faculty("notFICT");

        Student student1 = new Student("Alexander", "Dudchenko",1672, 97);
        Student student2 = new Student("Marina", "Tsukanova",4306, 95);
        Student student3 = new Student("Ivan", "Bublik",5823, 78);
        Student student4 = new Student("Irina", "Loik",1845, 85);
        Student student5 = new Student("Alena", "Kirilenko",2345, 91);
        Student student6 = new Student("Artem", "Turov",5720, 83);

        univer.getList().add(faculty1);
        univer.getList().add(faculty2);

        faculty1.getList().add(student1);
        faculty1.getList().add(student2);
        faculty1.getList().add(student3);
        faculty2.getList().add(student4);
        faculty2.getList().add(student5);
        faculty2.getList().add(student6);

        return univer;
    }
}
