package file;

public class Calculates3 {

	public static void main(String[] args) {
		int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] B = {{2,4,6},{8,10,12},{14,16,18}};
		int[][] C = new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			C[i][j] = A[i][j] + B[i][j];// 계산 
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(C[i][j] + " ");//계산한 값 출력 
			}
			System.out.println();// 뛰어쓰기
		}
		
	}
}