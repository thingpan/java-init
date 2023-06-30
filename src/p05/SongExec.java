package p05;

public class SongExec {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Song[] songs =new Song[5] ;
		    		
			songs[0]=new Song();
			songs[0].name ="OMG";
			songs[0].singer="NewJeans";
			songs[0].rank =1;
			
			songs[1]=new Song();
			songs[1].name ="살짝 설렜어";
			songs[1].singer="오마이걸";
			songs[1].rank =10;
			
			songs[2]=new Song();
			songs[2].name =" I Am";
			songs[2].singer="IVE";
			songs[2].rank =20;
			
			songs[3]=new Song();
			songs[3].name ="you";
			songs[3].singer="멜로망스";
			songs[3].rank =40;
			
			songs[4]=new Song();
			songs[4].name ="손오공";
			songs[4].singer="seventeen";
			songs[4].rank =7;
			
			int max=songs[0].rank;
			 int maxIndx=0;
		    int min=songs[0].rank;
		    int minIndx=0;
	   for(int i=1; i<songs.length;i++) {
		   if(max<	songs[i].rank) {
			   max=songs[i].rank;
				maxIndx=i;
		   }
		   else {
			   if(min	>songs[i].rank) {
				   min=songs[i].rank;
					minIndx=i;
		   }
	   }
			
		}
	   System.out.println("1등:"+songs[minIndx].singer+"의"+songs[minIndx].name);	
	   System.out.println("꼴등:"+songs[maxIndx].singer+"의"+songs[maxIndx].name);
	}
}



