import java.util.Scanner;
import java.util.Random;
class Guess_the_Number{

    int count_value=0;

    public int no_of_guesses(int count)
    {
        count+=1;
        return count;
    }
    public int int_user_input()
    {
        Scanner Scan_object=new Scanner(System.in);
        return Scan_object.nextInt();
    }
    public int is_correct_output(int scan_value,int random_value)
    {

        while (scan_value!=random_value)
        {
            if (scan_value>random_value)
            {
                System.out.println("The Value is Greater than Random Value");
                count_value=no_of_guesses(count_value);
            }
            else if (scan_value<random_value)
            {
                System.out.println("The Value is Smaller than Random Value");
                count_value=no_of_guesses(count_value);
            }
            System.out.println("Enter your Number Again");
            scan_value=int_user_input();
        }
        return count_value;
    }
    public Guess_the_Number()
    {
        Random random_object=new Random();
        int random_value=random_object.nextInt(1,100);
//        System.out.println(random_value);
        System.out.println(".............Welcome to Guessing the Number Game.............\n\n" +
                " Guess The Number Between 1 to 100 here :" );
        int scanning=int_user_input();
        count_value=is_correct_output(scanning,random_value);
    }
}
public class Guess_Game
{
    public static void main(String ar[])
    {
        Guess_the_Number guess_object=new Guess_the_Number();
        System.out.println("Hurrah You Win \n\n Your score is "+(99-guess_object.count_value)+" Out Of 100");

    }
}
