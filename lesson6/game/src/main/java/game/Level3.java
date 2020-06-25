package game;

public class Level3 extends Level {

    public Level3(Game game) {
        super(game);
    }

    @Override
    public void addPoint(int points) {
        game.setTotalPoints(game.getTotalPoints()+3*points);
    }


    @Override
    String getLevel() {
        return "3";
    }
}
