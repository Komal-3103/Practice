package InstanceAndStaticVar;

public class SumOfTwoNo {
	void sum(int x,int y)
	{
		System.out.println("sum of two integer no=" + (x+y));
	}
	void sum(double x,double y)
	{
		System.out.println("sum of two double no=" + (x+y));
	}
	void sum(char x,char y)
	{
		System.out.println("sum of two char no=" + (x+y));
	}
	public static void main(String[] args)
	{
		SumOfTwoNo obj = new SumOfTwoNo();
		obj.sum(10, 20);
		obj.sum(7.52,8.14);
		obj.sum('A','B');
	}
}
