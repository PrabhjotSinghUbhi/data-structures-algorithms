package com.prabhjot.java.core.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class MyComparator implements Comparator<Integer> {
//
//    @Override
//    public int compare(Integer o1, Integer o2) {
//        return o2 - o1;
//    }
//
//}

class Student {
    private String name;
    private float gpa;

    Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}

/*
- ArrayList extends the List interface.
    - main feature:
        - Dynamic Size
- it used arrays internally.
 */
public class Main {
    public static void main(String[] args) {
        /*
            To create a simple ArrayList -
                - ArrayList<Integer> list = new ArrayList<>();
                - List<Integer> list = new ArrayList<>();

            Arraylist can also be created from different methods-
                - List.of("Mongo", "Cherry", "Banana"); -> creates unmodifiable list.
                - Arrays.asList(1, 2, 3, 4, 5); -> creates a list.

            Constructor-
                - either accepts Initial Capacity
                - or another collection

            Initial Capacity - 10
         */

        ArrayList<Integer> list = new ArrayList<>();

        /*
            Methods in arraylist-
                Adding elements-
                    - add(element) => adds element to the end of the list.
                    - add(index, element) => adds element to that specific index and moves to other element to right.
                    - set(index, element) => replaces the element to the element at that index.
                    - addAll(collection) => adds the entire collection to the end of the list.
                    - addAll(element,collection) => adds the entire collection to that index of the list.

                Deleting elements-
                    - remove(index) => removes the element at that index.
                    - remove(element) => removes the first occurrence of that element.
                    *- remove(Integer.valueOf(element)) => in case you want to delete a first occurrence of that element, but it is an Integer.
                    - list.removeAll(collections) => removes all the element in list that are in collection.
                    - removeIf(Predicate()) => remove based on a condition.

                To check whether a specific element is present in the list or not
                    - contains(element)

                Convert ArrayList into Array
                    - list.toArray()

                Sort the list
                    - collections.sort(list)
                    - List.sort(list)
                    - ArrayList.sort(list)
                    *- list.sort(null)
         */

        list.add(2);
        list.add(5);
        list.add(8);
        System.out.println(list);

        list.add(2, 87);
        System.out.println(list);


        list.set(2, 90);
        System.out.println(list);

        List<Integer> list2 = List.of(5, 6, 7, 8);
        list.addAll(list2);
        System.out.println(list);

        list.remove(list.size() - 1);
        System.out.println(list);

        list.remove(Integer.valueOf(90));
        System.out.println(list);

        System.out.println(list.contains(90));

        list.sort(null);
        System.out.println(list);

        // lambda expression used for comparing
        list.sort((a, b) -> b - a);
        System.out.println(list);

        Student s1 = new Student("Alice", 3.4f);
        Student s2 = new Student("Charlie", 3.1f);
        Student s3 = new Student("Tommy", 2.8f);
        Student s4 = new Student("John", 4.8f);
        Student s5 = new Student("Johnny", 4.8f);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //sort them using a custom comparator.
//        students.sort((o1, o2) -> {
//            if (Float.compare(o1.getGpa(), o2.getGpa()) == 0) {
//                return o2.getName().compareTo(o1.getName());
//            } else {
//                return -Float.compare(o1.getGpa(), o2.getGpa());
//            }
//        });

        // we can also use comparator class.
        Comparator<Student> comparator = Comparator
                .comparing(Student::getGpa)
                .reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);

        for (Student s : students) {
            System.out.println(s.getName() + " :  " + s.getGpa());
        }

    }
}
