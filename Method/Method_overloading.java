package Method;

public class Method_overloading {
    static int  max(int x, int y){
        return Math.max(x, y);
    }
    static float max(float x, float y){
        if(x>y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        System.out.println(max(10,5));
    }










}
