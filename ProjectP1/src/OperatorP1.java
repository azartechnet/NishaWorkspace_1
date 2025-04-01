import java.util.Scanner;

public class OperatorP1
{
	int a,b;
	Scanner sc=new Scanner(System.in);
    void arithmeticOperator()
    {
    	System.out.println("Enter the a and b value is::");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("Add::"+(a+b));
    	System.out.println("Sub::"+(a-b));
    	System.out.println("Mul::"+(a*b));
    	System.out.println("Div::"+(a/b));
    	System.out.println("Module::"+(a%b));
    }
    void comparsionOperator()
    {
    	System.out.println("Enter the a and b value is::");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("Lessthan::"+(a<b));
    	System.out.println("Greaterthan::"+(a>b));
    	System.out.println("equal::"+(a==b));
    	System.out.println("NotEqual::"+(a!=b));
    }
    void logicalOperator()
    {
    	System.out.println("Enter the a and b value is::");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("logicalAND::"+((a>b)&&(b<a)));
    	System.out.println("logicalOR::"+((a>b)||(b>a)));
    	System.out.println("logicalNOT::"+(!(a>b)));
    }
    void bitwiseOperator()
    {
    	System.out.println("Enter the a and b value is::");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("BitWiseAND::"+(a&b));
    	System.out.println("BitWiseOR::"+(a|b));
    	System.out.println("BitWiseXOR::"+(a^b));
    	System.out.println("LeftShift::"+(a<<1));
    	System.out.println("RightShift::"+(a>>1));
    }
	public static void main(String[] args) 
	{
		
      OperatorP1 f1=new OperatorP1();
      //f1.arithmeticOperator();
      //f1.comparsionOperator();
      //f1.logicalOperator();
      f1.bitwiseOperator();
	}

}
