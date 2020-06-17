package wiproms1;

public class co25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10},max,min;
	      max=min=arr[0];
	      for(int i=1;i<arr.length;i++)
	      {
	    	  if(min>arr[i])
	    		  min=arr[i];
	    	  if(max<arr[i])
	    		  max=arr[i];
	      }
	      System.out.println("Max : "+max+" "+"Min : "+min);
	}

}
