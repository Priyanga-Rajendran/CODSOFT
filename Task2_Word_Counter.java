/* THAT FILE TEXT IS 
Hello Everone!! I am Priynaga
Computer Science and Engineering
Now I am doing Internship @CodSoft Company */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Task2_Word_Counter 
{
    public static void main(String[] args)throws IOException
    {
        FileInputStream fin=new FileInputStream("About.txt");
        Scanner fileInput=new Scanner(fin);
        ArrayList<String> words=new ArrayList<String>();
        ArrayList<Integer> count=new ArrayList<Integer>();
        int sum=0;

        while(fileInput.hasNext())
        {
            String nextWord=fileInput.next();
            if(words.contains(nextWord))
            {
                int index=words.indexOf(nextWord);
                count.set(index, count.get(index)+1);
            }
            else
            {
                words.add(nextWord);
                count.add(1);
            }
        }
       
        for(int i=0;i<words.size();i++)
       {
            System.out.println(words.get(i)+" - "+ count.get(i)+ " - times. ");
            sum=sum+count.get(i);      
        }
        if(sum==0)
        {
            System.out.println("The File is Empty!!!");
        }
        else
        {
            System.out.println("\n");
            System.out.println("Total Number of Words in a File : "+sum);
            System.out.println("\n");
        }

        fileInput.close();
        fin.close();   
    }
}
