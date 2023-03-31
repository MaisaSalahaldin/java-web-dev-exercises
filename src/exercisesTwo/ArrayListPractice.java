package exercisesTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static  void main(String[] args){
        ArrayList<Integer> data=new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(6);
        data.add(7);
        data.add(8);
        data.add(9);
       data.add(10);

        int sum=sumData(data);
        System.out.println(sum);
        printWord();
        }
    public static int sumData(ArrayList<Integer> arr) {
        int total=0;
        for(int i :arr)
        {
            if(i%2==0)
                total+=i;
        }
        return total ;
    }
    public static void printWord(){
        ArrayList<String> words=new ArrayList<>();
        words.add("Maisa");
        words.add("jood");
        words.add("mayar");
        words.add("may");
        words.add("fatma");
ArrayList<String> newWords=new ArrayList<>();

        Scanner input =new Scanner(System.in);
        System.out.println("Enter the length of the word search:");
        int wordLen=input.nextInt();
        for(String word:words) {
        if(word.length()==wordLen) {
        System.out.println(word);
        }
        }
        }
    }


