
public class Sample2 {
    
    String name="azar";//global variable
    void fun1()
    {
        int a=100;//local variable
        System.out.println("This is local variable::"+a+""+name);
    }
    void fun2()
    {
        System.out.println("This is fun2::"+name);
    }
    void fun3()
    {
        int salary=10000;
        System.out.println("This is fun3::"+salary);
    }
    public static void main(String args[])
    {
        Sample2 f1=new Sample2();
        f1.fun1();
        f1.fun2();
        f1.fun3();
    }
}
