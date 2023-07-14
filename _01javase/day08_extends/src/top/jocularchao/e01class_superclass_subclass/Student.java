package top.jocularchao.e01class_superclass_subclass;

public class Student extends People{
    /**
       独有的行为
     */
    public void study(){
        System.out.println(getName() + "学生开始学习~~~~~");
    }
}
