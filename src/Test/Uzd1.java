package Test;
import java.util.Scanner;


public class Uzd1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] a = {{8, 5, 7, 9, 0}, {8, 5, 7, 9, 0}};
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
