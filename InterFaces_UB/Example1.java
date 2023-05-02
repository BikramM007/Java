package InterFaces_UB;

interface Test{
    void meth1();
    void meth2();
    void meth4();
}
class My implements Test{
    @Override
    public void meth1() {
        System.out.println("print meth1()");
    }
    @Override
    public void meth2(){
        System.out.println("Print meth2()");
    }
    public void meth3() {
        System.out.println("Print meth3()");
    }
    @Override
    public void meth4() {  System.out.println("Print meth4"); }
}
public class Example1 {
    public static void main(String[] args) {
        Test t = new My();
        My m = new My();
        t.meth1();
        t.meth2();
        m.meth3();
        m.meth4();

    }
}
