// program to compute two numbers inputted from users

import java.util.Scanner;
class sum_number{
    public static void main(String[] args) {

       Scanner input_num = new Scanner(System.in);

       // Speciying type of number input
       double fnum, snum, answer;
       
       System.out.println("Enter the first number: ");
       fnum = input_num.nextDouble();

       System.out.println("Enter the second number: ");
       snum = input_num.nextDouble();

       answer = fnum + snum;

       System.out.println(answer);

    }
}