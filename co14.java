package wiproms1;

public class co14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int i,s=0,f=0;
		s=n/2;
		if(n==0||n==1)
		{
			System.out.println(n+" is neither prime nor composite number");
		}
		else
		{
			for(i=2;i<s;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+" is not a prime number");
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(n+ "is a prime number");
			}
		}
	}

}
