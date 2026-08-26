package com.inheritance1;


class Demo {
    int x = 10;
    
    Demo() {
        show();
    }
    
    void show() {
        System.out.println(x);
    }
}

class Child extends Demo {
    int x = 20;
    
    Child() {
        System.out.println(x);
    }
    
    @Override
    void show() {
        System.out.println(x);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Demo p = new Child();
        System.out.println(p.x);
        p.show();
    }
}