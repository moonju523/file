package file;

public class Split {
	 
	public static void main(String[] args) {
		String str1 = "일과 놀이 사이에는 경계가 없다.";
		String[] words = str1.split("\\s");
		
		for (String wo : words ){
			System.out.println(wo);
		}
	}
}
