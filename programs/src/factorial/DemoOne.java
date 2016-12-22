package factorial;

public class DemoOne {


int x,y;
static float f1,f2;
static boolean flag;
public float functionOne(float f1,float f2)
{
	DemoOne.f1=f1+f2;
	DemoOne.f2=DemoOne.f1+f2;
	return DemoOne.f2+f1;

}
public int functionOne(float f1)
{
	DemoOne.f1=f1+f2;
	f1=DemoOne.f1+f1;
	return (int)f1;
}
public static DemoOne functionOne(int x,int y)
{
	DemoOne done=new DemoOne();
	f2=done.functionOne((float)x,(float)y);
	y=done.functionOne(f2);
	return done;
}
public static void main(String args[])
{
	DemoOne done=functionOne(5,7);
	System.out.println(f1);
	System.out.println(f2);
	System.out.println(done.x);
	System.out.println(done.y);
}
}
