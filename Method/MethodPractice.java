package Method;

public class MethodPractice {
    static int max(int x, int y){
        x++;
        if(x > y) {
          return x;
        }
        else
            return y;
    }
    public static void main(String[] args) {
        int a=10, b=20, c;
        c = max(a, b);
        System.out.println(c);
    }
}