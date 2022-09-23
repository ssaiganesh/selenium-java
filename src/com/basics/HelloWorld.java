package com.basics;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        byte age=30;
        int viewsCount=213_456_789; // can use underscore in java to make number more readable
        long population= 3_123_456_789L; // for int type this number is too large. And for long type have to add L as suffix to number
        float price=10.99F; // F same reason as above. It recognises number as double type
        double weight=82.50;
        char letter = 'A'; // char is for single character
        boolean isEligible= true;
        Date now = new Date();
//        now.getTime();
        System.out.println(now);
        String practice=new String(); // new String() is redundant and it can be declared directly.
        String example=practice;
        practice= "changed";
        System.out.println("example: "+ example);
        System.out.println("Practice: "+practice);

        String test="test";
        System.out.println(age);
        age=35;
        int herage=age;
        System.out.println(age);
        System.out.println(herage);
        System.out.println(test);


        String message=" Hello World " + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.replace("!", "*")); // replaces both ! as *
        System.out.println(message.indexOf("ll")); // if character doesn't exist we get -1
        System.out.println(message.toLowerCase());
        System.out.println(message.trim());

        message= "Hello \"Ganesh\"";
        System.out.println(message);
        // Similarly:
        // \n for new line
        // \t for tab
        // \\ for slash

        int[] numbers= new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // only prints address of the array object
        System.out.println(Arrays.toString(numbers));

        int[] knownNumbers = {2,3,5,1,4};
        System.out.println(knownNumbers.length);
        Arrays.sort(knownNumbers);
        System.out.println(Arrays.toString(knownNumbers));

        int[][] matrixNumbers = new int[2][3]; // can be 3d also. int[][][] matrixNumbers = new int[2][3][5]
        matrixNumbers[0][0] = 1;
        System.out.println(Arrays.deepToString(matrixNumbers));

        int[][] knownMatrixNumbers= {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(knownMatrixNumbers));

        final float PI=3.14F; // use capital letters for constants you can't change. USing final means you cannot change the variable.

        int x = 1;
        int y = x++;
        System.out.println(x); // 2
        System.out.println(y); // 1

         x=1;
         y = ++x;
        System.out.println(x); // 2
        System.out.println(y); // 2
        // Division is / does not give decminal
        System.out.println((double)10/3); // casting the output to double

        // Implicit casting
        // byte > short > int > long > float > double
        double r = 1.1;
        double s = r + 2; // 2 an int gets casted to double automatically

        // explicit casting
        double p = 1.1;
        int h = (int)p + 2; //  explicitly casting

        String q = "1";
        int c = Integer.parseInt(q) + 2; // same for Doubel. Double.parseDouble declare output as Double

//        int result = Math.round(1.1F);
        int result = (int)Math.ceil(1.1F); // ceil for double outputs 1.2 here
        int output = (int) Math.floor(1.1F); // automatically again shows red line and suggests to cast to int like ceil
        int greaterNumber = Math.max(1,2);
        int smallerNumber = Math.min(1,2);
        double randomNumber = Math.random(); // gives value between 0 and 1
        System.out.println(randomNumber);
        int intrandomNumber = (int) Math.round(Math.random() * 100);
        int intrandomNumberWithoutRoud = (int) (Math.random() * 100);
        System.out.println(intrandomNumberWithoutRoud);
        System.out.println(intrandomNumber);

        System.out.println(result);

        // formatting numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String amount = currency.format(1231.211);
        String grades = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(amount);
        System.out.println(grades);

        Scanner sc = new Scanner(System.in);
        System.out.print("Age: ");
        byte inputAge = sc.nextByte();
        System.out.print("Name: ");
        String name = sc.nextLine().trim(); // just next only gets whatever is before firt space. Trim because nextLine insersts some space

        System.out.println("You are " + name + " and "+ inputAge + " years old");

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        boolean isWarm = temperature > 20  && temperature < 30;
        System.out.println(isWarm);
        // && || !
        // if > else if > else
        // simplify if else:
        // String classname = income > 100_000 ? "First" : "Economy"

        Scanner roleInput = new Scanner(System.in);
        String role = roleInput.nextLine().trim();

        switch (role) {
            case "admin" -> System.out.println("You are an admin");
            case "moderator" -> System.out.println("You are a moderator");
            default -> System.out.println("You are a guest");
        }


        String input = "";
        Scanner userInput = new Scanner(System.in);
        // checks condition first then checks the action
        while(true){
            System.out.print("Input: ");
            input = userInput.next().toLowerCase();
            if (!input.equals("quit"))
                break;
            System.out.println(input);

        }

        // does the action first and checks condition
        do {
            System.out.print("Input: ");
            input = userInput.next().toLowerCase();
            System.out.println(input);

        } while(!input.equals("quit"));


        String[] fruits = {"Apple", "Orange", "Pineapple"};

        for (String fruit : fruits){
            System.out.println(fruit);
        }

    }
}
