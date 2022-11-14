public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Vuf");
    }
    @Override
    public boolean eat(String foodType){
        return true;
    }
    @Override
    public void showMood(boolean showMood) {
        if (true) {
            System.out.println("logrer");
        } else if (false) {
            System.out.println("Knurre");
        }
    }
}
