package top.jocularchao.e01class_superclass_subclass;

public class Student extends People{
    private long id = 123456789L;

    public Student() {
    }

    public Student(String name,int age,long id) {
        //super必须是第一条语句
        super(name,age);
        this.id = id;
    }
    public String getName(){
        return "s "+super.getName();
    }

    /**
       独有的行为
     */
    public void study(){
        System.out.println(getName() + "学生开始学习~~~~~");
    }
}
