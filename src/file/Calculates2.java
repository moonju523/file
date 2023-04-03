package file;

public class Calculates2 {

	public static void main(String[] args) {
		int[][] A = {{1,0,2},{-1,3,1}};
		int[][] B = {{3,1},{2,1},{1,0}};
		int[][] C = new int[2][2];
		
		C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0]+A[0][2]*B[2][0];
		C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1]+A[0][2]*B[2][1];
		C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0]+A[1][2]*B[2][0];
		C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1]+A[1][2]*B[2][1];
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(C[i][j] + " ");//계산한 값 출력 
			}
			System.out.println();// 뛰어쓰기
		}
	}

}
