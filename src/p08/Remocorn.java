package p08;

public class Remocorn implements Remote {
//Remocorn,Aircorn,Remote,Object
	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("합니다");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("끕니다");
	}
	public void chUp() {
		System.out.println("채널을 올립니다");
	}
	public void chDown() {
		System.out.println("채널을 내립니다");
	}
			
}
