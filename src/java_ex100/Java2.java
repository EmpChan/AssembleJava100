package java_ex100;

import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}

12.
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println(str);
	
	
22.
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	if(a>b)System.out.println("1");
	else System.out.println("0");

32.
	Scanner sc=new Scanner(System.in);
	char ch=sc.next().charAt(0);
	switch (c) {
	case 'A':
		System.out.println("best!!!");
		break;
	case 'B':
		System.out.println("good!!");
		break;
	case 'C':
		System.out.println("run!");
		break;
	case 'D':
		System.out.println("slowly~");
		break;
		
	default:
		System.out.println("what?");
		break;

	}
	
42.
Scanner sc=new Scanner(System.in);
int ball=sc.nextInt();
if((ball>=50&&ball<=70)||ball%6==0)
	System.out.println("win");
else
	System.out.println("lose");


52.
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
if(num%10==1)
	System.out.println(num+"st");
else if(num%10==2)
	if(num/10==1)
		System.out.println(num+"th");
	else
		System.out.println(2+"nd");
else if(num%10==3)
	if(num/10==1)
		System.out.println(num+"th");
	else
		System.out.println(3+"rd");
else
	System.out.println(num+"th");


62.

72.
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n2;
int max=0;
for(int i=0;i<n;i++) {
	n2=sc.nextInt();
	if(max<n2)
		max=n2;
}
System.out.println(max);

	
82.
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
for(int i=num1;i<=num2;i++) {
	for(int j=1;j<10;j++)
		System.out.println(i+"*"+j+"="+i*j);
}

92.
Scanner sc=new Scanner(System.in);
int[] array;
for(int i=0;i<10;i++)
	array[i]=sc.nextInt();
try{
	Thread.sleep(5000);
}catch(Exception e) {}
for(int i=0;i<20;i++)System.out.println();
int k=sc.nextInt();
System.out.println(k+"번째숫자는?");
System.out.println(array[k+1]);









