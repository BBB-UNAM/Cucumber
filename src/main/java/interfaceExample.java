public class interfaceExample implements myInterface,myInterface2{

    public static void main(String args[]){
        interfaceExample myObject = new interfaceExample();
        myObject.method1();
    }

    @Override
    public void method1() {
        System.out.println("Hola 1");
    }

    @Override
    public void method2() {
        System.out.println("Hola 2");
    }

    @Override
    public void method3() {
        System.out.println("Hola 3");
    }

    @Override
    public void method4() {
        System.out.println("Hola 4");
    }

    @Override
    public void method5() {
        System.out.println("Hola 5");
    }

    @Override
    public void method6() {
        System.out.println("Hola 6");
    }
}

interface myInterface{
    //public int edad = 0;
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
}
interface myInterface2{
    //public int edad = 0;
    public abstract void method4();
    public abstract void method5();
    public abstract void method6();
}