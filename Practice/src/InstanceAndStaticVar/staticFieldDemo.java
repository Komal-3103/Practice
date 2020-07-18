package InstanceAndStaticVar;

public class staticFieldDemo {
	//class to create rect obj and access static field
	public static void main(String[] args)
	{
		//create first rectangle obj
		Rectangle firstRect = new Rectangle();
		firstRect.setData(5,6);
		System.out.println("area of rect1="+firstRect.area());
		
		//create second rectangle object
		Rectangle secondRect = new Rectangle();
		secondRect.setData(10,20);
		System.out.println("area of rect2="+secondRect.area());
	//access static field of rectangle class
	System.out.println("total no of objects="+Rectangle.rectCount);
	}

}
