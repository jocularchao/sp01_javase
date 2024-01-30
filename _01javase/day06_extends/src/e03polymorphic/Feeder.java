package e03polymorphic;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/5 11:12
 * @Description 饲养员
 * 实现 给动物 喂食
 * ***
 * 1 animal变量被定义为Animal类型，但有可能引用Dog或Cat的实例，所以有多种状态，一会变成狗一会变成猫，这就是多态的字面含义。
 * 1 java语言言允许某个类型的引用变昼引用子类的实例，而且可以对这个引用变量进行类型转换：
 *   向上转型；向下转型。
 * 2 对于父类的变量引用子类的实例
 *
 */
public class Feeder {
    public void feed(Animal animal,Food food){
        animal.eat(food);
    }

    public static void main(String[] args) {

        // 1 一个饲养员分别给一只狗、一只猫喂食
        Feeder feeder = new Feeder();

        Animal dog = new Dog();
        Food bone = new Bone();
        feeder.feed(dog, bone);

        Animal cat = new Cat();
        Food fish = new Fish();
        feeder.feed(cat, fish);

        Fish f = (Fish) fish;  //向下转型
        Food f1 = f;            //向上转型


        // 2
        //不能访问其子类的成员变量和方法，要想访问就必须强制类型转换
        Food fish1 = new Fish();
        //fish1.weight;
        ((Fish)fish1).weight=50.00;
        ((Fish)fish1).sleep();
        //fish1.sleep;
        //fish1.eat;
        //fish1.name;
        //

    }
}
