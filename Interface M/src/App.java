interface myinterface {
    abstract void m1();

    abstract void m2();

    abstract void m3();

    abstract void m4();

}

class Myclass1 implements myinterface {
    public void m1() {
        System.out.println("I am in M1");
    }

    public void m2() {
        System.out.println("I am in M2");
    }

    public void m3() {
        System.out.println("I am in M3");
    }

    public void m4() {
        System.out.println("I am in M4");
    }

}

class Myclass2 extends Myclass1{
    public void m2(){
        System.out.println("I am in M2 of Myclass2");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Myclass1 ob1 = new Myclass1();
        ob1.m1();
        ob1.m2();
        ob1.m3();
        ob1.m4();
        Myclass2 ob2 = new Myclass2();
        ob2.m2();
    }
}
