import java.util.Scanner;

public class OddandEvenplaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the statement: ");
        String p=sc.nextLine();
        sc.close();
        char[] ch=p.toCharArray();
        String odd="";
        String even="";
        for(int i=1;i<ch.length;i=i+2){
            odd+=ch[i];
        }
        System.out.println("odd places:"+odd);
        for(int i=0;i<ch.length;i+=2){
            even+=ch[i];
        }
        System.out.println("even placed:"+even);


    }
}
