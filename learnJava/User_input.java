import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
    	Scanner allen = new Scanner(System.in);
    	double fnum, snum, answer;

    	System.out.println("Enter first num: ");
    	fnum = allen.nextDouble();

    	System.out.println("Enter second num: ");
    	snum = allen.nextDouble();

    	answer = fnum + snum;

    	System.out.println(answer);



    }
}