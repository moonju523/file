package file;

import java.util.Scanner;

public class Calculates {

	public static void main(String[] args) {
		// 행렬의 곱을 계산하는 프로그램
		int[][] matA = new int[3][2];
		int[][] transA = new int[2][3];
		        
		Scanner scan = new Scanner(System.in);
		
		

		for(int i=0;i<matA.length;i++){
		    for(int j=0;j<matA[0].length;j++){
		        matA[i][j] = scan.nextInt();
		        transA[j][i] = matA[i][j];
		    }
		}
		        
		System.out.println("A Matrix: ");
		for(int i=0;i<matA.length;i++){
		    for(int j=0;j<matA[0].length;j++)
		        System.out.print(matA[i][j]+" ");
		    System.out.println();
		}
		        
		System.out.println("Transposed A: ");
		for(int i=0;i<transA.length;i++){
		    for(int j=0;j<transA[0].length;j++)
		        System.out.print(transA[i][j]+" ");
		    System.out.println();
		}
	}
}

