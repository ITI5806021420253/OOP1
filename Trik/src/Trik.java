import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int left=1,center=0,right=0,temp,i;
		String Switch;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value : ");
		Switch = scan.next();
		
		for(i=0;i<Switch.length();i++){
		if(Switch.charAt(i) == 'A' || Switch.charAt(i) == 'a'){
		temp=left;
		left=center;
		center=temp;
		}else if(Switch.charAt(i) == 'B' || Switch.charAt(i) == 'b'){
		temp=center;
		center=right;
		right=temp;
		}else{
		temp=left;
		left=right;
		right=temp;
		}
		}
		if(left == 1) System.out.println("Coin is in Left glass");
		else if(center == 1) System.out.println("Coin is in Center glass");
		else System.out.println("Coin is in Right glass");
	}

}
