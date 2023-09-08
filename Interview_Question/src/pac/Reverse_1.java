package pac;

public class Reverse_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
String str="Abhishek Kamble";
String b[]=str.split(" ");
String RevString ="";
for(int i=0;i<b.length;i++) {
	String s=b[i];
	String rev="";
	for(int j=(s.length()-1);j>=0;j--) {
		rev=rev+s.charAt(j);
	}
	RevString=RevString+rev+" ";
}
		System.out.println(RevString);
		
	}

}
