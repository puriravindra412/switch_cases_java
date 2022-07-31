import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            String fruits = sc.next();
            switch (fruits){
                case "mango"->System.out.println("king of fruits");
                case "Apple"->System.out.println("Sweet red fruit");
                case "orange"->System.out.println("sweet and sour fruit");
                case "grapes"->System.out.println("small round fruits");


            }

    }
}