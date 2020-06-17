package wiproms1;

public class co22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s='%';
		if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
		{
			System.out.println(s+" is a alphabet");
		}
		else if(s>='0'&&s<='9')
		{
			System.out.println(s+" is a digit");
		}
		else
		{
			System.out.println(s+" is a special character");
		}
	}

}
