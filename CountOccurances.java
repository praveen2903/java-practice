//note:- for a file only one public class only should be

import java.util.Scanner;

public class CountOccurances {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the word:");
        String s=sc.nextLine();
        System.out.print("enter the letter:");
        String c=sc.nextLine();
        sc.close();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(c.equalsIgnoreCase(String.valueOf(s.charAt(i)))){
//code converts s.charAt(i) to a string using String.valueOf(s.charAt(i))
//equalsIgnoreCase method is used to compare strings, not a string and a character
                count++;
            }
        }
        if(count==0){
            System.out.println("character not available in string");
        }
        else{
            System.out.println("character "+c+" repeated "+count+" times");
        }
    }
}
