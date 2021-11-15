//The above code asks for salary1 and salary2, prints the two and the sum of the same
/*import java.util.Scanner;
public class Main {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       //get salaries
       int salary1 = scanner.nextInt();
       int salary2 = scanner.nextInt();
       //your code goes here
       System.out.println(salary1+salary2);

   }
}*/
//below is the divisio operator and the int data type the results are 3
//If you replace the result data type with double the rsults will be 3.0
/*public class Main{
    public static void main(String[ ] args){
        // get inputs
        int x=15; int y=4;
        //Calculate the results
        int result= x/5;
        //output the results
        System.out.println(result);
    }
}*/
//Working with the ModuloZ(remainder) Operator %
/*class modulo{
    public static void main(String[] args){
        int value =23;
        int res =value % 6;
        System.out.println(res);
    }
}*/

//below is program that takes in distance in meters and outputs it as kilometers on the screen
/*import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       int distance = read.nextInt();
       //complete the code
       int km = distance/1000;
       int meters = distance % 1000;
       System.out.println(km);
       System.out.println(meters);
   }
}*/


/**
 * Students are given homework in math, history, and geometry.
Write a program that takes the time spent on each subject as input, and calculates and outputs the total number of hours and minutes spent on each subject, each on a new line accordingly.

---Sample Input
35
40
39

---Sample Output
1
54
Explanation
The total amount of spent minutes is 114, which is equal to 1 hour (the first output) and 54 minutes (the second output).
 ---Soution to the above is as follows(as below)
*/
// import java.util.Scanner;
// public class Main{
//     public static void main (String[] args){
//     Scanner sca = new Scanner(System.in);
//     int math = sca.nextInt();
//     int history = sca.nextInt();
//     int geometry = sca.nextInt();
//     //The magic code goes here
//     int hrs = 60;//60 minutes is equal to 1 hr but we prefer putting the 60 to 1 to help in our conversion
//     int totalTime = math+history+geometry;
//     System.out.println(totalTime/hrs);
//     System.out.println(totalTime%hrs);
//     //System.out.println(geometry/hrs);
//     }
// }
import java.util.Scanner;
public class math{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        //your code goes here
		int oneDay = 86400; //number of seconds in a days
		int totaSec = days*oneDay;
		System.out.println(totaSec);

    }
}