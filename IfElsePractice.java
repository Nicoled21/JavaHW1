import java.util.*;
public class Grade {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         int bottomLine = 60;
         System.out.println("What is your grade");
         int numGrade = input.nextInt();
         if(bottomLine <= numGrade){ //60 <= 60 or 61
           System.out.println("You passed!");
         } else {
             System.out.println("Take the class again");
         }
    }
}


