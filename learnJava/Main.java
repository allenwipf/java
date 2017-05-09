import java.util.Scanner;

public class Main {
  public static void main(String[] args){

  	Scanner input = new Scanner(System.in);
  	Tuna tunaObject = new Tuna();

  	System.out.println("Enter of first girlfrind here: ");
  	String temp = input.nextLine();
  	tunaObject.setName(temp);
  	tunaObject.saying();

  }
}