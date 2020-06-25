package game;

public class Level2 extends Level {

    public Level2(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int points) {
        game.setTotalPoints(game.getTotalPoints()+ 2 * points);
        checkForUpgrade();
    }

    public void checkForUpgrade(){

        if (game.getTotalPoints() > 20) { // move to level 3
            Level nextLevel = new Level3(game);
            game.setLevel(nextLevel);
            game.setTotalPoints(game.getTotalPoints()+2);
        }
    }

    @Override
    String getLevel() {
        return "2";
    }
}
