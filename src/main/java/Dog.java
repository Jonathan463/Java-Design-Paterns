public class Dog extends Animal{

    private boolean aggressive;
    private final String sound = "wooo";


    public Dog(String name, double height, double weight, boolean aggressive){
        super();
        setName(name);
        setSound(sound);
        setHeight(height);
        setWeight(weight);
        setAggressive(aggressive);



    }

    public Dog(){
        setSound(sound);
        flyingType = new CantFly();
    }

    public void setAggressive(boolean aggressive){
        this.aggressive = aggressive;
    }
    public boolean isAggressive() {
        return aggressive;
    }

    public void digHole(){
        System.out.println("Dug a hole");
    }

    public void changeVar(long randNum){
        randNum = 12;

        System.out.println("randNum in method " + randNum);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", aggression=" + isAggressive() +
                ", sound='" + getSound() + '\'' +
                '}';
    }

}
