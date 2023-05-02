package AbstractClass;
abstract class KFC{
    abstract int billing();
    abstract int menu();
    abstract int offers();

}
class MyKFC extends KFC{
    @Override
    public int  billing(){
        return 0;
    }
    @Override
    public int menu(){
        return 0;
    }
    @Override
    public int offers(){
        return 0;
    }

}
public class Example3 {
    public static void main(String[] args) {
        KFC k;

    }
}
