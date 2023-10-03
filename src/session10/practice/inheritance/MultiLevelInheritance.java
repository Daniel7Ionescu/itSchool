package session10.practice.inheritance;

public class MultiLevelInheritance {
}

class Grandparent {
    void dance(){
        System.out.println("Grandpa does a silly dance");
    }
}

class Parent extends Grandparent {
    @Override
    void dance() {
        System.out.println("Where did you learn to dance");
    }
}

class Child extends Parent {
    @Override
    void dance() {
        System.out.println("Tiktok dance, jeez >.>");
    }
}
