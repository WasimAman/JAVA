package com.wasim;
public class StaticAndInstance {
    static int x = 20;
    int y = 30;
    public static void main(String[] args) {
        StaticAndInstance s = new StaticAndInstance();
        s.x = 999;
        s.y = 888;
        StaticAndInstance s2 = new StaticAndInstance();
        System.out.println(s2.x+"....."+s2.y);
    }
}
