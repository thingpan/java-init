package p07;

class Song{
	public int rank;
	public String title;
	
	public void printTitle() {
		System.out.println("노래 제목 :"+title);
	}
}

public class SonExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Son s =new Son(); 
			s.name ="동동";
			s.job ="개발자";
			s.age=30;
			s.hobby="게임";
			Father f = new Son();
			f.name="같은거임";
			Son s2 =(Son)f;
			s2.hobby="투자";
			System.out.print(s2.name);
			//Song song =new Song();
	}

}
