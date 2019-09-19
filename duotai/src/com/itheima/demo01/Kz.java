package com.itheima.demo01;
//多态成员变量父类不能访问子类的特有成员
//成员方法 只能访问子类的

public class Kz extends Kd {
    int age= 40;
    public void teach(){
        System.out.println("孔子讲论语");
    }
    public void playGame(){
        System.out.println("孔子玩王者");
    }
}
