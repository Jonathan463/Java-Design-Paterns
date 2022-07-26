public class Animal {

    private String name;
    private double height;
    private double weight;
    private String sound;

    public Flys flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingType(Flys newFlyType){
        flyingType = newFlyType;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHeight(double height){
        if(height > 0){
            this.height = height;
        }
        else{
            throw new IllegalArgumentException("Weight must be bigger than 0");
        }
    }
    public double getHeight(){
        return height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getWeight(){
        return weight;
    }

    public void setSound(String sound){
        this.sound = sound;
    }
    public String getSound(){
        return sound;
    }


}
