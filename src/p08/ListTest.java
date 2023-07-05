package p08;

import java.util.ArrayList;

public class ListTest {
	public static void main(String[] args) {
		String str1="안녕.";
		String str2="내 소개를 ";
		String str3="하지." ;
		String str4="내 직업은 ";
		String str5="학생";
		String [] st =new String[5];
		st[0] =str1;
		st[1] =str2;
		st[2] =str3;
		st[3] =str4;
		st[4] =str5;
		for(int i=0; i<st.length; i++) {
			System.out.print(st[i]);
		}
		ArrayList<String> strList = new ArrayList<String>();
		System.out.println(strList.size());
		strList.add("1");
		System.out.println(strList.size());
		strList.add("a");
		System.out.println(strList.size());
		strList.add("2");
		System.out.println(strList.size());
		strList.add("가");
		System.out.println(strList.size());
		strList.remove(0);
		System.out.println(strList.size());
		ArrayList<Integer> intList  =new ArrayList<Integer>();
		intList.add(1);
		for(int i=0; i<str)
		
}
}
