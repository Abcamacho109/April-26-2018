import java.util.Scanner;

public class Moon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);
System.out.println("Please enter 5 numbers");
int [] moves = new int [5];
for(int a = 0; a<moves.length; a++){
moves[a] = scan.nextInt();	
	

if(moves[a] % 2 ==0){
	
	System.out.println("These are the even numbers "+ moves[a]);
}


else{
	System.out.println("The numbers are odd");
}
	}
	}
}