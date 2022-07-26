public class Bird extends Animal{

    public Bird(){
        super();
        setSound("Crook");

        flyingType = new ItFlys();
    }
}
