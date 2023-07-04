package p07;

public class SchoolExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School middleSchool=new MiddleSchool();
		middleSchool.name = "양주";
		School highSchool =new HighSchool();
		highSchool.name = "양주";
		School school =new School();
		school.name="학교";
		
	// instanceof는 객체 타입을 확인하는 연산자이다.
		
		School[] schools =new School[3];
	 schools[0]=middleSchool;
	 schools[1] =highSchool;
	 schools[2] =school;
	 for(int i=0; i<schools.length; i++) {
		 System.out.print(schools[i].name);
		 if(schools[i] instanceof MiddleSchool) {
			 MiddleSchool ms =(MiddleSchool)schools[i];
			 ms.studentType="중학교";
			 System.out.println(ms.studentType);
		 }else if(schools[i] instanceof HighSchool) {
			 HighSchool hs=(HighSchool)schools[i];
			 hs.studentType="고등학교";
			 System.out.println(hs.studentType);
			System.out.println(); 
		 }else {
			 System.out.println();
		 }
	 }
		String str1=new String("양주");
		String str2=new String("양주");
		String str3=new String("양주");
		String[] strs =new String[3];
		
		
		
	}

}
