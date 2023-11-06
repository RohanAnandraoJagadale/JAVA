
class Base
{
	public int A,B;    // characteristics
	public Base(int No1, int No2)  // method/behaviour
	{
		this.A = No1;
		this.B = No2;
	}
	public void fun()
	{
		System.out.println("Inside base fun");
		System.out.println("Value of A from fun method is : "+this.A);
	}
}

class Derived extends Base
{
	public int X,Y;    // char
	public Derived(int i, int j, int k, int l)   //behaviour / method
	{
		super(k,l);     // 1 usecase  Base(51,101)
		this.X = i;
		this.Y = j;
	}
	public void gun()   // behaviour / method
	{
		System.out.println("Value of A from gun method is : "+super.A);   // 2 usecase
		super.fun();  // 3 usecase
	}
}

class SuperDemo
{
	public static void main(String A[])
	{
		Derived dobj = new Derived(11,21,51,101);
		
		dobj.gun();
	}
}