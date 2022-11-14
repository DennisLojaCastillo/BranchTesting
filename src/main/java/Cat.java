public class Cat extends Animal {
  @Override
    public void makeSound() {
      System.out.println("Miav");
  }

  @Override
  public boolean eat(String foodType) {
    return true;
  }

  @Override
  public void showMood(boolean showMood) {
    if (true) {
      System.out.println("spinder");
    } else if (false) {
      System.out.println("hvæser");
    }
  }
}
