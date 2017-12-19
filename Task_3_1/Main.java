package JAVA.Task_3_1;

//import java.util.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введіть будь-яке ціле число від 1 до 10: ");
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int num1= scan1.nextInt();
        int num2 = scan2.nextInt();

        Add add1 = new Add();
        int i = add1.add(num1,num2);
        System.out.println("add=" +i);

        Subtract sub1 = new Subtract();
        int j = sub1.subtract(num1,num2);
        System.out.println("subtract=" +j);

        Divide div1 = new Divide();
        int k = div1.divide(num1,num2);
        System.out.println("divide=" +k);
    }






}
