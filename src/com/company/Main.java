package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int age = generateRandomAge();//random number
        temperature(15, 10);
        temperature(age, 50);
    }

    public static String temperature(int age, int temperature) {
        String result = "";
        if (age > 20 && age < 45 && temperature > 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature <= 28) {
            System.out.println("Можно идти гулять ");
        } else if (age > 45 && temperature < 25) {
            System.out.println("Можно идти гулять ");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return result;
    }



    private static int generateRandomAge() {
        Random num = new Random();
        int age = num.nextInt(50);
        System.out.println(age);
        return age;
    }
}
