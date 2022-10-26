// A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.
public class Methods
{
    public static void main( String[] args )
    {
        Greetings("Otieno", 23);
    }
    static void Greetings(String fname, int age){
        System.out.println("Hello There " + fname + " you are " + age + " years old");
    }
}