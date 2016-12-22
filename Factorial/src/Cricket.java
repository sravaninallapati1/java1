



import java.util.Scanner;
class OversException extends Exception {
	public String toString()
	{
		return "Overs should be less than 50";
	}

}
 class Cricket {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to the match");
		System.out.println("enter team1 name");
		String str1=sc.next();
		System.out.println("enter team2 name");
		String str2=sc.next();
	int o1,o2,r1,r2;
    int score=0,score1=0;
	System.out.println("enter overs of 1st team");
	o1=sc.nextInt();
	if(o1<50)
	{
	System.out.println("enter run rate");
	r1=sc.nextInt();
	score=o1*r1;
	System.out.println("the score of india is"+score);
	}
	else
	{
		throw new OversException();
	}
	System.out.println("enter overs of 2nd team");
	o2=sc.nextInt();
	if(o2<50)
	{
	System.out.println("enter run rate");
	r2=sc.nextInt();
	score1=o2*r2;
	System.out.println("the score of australia is"+score1);
	}
	else
	{
		throw new OversException();
	}
	if(score>score1)
		System.out.println("india wins");
	else
		System.out.println("australia wins");
				
		
		
	
	}
 }