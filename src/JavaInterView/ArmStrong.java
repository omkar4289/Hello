package JavaInterView;

public class ArmStrong {

	public static void main(String[] args) {
		int num=371;
		int actualNum=num;
		int result=0;
		while(num>0)
		{
			int n=num%10;
			result=result+(n*n*n);
			num=num/10;
		}
		
		if(result==actualNum)
		{
			System.out.println("No is ArmStrong No.");
		}
		else {
			System.out.println("No is not ArmStrong");
		}

	}

}
