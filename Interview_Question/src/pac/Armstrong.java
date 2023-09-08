package pac;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int num=123,number,temp,total=0;
		number=num;
		for(number=num;number!=0;number/=10) {
			
			temp=number%10;
			total=total+temp*temp*temp;
		}
		if(total==num) {
			System.out.println(num + " Armstrong no");
		}
		else
			System.out.println(num + " not Armstrong No");
		
		
		
	}

}
