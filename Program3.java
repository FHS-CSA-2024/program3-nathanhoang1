//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int length = 0;
        int width = 0;
        int area = 0;
        int perimeter = 0;
        
        System.out.println("Please enter the length: ");
        length = myScanner.nextInt();
        System.out.println("Please enter the width: ");
        width = myScanner.nextInt();
        
        area = length*width;
        perimeter = length+length+width+width;
        
        System.out.println("The length is: "+length);
        System.out.println("The width is: "+width);
        System.out.println();
        System.out.println("The area is: "+area);
        System.out.println("The perimeter is: "+perimeter);
    }
}

//Paste console output below:
/*
Please enter the length: 
143
Please enter the width: 
82
The length is: 143
The width is: 82

The area is: 11726
The perimeter is: 450

*/
