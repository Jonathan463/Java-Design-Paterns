public interface Flys {

    String fly();
}

class ItFlys implements Flys{

    @Override
    public String fly() {
        return "Flying high";
    }
}

class CantFly implements Flys{

    @Override
    public String fly() {
        return "I Cant Fly";
    }
}
