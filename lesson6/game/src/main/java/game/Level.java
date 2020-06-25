package game;

public abstract class Level {
    protected Game game;

    public Level(Game game) {
        this.game= game;
    }

    abstract void addPoint(int points);

    abstract String getLevel();
}
