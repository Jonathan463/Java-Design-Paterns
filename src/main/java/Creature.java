abstract public class Creature {


    protected boolean alive;

    public abstract void setName(String name);
    public abstract String getName();

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void setWeight(int weight);
    public abstract int getWeight();

    public abstract void setSound(String sound);
    public abstract String getSound();
}
