import java.util.Scanner;

public class Corn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
			System.out.println("Please enter 8 intergers");
		int [] movies = new int [8];
		for(int a = 0; a<movies.length; a++){
		
			movies[a] = scan.nextInt();
			System.out.println("Please enter 8 intergers" + movies[a]);
		}
		
	int sum = 0;
	for(int b = 0; b<movies.length; b++){
		sum = (sum + movies[b]);
		
	}
	int average = (sum / movies.length );
	
	System.out.println("The average of the value is " + average);	
		
	}

}
