package com.makhabatusen;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Person yana = new Person("Yana", 22, 50000);
        Person bob = new Person("Bob", 29, 48000);
        Person lena = new Person("Lena", 24, 39000);
        Person max = new Person("Max", 27, 47000);
        Person steve = new Person("Steve", 26, 41000);


        // Task 1.1 ArrayDeque

        System.out.println("\n_____Array Deque_____\n");

        ArrayDeque<Person> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(yana);
        arrayDeque.add(lena);
        arrayDeque.add(max);
        arrayDeque.add(bob);
        arrayDeque.add(bob);
        arrayDeque.add(steve);

        System.out.println("Initial list:");
        foreach(arrayDeque);

        // Task 2.1 Total Age and Total Salary
        totalAgeAndSalary(arrayDeque);

        // Task 2.2 Average Age and Average Salary
        averageAgeAndSalary(arrayDeque);

        System.out.printf("\nGet First:  %s\n", arrayDeque.getFirst().getName());
        foreach(arrayDeque);
        System.out.printf("\nGet Last:  %s\n", arrayDeque.getLast().getName());
        foreach(arrayDeque);
        System.out.printf("\nPoll first:  %s\n", Objects.requireNonNull(arrayDeque.pollFirst()).getName());
        foreach(arrayDeque);
        System.out.printf("\nPoll last:  %s\n", Objects.requireNonNull(arrayDeque.pollLast()).getName());
        foreach(arrayDeque);
        System.out.printf("\nPop:  %s\n", Objects.requireNonNull(arrayDeque.pop()).getName());
        foreach(arrayDeque);
        System.out.printf("\nRemove First Occurrence:  %s\n", arrayDeque.removeFirstOccurrence(bob));
        foreach(arrayDeque);
        System.out.printf("\nRemove Last Occurrence:  %s\n", arrayDeque.removeLastOccurrence(bob));
        foreach(arrayDeque);

        // Task 1.2 LinkedList

        System.out.println("\n_____LINKED LIST_____\n");

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(steve);
        linkedList.add(max);
        linkedList.add(lena);
        linkedList.add(bob);
        linkedList.add(bob);
        linkedList.add(yana);

        System.out.println("Initial list:");
        foreach(linkedList);
        System.out.printf("\nGet First:  %s\n", linkedList.getFirst().getName());
        foreach(linkedList);
        System.out.printf("\nGet Last:  %s\n", linkedList.getLast().getName());
        foreach(linkedList);
        System.out.printf("\nPoll first:  %s\n", Objects.requireNonNull(linkedList.pollFirst()).getName());
        foreach(linkedList);
        System.out.printf("\nPoll last:  %s\n", Objects.requireNonNull(linkedList.pollLast()).getName());
        foreach(linkedList);
        System.out.printf("\nPop:  %s\n", Objects.requireNonNull(linkedList.pop()).getName());
        foreach(linkedList);
        System.out.printf("\nRemove First Occurrence:  %s\n", linkedList.removeFirstOccurrence(bob));
        foreach(linkedList);
        System.out.printf("\nRemove Last Occurrence:  %s\n", linkedList.removeLastOccurrence(bob));
        foreach(linkedList);


    }

    private static void foreach(AbstractCollection<Person> collection) {
        for (Person person : collection) {
            System.out.println(person.getName());
        }
    }


    private static void totalAgeAndSalary(AbstractCollection<Person> collection) {
        int totalAge = 0;
        int totalSalary = 0;
        for (Person person : collection) {
            totalAge += person.getAge();
            totalSalary += person.getSalary();
        }
        System.out.printf("Total Age: %s, Total Salary: %s", totalAge, totalSalary);
    }

    private static void averageAgeAndSalary(AbstractCollection<Person> collection) {
        int totalAge = 0;
        int totalSalary = 0;
        int count = 0;
        for (Person person : collection) {
            totalAge += person.getAge();
            totalSalary += person.getSalary();
            count++;
        }
        System.out.printf("\nAverage Age: %s, Average Salary: %s\n", totalAge / count, totalSalary / count);
    }


}
