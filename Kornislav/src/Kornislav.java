import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Line1,Line2,Line3,Line4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Line1 : ");
		Line1=scan.nextInt();
		System.out.print("Enter Line2 : ");
		Line2=scan.nextInt();
		System.out.print("Enter Line3 : ");
		Line3=scan.nextInt();
		System.out.print("Enter Line4 : ");
		Line4=scan.nextInt();
		if(Line1>Line2){
		temp=Line1;
		Line1=Line2;
		Line2=temp;
		}
		if(Line1>Line3){
		temp=Line1;
		Line1=Line3;
		Line3=temp;
		}
		if(Line1>Line4){
		temp=Line1;
		Line1=Line4;
		Line4=temp;
		}
		if(Line2>Line3){
		temp=Line2;
		Line2=Line3;
		Line3=temp;
		}
		if(Line2>Line4){
		temp=Line2;
		Line2=Line4;
		Line4=temp;
		}
		if(Line3>Line4){
		temp=Line3;
		Line3=Line4;
		Line4=temp;
		}
		System.out.print("\nRectangle Area = : "+""+Line3+""+" * "+Line1+" = "+Line3*Line1);
	}

}
