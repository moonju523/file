package file;

import java.util.Arrays;

public class Sentence4 {
    public static void main(String[] args) {
 
        // 1. split 할 문자열 준비
        String str = "apple banana orange grape";
 
        // 2. 공백을 의미하는 정규식("\s")을 구분자로 문자열 split
        String[] strArr = str.split(" ");
 
        // 3. 결과 출력
        System.out.println(Arrays.toString(strArr));
    for(int i=0;i<strArr.length;i++) {
       System.out.println(array[i]);
     }
    }
}


