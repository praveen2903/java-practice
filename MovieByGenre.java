import java.util.Scanner;

public class MovieByGenre {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Movie[] m=new Movie[4];
        for(int i=0; i<m.length;i++){
            String name=sc.nextLine();
            String company=sc.nextLine();
            String genre=sc.nextLine();
            int budget=sc.nextInt();sc.nextLine();
            m[i]=new Movie(name,company,genre,budget);
        }
        String g=sc.nextLine();
        sc.close();
        Movie x=getMovieByGenre(m,g);
        if(x==null){
            System.out.println("done");
        }
        else{
            System.out.println(x.getType());
        }
    }
    public static Movie getMovieByGenre(Movie[] m,String genre){
        for(int i=0;i<m.length;i++){
            if(m[i].getGenre().equalsIgnoreCase(genre)){
                if(m[i].getBudget()>80000000){
                    m[i].setType("High Budget");
                }
                else{
                    m[i].setType("Low Budget");
                }
                return m[i];
            }
        }
        return null;
    }
    
}
class Movie{
    private String name,company,genre,type;
    private int budget;
    Movie(String name,String company,String genre,int budget){
        this.name=name;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }
    String getName(){
        return name;
    }
    String getCompany(){
        return company;
    }
    String getGenre(){
        return genre;
    }
    int getBudget(){
        return budget;
    }
    void setType(String type){
        this.type=type;
    }
    String getType(){
        return this.type;
    }
}