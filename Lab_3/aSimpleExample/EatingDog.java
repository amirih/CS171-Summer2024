package Lab_3.aSimpleExample;

// Make Dog implement Eater
class EatingDog extends Dog implements Eater {
    @Override
    public void eat(String food) {
        System.out.println("The dog eats " + food);
    }
}