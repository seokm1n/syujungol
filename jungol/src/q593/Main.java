package q593;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("ASCII code =? ");
			int num = sc.nextInt();
			
			if(num<33 || num>128)
				break;
			else {
			System.out.printf("%c",num);
			}
		}
		sc.close();
	}
}