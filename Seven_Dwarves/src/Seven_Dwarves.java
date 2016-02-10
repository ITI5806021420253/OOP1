import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int D1,D2,D3,D4,D5,D6,D7,D8,D9;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input D1 : ");
		D1 = scan.nextInt();
		System.out.print("Input D2 : ");
		D2 = scan.nextInt();
		System.out.print("Input D3 : ");
		D3 = scan.nextInt();
		System.out.print("Input D4 : ");
		D4 = scan.nextInt();
		System.out.print("Input D5 : ");
		D5 = scan.nextInt();
		System.out.print("Input D6 : ");
		D6 = scan.nextInt();
		System.out.print("Input D7 : ");
		D7 = scan.nextInt();
		System.out.print("Input D8 : ");
		D8 = scan.nextInt();
		System.out.print("Input D9 : ");
		D9 = scan.nextInt();
		System.out.println();
		if(D3+D4+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D2");
		if(D2+D4+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D3");
		if(D3+D2+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D4");
		if(D3+D4+D2+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D5");
		if(D3+D4+D5+D2+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D6");
		if(D3+D4+D5+D6+D2+D8+D9==100)
		System.out.print("Fake Dwarf is D1 & D7");
		if(D3+D4+D5+D6+D7+D2+D9==100)
		System.out.print("Fake Dwarf is D1 & D8");
		if(D3+D4+D5+D6+D7+D8+D2==100)
		System.out.print("Fake Dwarf is D1 & D9");
		if(D1+D4+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D2 & D3");
		if(D3+D1+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D2 & D4");
		if(D3+D4+D1+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D2 & D5");
		if(D3+D4+D5+D1+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D2 & D6");
		if(D3+D4+D5+D6+D1+D8+D9==100)
		System.out.print("Fake Dwarf is D2 & D7");
		if(D3+D4+D5+D6+D7+D1+D9==100)
		System.out.print("Fake Dwarf is D2 & D8");
		if(D3+D4+D5+D6+D7+D8+D1==100)
		System.out.print("Fake Dwarf is D2 & D9");
		if(D1+D2+D5+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D3 & D4");
		if(D1+D4+D2+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D3 & D5");
		if(D1+D4+D5+D2+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D3 & D6");
		if(D1+D4+D5+D6+D2+D8+D9==100)
		System.out.print("Fake Dwarf is D3 & D7");
		if(D1+D4+D5+D6+D7+D2+D9==100)
		System.out.print("Fake Dwarf is D3 & D8");
		if(D1+D4+D5+D6+D7+D8+D2==100)
		System.out.print("Fake Dwarf is D3 & D9");
		if(D3+D1+D2+D6+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D4 & D5");
		if(D3+D1+D5+D2+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D4 & D6");
		if(D3+D1+D5+D6+D2+D8+D9==100)
		System.out.print("Fake Dwarf is D4 & D7");
		if(D3+D1+D5+D6+D7+D2+D9==100)
		System.out.print("Fake Dwarf is D4 & D8");
		if(D3+D1+D5+D6+D7+D8+D2==100)
		System.out.print("Fake Dwarf is D4 & D9");
		if(D3+D4+D1+D2+D7+D8+D9==100)
		System.out.print("Fake Dwarf is D5 & D6");
		if(D3+D4+D1+D6+D2+D8+D9==100)
		System.out.print("Fake Dwarf is D5 & D7");
		if(D3+D4+D1+D6+D7+D2+D9==100)
		System.out.print("Fake Dwarf is D5 & D8");
		if(D3+D4+D1+D6+D7+D8+D2==100)
		System.out.print("Fake Dwarf is D5 & D9");
		if(D3+D4+D5+D1+D2+D8+D9==100)
		System.out.print("Fake Dwarf is D6 & D7");
		if(D3+D4+D5+D1+D7+D2+D9==100)
		System.out.print("Fake Dwarf is D6 & D8");
		if(D3+D4+D5+D1+D7+D8+D2==100)
		System.out.print("Fake Dwarf is D6 & D9");
		if(D3+D4+D5+D6+D1+D2+D9==100)
		System.out.print("Fake Dwarf is D7 & D8");
		if(D3+D4+D5+D6+D1+D8+D2==100)
		System.out.print("Fake Dwarf is D7 & D9");
		if(D3+D4+D5+D6+D7+D1+D2==100)
		System.out.print("Fake Dwarf is D8 & D9");
	}

}
