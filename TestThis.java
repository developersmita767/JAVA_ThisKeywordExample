class A{
    B b;
    A(B b){
        this.b=b;
        System.out.println("Inside constructor A");
    }
    void testB(B b){
         System.out.println("Inside method A");
    }
}
class B{
    int p=10;
    void createAObj(){
        A a=new A(this);
        a.testB(this);
    }
}
public class TestThis{
    public static void main(String[] ar){
            B b=new B();
            b.createAObj();
    }
}