/**
 * Logical operators are used to combine multiple conditions.
    Let's say you wanted your program to output "Welcome!" only when the variable age is greater than 18 and the variable money is greater than 500.
    One way to accomplish this is to use nested if statements:
 */
/**public class logical_operators {
    public static void main(String[] args){
        int age = 12;
        int money = 701;
        if(age>18){
            if(money>500){
                System.out.println("Welcome");
            }else {
                System.out.println("please check you balance!!!");
            }
        }else{
            System.out.println("You are too young");
        }
    }
}
*/
/**the logical AND operator(&&)
 * the logical&& operator could be used to easen task especially where there are multiple if statements
 * */
// import java.util.Scanner;
// public class andOperator{
//      public static void main(String[] args){
//          Scanner userAge= new Scanner(System.in);
//          Scanner userName= new Scanner(System.in);
//          int age = userAge.nextInt();
//          String name= userName.nextLine();

//          if(age>=18 && name==name){
//              System.out.println("Welcome Back " + name);
//          }else if (age<18){
//              System.out.println("You are under age");
//          }else{
//              System.out.println("Please check that your name is correct");
//          }
//      }
//  }
/**
 * **************The OR Operator***********************
 * The OR operator (||) checks if any one of the conditions is true.
 * The condition becomes true, if any one of the operands evaluates to true.
 * For example:
 */
public class App{
public static void main(String[] args){
    // int age =25;
    // int money =100;
    // if(age>18 || money>=500){
    //     System.out.println("Welcome");
    //     }
    int a = 11; int b = 12;
    int c = 40;
    if (a > 100 || b > 3) {
    System.out.println(a); 
    } else {
    System.out.println(c);
    }
    //
    }
}