package p01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str ="1234567890";
           //참조형 new
           //str 배열
           // = :값이 같은지 다른지 비교
           // 주솟값과 상관없이 문자열의 일치여부를 확인하는 방식으로 equals=String
           //String 타입은 replace()함수로 특정 문자열을 다른 문자열로 변환할 수 있습니다.
       char c=str.charAt(5);
       System.out.println(c);
       
       String s1 ="1";
       String s2 ="1";
       System.out.print(s1==s2);
       
       String s3 =new String("1");
       System.out.println(s1 == s3);
       String s4 =new String("1");
       System.out.println(s3 == s4);
       System.out.println(s3.equals(s4));
       
       int idx =str.indexOf("3");
       System.out.println(idx);
       int idx2 =str.indexOf("6");
       System.out.println(idx2);
       String str2=str.substring(idx);
      System.out.println(str2);
      str2 =str.substring(idx,idx2);
      System.out.println(str2);
      str2 =str.replace("1", "one");
      System.out.println(str2);
      
      String name ="park";
      name =name.toUpperCase();
      System.out.println(name);
      name =name.toLowerCase();
      System.out.println(name);
       
	}

}
