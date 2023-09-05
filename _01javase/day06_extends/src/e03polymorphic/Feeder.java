package e03polymorphic;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/5 11:12
 * @Description 饲养员
 */
public class Feeder {
    public void feed(Animal animal,Food food){
        animal.eat(food);
    }

    public static void main(String[] args) {
        Feeder feeder = new Feeder();

        Animal dog = new Dog();
        Food bone = new Bone();
        feeder.feed(dog, bone);

        Animal cat = new Cat();
        Food fish = new Fish();
        feeder.feed(cat, fish);

    }
}
