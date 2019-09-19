package com.itheima.demo01;

public class testTest {
    public static void main(String[] args){
        Kd kd= new Kz();//子父类成员变量都有，不能访问子类的特有成员变量
        System.out.println("我的年龄："  + kd.age);
        kd.teach();//打印子类的成员方法
       // kd.playGame();编译失败，父类中没有方法
        Kz kz =(Kz) kd;
        kz.playGame();
    }
}
