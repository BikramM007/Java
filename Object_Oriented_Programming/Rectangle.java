package Object_Oriented_Programming;
class RectangleTest{
    public double length;
    public double breadth;

    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length == breadth)
            return true;
        else
            return false;
    }

}

public class Rectangle {
    public static void main(String[] args) {

        RectangleTest r1 = new RectangleTest();
        RectangleTest arvind = new RectangleTest();

        r1.length = 10.5;
        r1.breadth = 5.5;

        arvind.length = 70;
        arvind.breadth = 70;


        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Is it square: "+r1.isSquare());

        System.out.println("Area: "+arvind.area());
        System.out.println("Perimeter: "+arvind.perimeter());
        System.out.println("Is it square: "+arvind.isSquare());

    }
}
