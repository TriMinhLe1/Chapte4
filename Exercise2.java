/**
 * @class: AreaAndVolume
 * @author: Tri M. Le
 * @course: ITEC 2140 - 05
 * @version: 1.1;
 * @date: February 27th, 2023
 * description: Create a program where it calculates the average
 * of
 */
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float grade,average=0,loop=0;

        System.out.println("Please enter a grade.");
        grade= input.nextFloat();

        while(grade>=0){
        average+=grade;
        loop++;
        System.out.println("Good, now please enter another grade. Once finished, please enter a negative number to start the calculations.");
        grade= input.nextFloat();
        }

        average/=loop;

        System.out.println("The average grades is "+average);



    }



}
