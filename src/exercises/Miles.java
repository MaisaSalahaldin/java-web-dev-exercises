package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven?");
        double numOfMiles=input.nextDouble();
        System.out.println("Enter amount of gas they’ve consumed (in gallons) ?");
        double amountOfGas=input.nextDouble();
        double result=numOfMiles/amountOfGas;
        System.out.println("miles-per-gallon is :"+result);
    }
}
