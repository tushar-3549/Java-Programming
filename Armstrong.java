import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num,r,temp,sum=0;
		System.out.print("Enter the Number: ");
		num = input.nextInt();
		temp=num;
		
		while(temp != 0)
		{
			r=temp%10;
			sum=10*sum+r*r*r;
			temp=temp/10;
			
		}
		if(num==sum)
			System.out.print("Armstrong");
		else
			System.out.print("Not Armstrong");

	}

}
