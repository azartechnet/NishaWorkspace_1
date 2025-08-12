
public class Operator {

	void arithmeticOperators()
	{
		int a1=100,b1=200;
		System.out.println("Add::"+(a1+b1));
		System.out.println("Sub::"+(a1-b1));
		System.out.println("Mul::"+(a1*b1));
		System.out.println("Div::"+(a1/b1));
	}
	void relationOperator()
	{
		int a1=100,b1=200;
		System.out.println("Lessthan::"+(a1<b1));
		System.out.println("Greaterthan::"+(a1>b1));
		System.out.println("Equal::"+(a1==b1));
		System.out.println("NotEqual::"+(a1!=b1));
	}
	void logicalOperator()
	{
		int a1=200,b1=100;
		System.out.println("LogicalAND::"+((a1>b1)&&(b1<a1)));//True
		System.out.println("LogiaclOR::"+((a1<b1)||(b1>a1)));//false
		System.out.println("LogiacleNOT::"+!(a1>b1));//False
		
	}
	void bitwiseOperator()
	{
		int a=2,b=3;
		System.out.println("BitWiseAND::"+(a&b));
		System.out.println("BitWiseOR::"+(a|b));
		System.out.println("BitWiseXOR::"+(a^b));
		System.out.println("LeftShift::"+(a<<1));
		System.out.println("RightShift::"+(a>>1));
		System.out.println("OnesCompl::"+(~a));
	}
	public static void main(String[] args) {
		
		Operator f1=new Operator();
		//f1.arithmeticOperators();
		//f1.relationOperator();
		//f1.logicalOperator();
		f1.bitwiseOperator();

	}

}
