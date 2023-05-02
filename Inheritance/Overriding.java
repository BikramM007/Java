package Inheritance;

class Super{
    public void display() {
        System.out.println("Super class display");
    }
}

class Sub extends Super{
    @Override
    public void display() {
      System.out.println("Sub class display");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Super Sup = new Super();
        Sup.display();

        Sub s = new Sub();
        s.display();
    }
}
