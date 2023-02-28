
/**
 * @class: AreaAndVolume
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 27th, 2023
 * description: Create a program where the code identifies if the
 * user imput is a valid
 */
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        boolean prime= false;

        System.out.println("Please enter a integer to determine the prime number.");
        num = input.nextInt();

        for(int i=2; i <= num/ 2; ++i){
            if(num % i==0){
                prime = true;

            }
        }
        if(!prime)
            System.out.println(num+ " is a prime number.");
        else
            System.out.println(num+" is not a prime number.");

    }



}
