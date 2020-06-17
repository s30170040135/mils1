package wiproms1;

public class co24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []elements=new int[] {1,2,3,4,5};
		int len=elements.length;
		int sum=0;
        for(int i = 0; i < len ; i++)
        {
            
            sum = sum + elements[i];
        }
        System.out.println("Sum:"+sum);
        float average = (float)sum / len;
        System.out.println("Average:"+average);
	}

}
