package exercises;

import java.util.Scanner;

public class SerchingString {
    public static void main(String[] args){
        String firstSentence="Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had peeped " +
                "into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a word to search!");
        String searchTerm=input.next();
        Integer index=firstSentence.indexOf(searchTerm);
        Integer length=searchTerm.length();
        if(firstSentence.toLowerCase().contains(searchTerm.toLowerCase())){
            System.out.println(" true,it's inside the sentence");
        }
        else
        {
            System.out.println(" false,it's not inside the sentence");

    }
        System.out.println("The word "+searchTerm+" in index of "+index+" and it's length is "+length);
    }
}
