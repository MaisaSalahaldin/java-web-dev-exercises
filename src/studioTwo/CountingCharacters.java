package studioTwo;

import java.util.*;

public class CountingCharacters {
    public static void main(String[] args) {
        ArrayList<Character> arrayListOfChar = new ArrayList<>();

        String str = "If the product of two terms is zero then common sense says at" +
                " least one of the two terms has to be zero to start with. So if you " +
                "move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of " +
                "the equation to equal zero. Once you’ve done that," +
                " it’s pretty straightforward from there";
        char[] arrayOfChar = str.toCharArray();
        for (char v : arrayOfChar) {
            //System.out.println(v);
            arrayListOfChar.add(v);
        }
        System.out.println("----------------");
        Collections.addAll(arrayListOfChar);
        Collections.sort(arrayListOfChar);
        HashMap<Character, Integer> data = new HashMap<Character, Integer>();
char word;
        //for (char c: arrayListOfChar)
        for(int i=0;i<arrayListOfChar.size();i++){
            data.put(arrayListOfChar.get(i), Collections.frequency(arrayListOfChar,arrayListOfChar.get(i)));



        }

        for (Map.Entry<Character, Integer> c : data.entrySet()) {
            System.out.println(c.getKey()+":"+c.getValue());
        }
    }
}

