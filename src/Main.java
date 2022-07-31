/*
switch case: Use the switch statement to select one of many code blocks to be executed

switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
             //input 
            Scanner sc= new Scanner(System.in);
            String fruits = sc.next();
            //start switch
            switch (fruits){
                case "mango"->System.out.println("king of fruits");
                case "Apple"->System.out.println("Sweet red fruit");
                case "orange"->System.out.println("sweet and sour fruit");
                case "grapes"->System.out.println("small round fruits");


            }
           //end switch

    }
}
