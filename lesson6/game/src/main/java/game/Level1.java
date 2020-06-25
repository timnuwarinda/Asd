package game;

public class Level1 extends Level {

    public Level1(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int points) {
        game.setTotalPoints(game.getTotalPoints()+points);
        checkForUpgrade();
    }

    public void checkForUpgrade(){

        if (game.getTotalPoints() > 10) { // move to level 2
            Level nextLevel = new Level2(game);
            game.setLevel(nextLevel);
            game.setTotalPoints(game.getTotalPoints()+1);
        }
    }

    @Override
    String getLevel() {
        return "1";
    }
}
