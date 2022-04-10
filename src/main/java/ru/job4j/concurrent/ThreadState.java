package ru.job4j.concurrent;

public class ThreadState {
    public static void main(String[] args) {
        Thread first = new Thread(
                () -> {}
        );
        Thread second = new Thread(
                () -> {}
        );
        System.out.println(first.getState());
        System.out.println(second.getState());
        first.start();
        second.start();
        System.out.println("first: " + first.getState());
        System.out.println("second: " + second.getState());
        while (first.getState() != Thread.State.TERMINATED
                && second.getState() != Thread.State.TERMINATED) {
            System.out.println(first.getState());
            System.out.println(second.getState());
        }
        System.out.println("work done");
    }
}