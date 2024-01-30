package top.jocularchao.test;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/8/25 11:49
 * @Description
 */
public class Score<S> {    // 泛型类需要使用<>，我们需要在里面添加1 - N个类型变量
    String name;
    String id;

    public S getValue() {
        return value;
    }

    public void setValue(S value) {
        this.value = value;
    }

    S value;        // S会根据使用时提供的类型自动变成对应类型

    //static T tean;  //1 静态方法中不能用

    //public void test(S s){   //2 对泛型不要用强转，不多大必要
    //    String a = (String) s;
    //}

    void test(){              //3 不能通过这个泛型变量去直接创建对象和对应的数组
        //T t = new T();
    }
    public Score(String name, String id, S value) {     //这里S可以是任意类型，但一旦确定就无法修改了
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public Score() {
    }

    public static void main(String[] args) {
        //一旦类型确定，泛型就变成对应的类型，但不影响其他对象
        Score<String> score = new Score<String>("计算机网络", "20230825", "良好");
        System.out.println(score.value);

        Score<Integer> score1 = new Score<Integer>("高数", "20230824", 91);
        System.out.println(score1.value);


        //Score<String> score2 = score1; //4 具体类型不同的泛型类变量，不能使用不同的变量进行接收

        //5 可以用通配符?来让某个变量支持引用确定了任意类型的泛型，但若使用通配符，由于类型不确定，所以说具体类型同样会变成Object
        Score<?> test = new Score<Integer>();
        test = new Score<String>();
        Object o = test.value;
    }
}
