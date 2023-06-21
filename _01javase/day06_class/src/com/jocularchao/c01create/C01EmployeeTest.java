package com.jocularchao.c01create;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/12 21:19
 * @description: 打工人实现类
 *
 * null引用
 */
public class C01EmployeeTest {
    public static void main(String[] args) {
        //构造Employee数组填入三个Employee对象
        C01Employee[] staff = new C01Employee[3];

        staff[0] = new C01Employee("Tom", 20000, 2023, 6, 1);
        staff[1] = new C01Employee("Jack", 30000, 2023, 6, 2);
        staff[2] = new C01Employee("Marry", 50000, 2023, 6, 3);



        // 使用raiseSalary方法涨工资
        for (C01Employee e :
                staff) {
            e.raiseSalary(5);
        }

        //打印员工信息
        for (C01Employee e :
                staff) {
            System.out.println("name="+e.getName()+" salary="+e.getSalary()+" hireDay="+e.getHireDay());
        }

        for (C01Employee e :
                staff) {
            System.out.println(e.toString());
        }

        //null 引用
        //null 对象调用方法会有NullPointerException空指针异常
        /*LocalDate birthday = null;
        String string = birthday.toString();*/



    }
}
