package wiproms1;

public class co10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		  int n=1001; 
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println(temp+ " is a palindrome");    
		  else    
		   System.out.println(temp+ " is not a palindrome"); 
	}

}
