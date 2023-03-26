package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length of rectangle?");
        double length=input.nextDouble();
        System.out.println("Enter the width of rectangle?");
        double width=input.nextDouble();
double araeOfRectangle=length*width;
System.out.println("Area of Rectangle is "+araeOfRectangle);

    }
}
