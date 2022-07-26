public class Main {
    public static void main(String args []){
//        Dog dog = new Dog("value",4.5, 40, "bark", true);
//        System.out.println();
//        dog.setName("UvuNni");
//        //dog.setHeight(0);
//        System.out.println(dog);

//        System.out.println("***********CAT**********");
//        Cat cat = new Cat("Rossie", 2.3, 30, "Meow");
//        System.out.println(cat);

//        long randNum = 10;
//        dog.changeVar(randNum);

//        Animal doggy = new Dog();
//        Animal kitty = new Cat();
//
//        Animal[] animals = new Animal[4];
//        animals[0] = doggy;
//        animals[1] = kitty;
//
//        System.out.println("Doggy says: " + animals[0].getSound());
//      System.out.println("Doggy says: " + animals[1].getSound());
//        ((Dog)doggy).digHole();
//
//        speakAnimal(kitty);


//        System.out.println("Doggy says: " + doggy.getSound());
//        System.out.println("Kitty says: " + kitty.getSound());
//        System.out.println("randNum after method call " + randNum);

//        Giraffe giraffe = new Giraffe();
//        giraffe.setName("Tallest");
//        giraffe.setAlive(true);
//
//        System.out.println("Giraffe name is " +giraffe.getName());
//        System.out.println("Is Giraffe alive " +giraffe.isAlive());

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog "+ sparky.tryToFly());
        System.out.println("Bird "+ tweety.tryToFly());

        sparky.setFlyingType(new CantFly());
        System.out.println("Dog "+sparky.tryToFly());
    }

    private static void speakAnimal(Animal doggy) {
        System.out.println("Animal says " + doggy.getSound());
    }


}
