public class Cat extends Animal{

   private final String sound = "Meeww";
    public Cat(String name, double height, double weight){
        super();
        setName(name);
        setHeight(height);
        setWeight(weight);
        setSound(sound);

    }
    public Cat(){
        setSound(sound);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", height=" + getHeight() +
                ", weight=" + getWeight() +
                ", sound='" + getSound() + '\'' +
                '}';
    }

}
