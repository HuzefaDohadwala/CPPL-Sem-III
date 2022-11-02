class A {
   void abc(int x){
        x=x+x;
        System.out.println("parent class" + x);
    }
}
class B extends A {
    void abc(int x){
        x=x*x;
        System.out.println("child class" + x);
    }
}

class Main {
    public static void main(String[] args)
    {
       A obj1 = new A();
       B obj2 = new B();
       obj1.abc(10);
       obj2.abc(10);
    }
}