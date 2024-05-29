public class Cat extends Feline{

    @Override
    public void run() {
        super.run();
        System.out.println("I am a Cat. I run fast!");
    }

    public void eat() {
        System.out.println("I'm hungry cat");
    }
}