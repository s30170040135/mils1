package wiproms1;

public class co18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int flag=0;
		 for (int i=2;i<n/2;i++) 
		 {
		        if (n % i == 0) {
		            flag = 1;
		            break;
		        }
		    }
		        if (flag == 0)
		            System.out.println(n+" is a prime number");
		        else
		        	System.out.println(n+" is not a prime number");


	}

}
