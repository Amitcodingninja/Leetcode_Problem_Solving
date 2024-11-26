package JAVA8.Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample2 {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Clean Room", 3));
        tasks.add(new Task("Do Homework", 1));
        tasks.add(new Task("Write Code", 2));
        tasks.add(new Task("Play Games", 4));
        // Sort tasks by priority using Lambda

        tasks.sort((t1, t2) -> t1.getPriority() - t2.getPriority());

        System.out.println("Sorted By Priority ");
        tasks.forEach(System.out::println);

        // Sort tasks by priority using Lambda
        tasks.sort((t1, t2) -> t1.getName().compareTo(t2.getName()));
        System.out.println("\n Sorted by name");
        tasks.forEach(System.out::println);
    }
}

class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;

    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }
}
