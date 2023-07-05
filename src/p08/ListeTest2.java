package p08;

import java.util.ArrayList;

public class ListeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] fls = new float[3];
		fls[0] = 1.1f;
		fls[1] = 22.1f;
		fls[2] = 0.1111f;

		char[] chars = new char[3];
		chars[0] = 'a';
		chars[1] = 'b';
		chars[2] = 'd';

		String[] strs = new String[3];
		strs[0] = "유리";
		strs[1] = "모두";
		strs[2] = "화이팅";

		ArrayList<Float> fl = new ArrayList<Float>();
		fl.add(1.1f);
		fl.add(12.1f);
		fl.add(0.1111f);

		ArrayList<Character> f2 = new ArrayList<Character>();
		f2.add('a');
		f2.add('b');
		f2.add('c');
		
		ArrayList<String> f3 = new ArrayList<String>();
		f3.add("우리");
		f3.add("모두");
		f3.add("화이팅");
		for(int i=0; i<fl.size();i++ ) {
			System.out.println(fl.get(i));
		}
		for(int i=0; i<f2.size(); i++) {
			System.out.println(f2.get(i));
		}
		for(int i=0; i<f3.size(); i++) {
			System.out.println(f3.get(i));
		}
		
		
	
	

	}

}
