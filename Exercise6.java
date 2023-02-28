/**
 * @class: AreaAndVolume
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 27th, 2023
 * description: Use the user input's integer to determine the sum.
 */
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,inital=0,sum=0;

        System.out.println("Please enter a integer to determine the sum.");
        num= input.nextInt();

        inital=num;



        while(num>0){
            sum= sum+ num%10;
            num=num/10;
        }
        System.out.println("Sum of digits of "+inital+" is "+sum);




    }



}
