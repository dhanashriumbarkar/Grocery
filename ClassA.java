//package pack2;
import java.util.Scanner;

public class ClassA 
{	
	Scanner sc=new Scanner(System.in);
	int d;
	int f;
	int y;
	int z=0;
	int arr[]=new int[100];
	String arr1[]=new String[100];
	int arr2[]=new int[100];
	void meth2()
	{	

		System.out.println("*****************************************************");
		System.out.println("!!!!!.............Welcome to Trupti Market.............!!!!!");
		System.out.println("*****************************************************");
		System.out.println("If you want see our list please type 1");
		int a=sc.nextInt();
			do
			{
			System.out.println("1) Fruites");
			System.out.println("2) Vegetables");
			System.out.println("3) Cosmetics");
			System.out.println("4) Masala Powders");
			System.out.println("5) Exit");		
			System.out.println("**********************************************************");
			System.out.println("Plese choose your option:");
			int b=sc.nextInt();
			switch(b)
			{
			case 1:
				System.out.println("101 Mango--->1Kg--->RS.200");
				System.out.println("102 Orange--->1Kg--->RS.150");
				System.out.println("103 Apple--->1Kg--->RS.250");
				System.out.println("104 Greps--->1Kg--->RS.100");
				System.out.println("**********************************************************");
				System.out.println("Please choose your product code:");
				int c=sc.nextInt();
				switch(c)
				{
				case 101:
					arr[z]=d;
					arr1[z]="Mango";
					arr2[z]=200;
					break;
				case 102:
					arr1[z]="Orange";
					arr2[z]=150;
					break;
				case 103:
					arr1[z]="Apple";
					arr2[z]=250;
					break;
				case 104:
					arr1[z]="Greps";
					arr2[z]=100;
					break;
				}
				System.out.println("How many kgs do you need?");
				break;
			case 2:
				System.out.println("201 Potato--->1Kg--->RS.50");
				System.out.println("202 Tomato--->1Kg--->RS.70");
				System.out.println("203 Onion--->1Kg--->RS.100");
				System.out.println("204 Carrot--->1Kg--->RS.60");
				System.out.println("**********************************************************");
				System.out.println("Please choose your product code:");
				int e=sc.nextInt();
				switch(e)
				{
				case 201:
					arr1[z]="Tomato";
					arr2[z]=50;
					break;
				case 202:
					arr1[z]="Tomato";
					arr2[z]=70;
					break;
				case 203:
					arr1[z]="Onion";
					arr2[z]=100;
					break;
				case 204:
					arr1[z]="Carrot";
					arr2[z]=60;
					break;
				}
				System.out.println("How many kgs do you need?");
				break;
			case 3:
				System.out.println("301 Kajal--->1--->RS.20");
				System.out.println("302 Lip Stick--->1--->RS.50");
				System.out.println("303 Nail Polish--->1--->RS.40");
				System.out.println("304 Face Powder--->1--->RS.150");
				System.out.println("**********************************************************");
				System.out.println("Please choose your product code:");
				int f=sc.nextInt();
				switch(f)
				{
				case 301:
					arr1[z]="Kajal";
					arr2[z]=20;
					break;
				case 302:
					arr1[z]="Lip Stick";
					arr2[z]=50;
					break;
				case 303:
					arr1[z]="Nail Polish";
					arr2[z]=40;
					break;
				case 304:
					arr1[z]="Face Powder";
					arr2[z]=150;
					break;
				}
				System.out.println("How many item do you need?");
				break;
			case 4:
				System.out.println("401 Chaat Masala--->1Kg--->RS.50");
				System.out.println("402 Clove--->1Kg--->RS.60");
				System.out.println("403 Ajwain--->1Kg--->RS.80");
				System.out.println("404 Turmeric--->1Kg--->RS.100");
				System.out.println("**********************************************************");
				System.out.println("Please choose your product code:");
				int g=sc.nextInt();
				switch(g) 
				{
				case 401:
					arr1[z]="Chaat Masala";
					arr2[z]=50;
					break;
				case 402:
					arr1[z]="Clove";
					arr2[z]=60;
					break;
				case 403:
					arr1[z]="Ajwain";
					arr2[z]=80;
					break;
				case 404:
					arr1[z]="Turmeric";
					arr2[z]=100;
					break;
				}
				System.out.println("How many kgs do you need?");
				break;
			case 5:
				break;
			default:
					System.out.println("please select corect option");
		}
				arr[z]=new ClassA().meth1();
        z++;
        System.out.println("Press 1 to continue");
        System.out.println("Press 2 to exit");
        f=sc.nextInt();
		}
		while(f==1);
			System.out.println("Enter your name:");
			String g=sc.next();
			System.out.println("Enter your address:");
			String h=sc.next();
			System.out.println("Enter your Contact no:");
			int i=sc.nextInt();
			System.out.println("!!!!!.............Welcome to Trupti Market.............!!!!!");
			System.out.println("S.no  | Qty | Name       |Prise");
			System.out.println("**********************************************************");
			for(int k=1;k<=z;k++)
			System.out.println(k+"  "+arr[k-1]+"  "+arr1[k-1]+"  "+(arr2[k-1]*arr[k-1]));
			System.out.println("**********************************************************");
			int sum=0;
			for(int k=1;k<=z;k++)
				sum=sum+(arr2[k-1]*arr[k-1]);
			System.out.println("Total bill of purchased item: "+sum);
			if(sum>=1000)
			{
				System.out.println("you receive a discountof 5%:"+(sum*5/100));
				System.out.println("Final bill is: "+(sum-(sum*5/100)));
				System.out.println("====Thank you for shopping you saved Rs."+(sum*5/100)+"=======");
			}
			else
			{
				System.out.println("Final bill is: "+sum);
				System.out.println("you receive a discountof 5%:"+(sum*5/100));
			}
			System.out.println("**********************************************************");
			System.out.println("Name:"+g);
			System.out.println("Address:"+h);
			System.out.println("Contact no. :"+i);
	}
	public int meth1()
	{
	     d=sc.nextInt();
	     return d;
	}

	public static void main(String[] args) 
	{
		ClassA aobj=new ClassA();
		aobj.meth2();	
	}
}
