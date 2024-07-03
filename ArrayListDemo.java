//Anagram checking for 2 strings

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        sc.close();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        //arraylist or anything can add only the arrays or character arrays or string of words
        ArrayList<Character> a1=new ArrayList<>();
        ArrayList<Character> a2=new ArrayList<>();
        for(char c: c1){
            a1.add(c);
        }
        for(char c: c2){
            a2.add(c);
        }
        a1.sort(null);
        a2.sort(null);
        if(a1.equals(a2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }

    }
}
