package p08;

public class RemocornExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Remote[]  remotes =new Remote[2];
		remotes[0]=new AirconRemocorn();
		remotes[1] =new TvRemocorn();
	    
	
		for(int i=0; i<remotes.length; i++) {
			remotes[i].on();
			if(remotes[i] instanceof AirconRemocorn ) {
				AirconRemocorn ar =(AirconRemocorn)remotes[i];
				ar.tempUp();
				ar.tempDown();
			
			}else if(remotes[i] instanceof TvRemocorn ){
				TvRemocorn r =(TvRemocorn)remotes[i];
				r.chUp();
				r.chDown();
			}
			remotes[i].off();
		}
	}	
}

