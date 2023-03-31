package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Double radius;
        do {
            System.out.println("Enter  radius of circle");
            while (!input.hasNextDouble() ) {
                input.next();
                System.out.println("Please enter a positive double number!! ");

            }
            System.out.println("hhhhhhhh");
            radius = input.nextDouble();
            double area = Circle.getArea(radius);
            System.out.println("Area of circle is " + area);


        } while (radius < 0);


    }

}