package Method;

public class Object_passing {

    static  void change(int x[],int index,int value){
        x[index] = value;

    }
    static void change2(int x,int value){
        x = value;
        System.out.println(x);

    }

    public static void main(String[] args) {

        int A[] = {1,9,3,6,9,2,6};

        change(A,2,20);

        for (int x:A){
            System.out.println(x);
        }
    }
}
