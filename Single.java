/*
class Object
{
	// code
}
*/

class Base   // class Base extend Object
{
	public int A,B;
	public Base()
	{
		System.out.println("Base constructor");
		this.A = 10;
		this.B = 20;
	}
	public void fun()   // definition
	{
		System.out.println("Inside Base fun");
	} 
	public void gun()     // definition
	{
		System.out.println("Inside Base gun");
	}
	public void fun(int No)    // overloaded definition
	{
		System.out.println("Inside Base fun with one integer");
	}
}

class Derived extends Base   //class Derived : public Base
{
	public int X,Y;
	public Derived()
	{
		System.out.println("Derived Constructor");
		this.X = 30;
		this.Y = 40;
	}
	public void sun()      // definition
	{
		System.out.println("Inside Derived sun");
	}
	public void gun()      // overrided definition
	{
		System.out.println("Inside Derived gun");
	}
}

class Single
{
	public static void main(String arg[])
	{
	//	Base bobj1 = new Base();          // No Casting        
	//	Derived dobj1 = new Derived();    // No Casting
		Base bobj2 = new Derived();       // up Casting
	//	Derived  dobj2 = new Base();      // Down Casting (NA)
		
		dobj2.fun();     // Base fun
		dobj2.fun(11);   // Base fun
		dobj2.gun();     // Derived gun
	//	dobj2.sun();     // Derived sun
	}
}