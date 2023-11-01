

class EqualsDemo
{
    public static void main(String A[])
    {
        String s1 = "Hello";
		String s2 = "Hello";
		
		System.out.println("Hashcode of s1 : "+s1.hashCode());     // 69609650
		System.out.println("Hashcode of s2 : "+s2.hashCode());     // 69609650
		
		
		if(s1.equals(s2))    //if("Hello" == "Hello")
		{
			System.out.println("Objects are same");
		}
		else
		{
			System.out.println("Objects are different");
		}
		
		if(s1 == s2)     //if(69609650 == 69609650)
		{
			System.out.println("Objects are same");
		}
		else
		{
			System.out.println("Objects are different");
		}
	}
}