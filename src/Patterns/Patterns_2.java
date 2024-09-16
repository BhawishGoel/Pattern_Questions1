package Patterns;
import java.util.Scanner;
public class Patterns_2 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int row = 1;
			int star = n;
			while (row <= n) {

				// Start print

				int i = 1;
				while (i <= star) {
					System.out.print("*" + " ");
					i = i + 1;
				}
				
				row = row + 1;
				System.out.println();

			}

		}

	}