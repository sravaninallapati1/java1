package dp;
import java.util.*;


interface Shape
{
	public void draw();
}
class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("rectangle shape drawn");
	}
}
class Triangle implements Shape
{
	public void draw()
	{System.out.println("triangle shape is drawn");
	
	}

class ShapeImp
{
	public static int gettype(Stringdraw)
	{
		if(draw==null)
	
	{
		return null;
	}
	elseif(draw.equals("rectangle"));
	{
		return new Rectangle();
	}
	elseif(draw.equals("triangle"));
	{
		return new triangle();
	}

	
class Factory
{
	public static void main(String[]args)
	{
		System.out.println("1.rectangle/2.triangle");
		

	switch(choice)
	{
	
	
	case1: 
		Shape  s= shapeImp.gettype("rectangle");
	s.draw();
	break;
		
	case2:
		Shape s1=shapeImp.gettype("triangle");
	s1.draw();
	break;
	
	
	
	
}
}
}}