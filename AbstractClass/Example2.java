package AbstractClass;

abstract class Shape{
    abstract public double area();
    abstract public double perimeter();
}
class Circle extends Shape{
    double radius;
    @Override
    public double area(){
        return 2* Math.PI*radius;
    }
    @Override
    public double perimeter(){
        return Math.PI*radius*radius;
    }

}
class Rectangle extends Shape{
    double length;
    double breadth;
    @Override
    public double area() {
        return length*breadth;
    }
    @Override
    public double perimeter() {
        return 2*length*breadth;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        Shape s = r;
        System.out.println(s.area());
    }
}
