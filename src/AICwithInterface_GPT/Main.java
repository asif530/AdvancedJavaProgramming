package AICwithInterface_GPT;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void sound() {
                System.out.println("Woof");
            }
        };
        dog.sound();
    }
}
