package exercisesTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<Integer,String> students=new HashMap<>();
//        students.put(1,"Maysa");
//        students.put(2,"Mayar");
//        students.put(3,"jood");
//        students.put(4,"may");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the students info ");
        String name;


        do {
            System.out.print("Student: ");
            name = input.nextLine();

            if (!name.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, name);

                input.nextLine();
            }
        } while(!name.equals(""));

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + students.size());
    }
}
