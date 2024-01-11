import java.util.Scanner;
import java.util.Random;
 public class Guess_Random_Number
 {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
       
        System.out.println("Guess a Number Between 1 to 100.");
        System.out.println("\"You hava 5 Attempts to guess the Number!!!\"");
        boolean correct=false;
        String play="yes";
        int count=0;
        while(play.equals("yes"))
        {  
             Random random=new Random();
            int Randnum=random.nextInt(100+1);
            int k=5;
            while(k>0)
            {
                int guess;
                System.out.println("Enter your Guess : \n");
                guess=scanner.nextInt();   
                if(guess==Randnum)
                {
                    System.out.println("Awsome!... you Guessed the Number!\nYou Win!!" );
                    correct=true;
                    break;
                                         
                }
                else if(guess>Randnum)
                {
                    System.out.println("Your guess is too high, Try Again !!");
                    k--;
                }
                else if(guess<Randnum)
                {
                    System.out.println("Your guess is too low, Try Again !!");
                    k--;
                }         
            }    
            if(correct==false)
            {
                System.out.println("You have used those 5 Attempts\n");
                System.out.println("you Lost!!!Better luck Next Time\n");
                System.out.println("Would you like to play again Type \"yes\" otherwise Type \"no\" : ");
                play=scanner.next().toLowerCase();
                count++;
            }       
            else{
                break;
            }
        }
        System.out.println("Total Number of Attempts taken : "+count);
        System.out.println("Thank you!!\nGood Try Dude!!!"); 
        scanner.close(); 
    }
}  
