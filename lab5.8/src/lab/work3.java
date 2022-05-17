package lab;

import java.util.Scanner;

public class work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("погодитись чи відмовитись");
		try (Scanner a = new Scanner (System.in)) {
			String b;
			b= a.next();
			switch(b) {
			case("погодитись"):
			System.out.println("так,ок,+");
			case("відмовитись"):
			System.out.println("ні,-");
			break;
			}
		}
	}

}
