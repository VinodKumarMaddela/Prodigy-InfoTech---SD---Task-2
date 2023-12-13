import java.util.Random;
import java.util.Scanner;

public class Task2_NumberGame {

    public static void main(String args[])
    {
        Random random = new Random();
        int RandomNumber = random.nextInt(100) + 1;
        
        Scanner input = new Scanner(System.in);
        int number;
        int count1=0;
        int count2=0;
        
        
        do{
            System.out.println("Enter a value between 1-100 : ");
            number = input.nextInt();

            if(number==RandomNumber)
            {
                System.out.println("The guess is correct ");
            }
            else if(number > RandomNumber)
            {
                System.out.println("Too high");
                ++count1;
            } 
            else if(number < RandomNumber)
            {
                System.out.println("Too low");
                ++count2;
            }
        }while(number != RandomNumber);
        input.close();
        System.out.println(((count1+count2)+1)+"  Atempts");
    }
    
}
