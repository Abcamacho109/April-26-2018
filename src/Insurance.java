import java.util.Scanner;

public class Insurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan = new Scanner (System.in);
System.out.println("Please enter Your Age");
int age  = scan.nextInt();
System.out.println("Please enter your weight 8 ");
int weight = scan.nextInt();
System.out.println("Please enter your income ");
int income = scan.nextInt();
 if(age<18 ){
	 System.out.println("Your are in minor catergory");
 }else if(age>18 && age<38 && weight<200){
	 System.out.println("Your are in the healthy catergory");
 }else if(age>38 && age<58 && income>50000){
	 System.out.println("Your are in the low risk catergory");
 }else if(age>58){
	 System.out.println("You are in the high risk catergory");
 }

	}

}
