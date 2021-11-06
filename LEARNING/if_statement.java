// The below checks at the user age, if the user is not above 18 it prints "Too young for the Application" out and else prints "Authentification a success"
// import java.util.Scanner;
// public class userAge{
//     public static void main(String[] args){
//         Scanner inputAge = new Scanner(System.in);
//         int age = inputAge.nextInt();
//         //the if statement
//         if(age<=18){
//             System.out.println("Too young for the Application");
//         }else{
//             System.out.println("Authentification a success");
//         }
//     }
// }

//---------------------Started solving the Quiz Below------------------------------
/**
 * Conditional Statements
Students can apply for a scholarship if their average grade is higher than 3.5.
Write a program that prints “Congratulations” if the student meets the average grade requirement, and “Sorry” if not.

Sample Input:
2.9

Sample Output:
Sorry
 */
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double score = scanner.nextDouble();
       // your code goes here
       if (score>3.5){
           System.out.println("Congratulations");

       }else{
           System.out.println("Sorry");
       }
   }
}