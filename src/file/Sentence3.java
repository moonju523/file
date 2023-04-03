package file;

import java.util.*; 

public class Sentence3 { 
	public static void main(String args[]) { 
		Scanner scanner = new Scanner(System.in);
		 
		
		HashSet<String> set = new HashSet<String>();   
		System.out.println(set);
		
		
		System.out.print("노래가사:");
        String str = scanner.nextLine(); //str 문자열준비 // 엔터까지 다 인식하는 것
        // next(); 공백 앞까지만 문자열로 받는 것
       
        String[] Arr = str.split(" ");
     // 2. 공백을 의미하는 정규식("\s")을 구분자로 문자열 split 
        
        
        System.out.println("단어: " + Arr);
        scanner.close();
		

	
	} 
  }
	
