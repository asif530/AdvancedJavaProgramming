package AICwithClass_GPT;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(){
            @Override
            public void introduce(){
                System.out.println("Good day");
            }
        };
        person.introduce();
    }
}
