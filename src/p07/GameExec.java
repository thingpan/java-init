package p07;

public class GameExec {
	public static void runGame(Game game) {
		game.start();
		game.playing();
		game.stop();
	}
		public static void main(String[] args) {
			MapleStory maple =new MapleStory();
			maple.name="메이플 스토리";
			Starcraft sc =new Starcraft();
			sc.name ="스타그래프트";
			runGame(maple);
			runGame(sc);
			
		}
	
}
