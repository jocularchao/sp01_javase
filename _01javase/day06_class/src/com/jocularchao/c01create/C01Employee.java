package com.jocularchao.c01create;

import java.time.LocalDate;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/12 21:12
 * @description: 自定义类 打工人
 *
 * 0、显式参数与隐式参数
 * 1、封装优点
 *  get set 典型的访问器方法（字段访问器） 只返回实例字段值
 * 2、静态字段 static
 *  
 * 3、工厂方法
 * 4、main方法  静态方法  不对任何对象进行操作  用于单元测试
 * 5、
 */
public class C01Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    // final 修饰的字段  必须构造对象时初始化 对象构造之后，这个值不会再改变
    // private final String id;

    public C01Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }


    //1
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void setHireDay(LocalDate hireDay) {
        this.hireDay = hireDay;
    }



    // 发工资
    // 0
    // double byPercent 显示参数 接受的参数
    // this.salary 隐式参数
    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary+=raise;
    }


    @Override
    public String toString() {
        return "C01Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }


    // 2、
    public static void holdMeeting(){
        System.out.println("开会");
    }

}
