package Method;

public class Variable_args {
    static void showList(int start, String ...S){
        for (int i = 0; i < S.length; i++) {
            System.out.println(start+". "+S[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        showList(10,"Vikram", "Eilika", "Rani", "Ahmed", "Shakshi");
    }

}
