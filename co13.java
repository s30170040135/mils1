package wiproms1;

public class co13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n=346;
		for(;n!=0;n=n/10)
		{
			sum=sum+(n%10);
		}
		System.out.println(sum);

	}

}
