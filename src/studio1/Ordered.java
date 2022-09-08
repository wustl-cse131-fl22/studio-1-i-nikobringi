package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		boolean first = (y - x > 0);
		boolean second = (z - y > 0);
		boolean third = (x - y > 0);
		boolean fourth = (y - z > 0);
		boolean isOrdered = ((first && second) || (third && fourth));
		System.out.print(isOrdered);
		
	}

}
