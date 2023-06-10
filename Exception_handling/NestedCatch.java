package Exception_handling;
public class NestedCatch {
    public static void main(String[] args) {
        int A[] = {30, 40, 10, 80, 0};
        try {
                int c = A[0] / A[4];
                System.out.println("Division is :" + c);
             try {
                 System.out.println(A[10]);
             }
            catch (IndexOutOfBoundsException e) {
                System.out.println("Index is invalid");
            }
            System.out.println("Bye");
        }
        catch (ArithmeticException e) {
            System.out.println("Demonitor should not be 0");
        }
    }
}
