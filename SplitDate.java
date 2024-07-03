import java.util.Scanner;

public class SplitDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String splitDate=sc.nextLine();
        String[] s=splitDate.split("/");
        int date=Integer.parseInt(s[0]);
        int month=Integer.parseInt(s[1]);
        int year=Integer.parseInt(s[2]);
        System.out.println(date+":"+month+":"+year);
    }
}
