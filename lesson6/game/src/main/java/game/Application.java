package game;

public class Application {

	public static void main(String[] args) {
		Game game = new Game();
		game.setLevel(new Level1(game));
		game.play();
		game.play();
		game.play();
		game.play();
		game.play();

	}

}
