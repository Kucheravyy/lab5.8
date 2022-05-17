package lab;

import java.util.Scanner;

public class work4 {

	public static void main(String[] args) {
		
				Scanner a = new Scanner(System.in); 
			System.out.println("Видіть 3 любих числа");
			int b =a.nextInt();
			int c =a.nextInt();
			int d =a.nextInt();
			if(c>d) {
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);	}
			if(d>c) {
				System.out.println(b);
				System.out.println(d);
				System.out.println(c);	}
			if(c>b && c>d) {
				if(b>d) {
				System.out.println(c);
				System.out.println(b);
				System.out.println(d);	}
			if(d>b) {
				System.out.println(c);
				System.out.println(d);
				System.out.println(b);		}
			}
			
			
		if(d>b && d>c)	{
		if(c>b) {
			System.out.println(d);
			System.out.println(c);
			System.out.println(b);  }
		if(b>c) {
			System.out.println(d);
			System.out.println(b);
			System.out.println(c);	}
		}
	}}
			
	

