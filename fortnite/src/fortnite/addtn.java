package fortnite;

import java.util.Scanner;

public class addtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		y=scan.nextInt();

		int add=x+y;
		System.out.println("Answer: "+add);
		
		int  sub=x-y;
		System.out.println("Answer: "+sub);

	}

}
