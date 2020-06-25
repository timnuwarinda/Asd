package game;

import java.util.Random;

public class Game {
	private int totalPoints = 0;
//	private int level = 1;
	private Level level;

	public void play() {
		Random random = new Random();
		addPoints(random.nextInt(7));
		System.out.println("points="+totalPoints+" level="+level.getLevel());
	}

	public int addPoints(int newPoints) {

		level.addPoint(newPoints);

		return totalPoints;
	}

	public String getLevel(){
		return level.getLevel();
	}

	public void setLevel(Level lv) {
		this.level = lv;
	}

	public int getTotalPoints() {
		return totalPoints;
	}

	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
}
