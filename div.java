import java.util.*;
import java.io.*;
import java.lang.*;
class div_Main{
	public static void main(String[] args) throws IOException {

	float a,b,res;
	char choice,ch;
	Scanner scan = new Scanner(System.in);

	do{
		System.out.print("1.ADD TWO NUmbers\n");
		System.out.print("3.Multiply two numbers\n");
		System.out.print("4.Subtract two numbers\n");
		System.out.print("2.Exit\n");
		System.out.print("Enter the choice:");
		choice=scan.next().charAt(0);
		switch(choice){
			case '1': System.out.print("Enter the two numbers:");
						a=scan.nextFloat();
						b=scan.nextFloat();
						res = a+b;
						System.out.print("Result= "+res);
						break;
			case '2': System.exit(0);
						break;
			case '3': System.out.print("Enter the two numbers: ");
						a=scan.nextFloat();
						b=scan.nextFloat();
						res = a*b;
						System.out.print("Result= "+res);
						break;
			case '4': System.out.print("Enter the two numbers: ");
						a=scan.nextFloat();
						b=scan.nextFloat();
						res = a-b;
						System.out.print("Result= "+res);
						break;
			default: System.out.print("Invalid CHOICE!!!!");
						break;
			}
			System.out.print("\n------------------");
		}while(choice!='2');

	}
 }