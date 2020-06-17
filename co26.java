package wiproms1;

public class co26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10},i,ele=16,flag=0;
		for(i=0;i<arr.length;i++)
		{
			if(ele==arr[i])
			{
				System.out.println(arr[i]+" is found in index "+i);
				flag=1;
			}
		}
		if(flag==0)
			System.out.println("-1");

	}

}
