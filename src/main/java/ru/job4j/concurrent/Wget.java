package ru.job4j.concurrent;

public class Wget {
    public static void main(String[] args) throws InterruptedException {
        int index = 0;
        while (index != 101) {
            System.out.print("\rLoading : " + index  + "%");
            Thread.sleep(1000);
            index++;
        }
    }
}
