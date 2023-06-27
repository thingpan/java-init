package p01;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i =1;
        String s ="1";
        String s1 =i+"";//숫자를 문자로
        System.out.println(s.equals(s1));
        
        int i1 =Integer.parseInt(s1);//문자열을 숫자로
        System.out.println(i==i1);
        String str ="one";
        int i2 =Integer.parseInt(str);
        System.out.println(i2);
	}

}
