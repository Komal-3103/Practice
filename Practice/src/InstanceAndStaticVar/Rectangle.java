package InstanceAndStaticVar;

public class Rectangle {
int length;
int breadth;
static int rectCount=0;//count rect obj
void setData(int l,int b) {
	length=l;
	breadth=b;
	rectCount++;
}
//method to calculate the area of rectangle
int area()
{
	int rectArea;
	rectArea=length*breadth;
	return rectArea;
}
}


