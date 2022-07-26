public interface Living {

    void setName(String newName);
    String getName();

    void setHeight(int height);
    int getHeight();

    default void trySomething(){
        System.out.println("Trying to make a method with body in interface");
    }
    static void trySomething2(){
        System.out.println("Trying to make a method with body in interface");
    }

}
