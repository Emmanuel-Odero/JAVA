/**
 * To have user input data in java we use the Scanner object
 * --in order ti=o use the scanner class, we have to create an instance by using the instace as shown below
 * ---Scanner myVar = new Scanner(system.in)
 * There diffrent methods to read the user input data, exaples are:
 * To read byte = nextByte()
 * To read a short = nextShort()
 * To read an int = nextInt()
 *To read long = nextLong() 
 * To read a float = nextFloat()
 * To read double = nextDoule()
 * To read boolean = nexyBoolean
 * To read a complete line = nextLine()
 * To read a word = next()
 */

 //The below program is test one of the scannet class
/*import java.util.Scanner;
class Myclass{
    public static void main(String[ ]args){
        Scanner myVar=new Scanner(System.in);
        System.out.println("The input value is /"+ myVar.next()+ "/");
    }
}*/


// The below program ask a user to input their name and then displays the name on the screen
import java.util.Scanner;
class usetInput {
    public static void main(String[] args){
        Scanner myVar = new Scanner(System.in);
        System.out.println(myVar.nextline("Your name is " + myVar));
    }
}