/* 
1)package
it is acts like a container in which it will segregate a file in a java project.


2)Class
a blueprint for creating objects.
inside a class we are having variables and methods . variables is called as properties and methods is called as actions.
Attribute: "Hair color"
Variable: "Hair color" represented as "brown," "black," "blonde" (numerical values assigned for analysis) 
public class Dog {
      
	public String breed=" golden Retriver";
	public int height = 30;
	public int weight = 35;
	
	public static void main(String[] args) {
		Dog obj=new Dog();
		System.out.println(obj.breed);
	}
}


3)Datatype = ways to classify the data so that the computer can understand how to use it
 'in bits'  
 two types 1)primitive 
byte,char,short,int,float,long,double=predefined datatypes
           2)non primitive
array,collection,interface,class =not predefined
public class datatype {

	public static void main(String[] args) {
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Character.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Double.SIZE);
8=bits
16=bits
16=bits
32
32
64
64

in bytes


public class datatype {
	public static void main(String[] args) {	
		System.out.println(Byte.SIZE/8);
		System.out.println(Short.SIZE/8);
		System.out.println(Character.SIZE/8);
		System.out.println(Integer.SIZE/8);
		System.out.println(Float.SIZE/8);
		System.out.println(Long.SIZE/8);
		System.out.println(Double.SIZE/8);

finding min and max values
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		//boolean and char has no min and max values only it is having sizes 


		
	}

}


	}

}output
1
2
2
4
4
8
8


Variables
it is a conatainer which holds the value while java program is executed


public class Variables {

	public static void main(String[] args) {
//	int pincode=560060;
//		System.out.println(pincode);
		
	//syntax=//Datatype variableNmae=variableValue
		//Define and initializations
		int pincode;//define 
		pincode=560060;//intializations
		pincode=22342;
		int aa=pincode;
		System.out.println(aa);

	}

}
	4)types of datatypes
	1.Instances variables
	2.class variables
	3.local variables
	4.parameters

1.Instances variables
	public class Students {	
      int id=101;
	public static void main(String[] args) {
		// instance yake adre obj create madudre matra nav variables na aceess madoke agadu
		Students obj=new Students();
		System.out.println(obj.id);
	}

}

example for instance variables
import java.util.Scanner;

public class Variables {
//instances variables
	String name;
	String color;
	String breed;
	int age;
	int cost;
	 void alloacateData() {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the name of the dog : ");
		 name = sc.nextLine();
		 System.out.println("enter the color of the dog : ");
		 color =sc.nextLine();
		 System.out.println("enter the breed of the dog : ");
		 breed =sc.nextLine();
		 System.out.println("enter the age of the dog : ");
		 age =sc.nextInt();
		 System.out.println("enter the cost of the dog : ");
		 cost =sc.nextInt();
	 }
		 
		 void display(){
			 System.out.println(name);
			 System.out.println(color);
			 System.out.println(breed);
			 System.out.println(age);
			 System.out.println(cost);
			 
		 }
		 	 
	public static void main(String[] args) {
		Variables dog=new Variables();
		dog.alloacateData();
		dog.display();

	}

}

2.class variables //here we are using static keyword so that we are not creating the obj
public class Students {	
      static int id=101;
	public static void main(String[] args) {		
		System.out.println(id);
	}
}
	public class Students {	
      static int id=101;
      static String name="akash";  //string is literals
      String na="ak";
	public static void main(String[] args) {		
		System.out.println(id);		
		System.out.println(name);
		System.out.println(new Students().na);
	}

}	
3.local variables=variables which are defining and initializing inside main methods
public class Students {	
     
	public static void main(String[] args) {
		int height =70;
		System.out.println(height);
	}
	
}


example 2 

public class localVariables {
    void add() {
    	int a=20;
    	int b=10;
    	int c=a+b;
    	System.out.println(c);
    }
    
    void sub(int a, int b) {
    	
    	int c=a+b;
    	System.out.println(c);
    	
    }
	public static void main(String[] args) {
		
		localVariables obj=new localVariables();
				obj.add();
				obj.sub(10, 5);
	}

}

4.parameters =we cant assign a value to the parameters and parameter can be defined not be initialzed
public class Students {	
     public static void test1(int height) {
    	 
    	 System.out.println(height);
     }
	public static void main(String[] args) {
	test1(69);
	}
	
}


methods=behaviour, a block of code used to perform certain operations
public class Methods {
   public  void m1() {
	   System.out.println("hello");
   }
	public static void main(String[] args) {
		
	Methods obj=new Methods();
		obj.m1();
	}
}

public class Methods { //bank
	
	      static int currentBalance=1000;
         public static void greetCustomer(){
        	 System.out.println("hello,good morning sir ! , welcome to the banking applications");
         }
       public void deposit(int amount) {
    	    
    	   currentBalance=currentBalance+amount;
    	   System.out.println("your current balance after deposit is "+currentBalance);
       }
       
       public static void withdrawal() {
    	   int withdraw=300;
    	   currentBalance=currentBalance-withdraw;
    	   System.out.println("your current balance after withdrawal is "+currentBalance);
       }
       
       public void getCurrentBalance() {
    	   
    	   System.out.println("your current balance is "+currentBalance);
       }
	public static void main(String[] args) {
	greetCustomer();
	System.out.println("you have in account is "+currentBalance);
	Methods obj=new Methods();
	obj.deposit(400);
	
	
	withdrawal();
	obj.getCurrentBalance();
	
	}
}


Type Converstions
package www.com.pg1;

import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the byte value : ");
	byte bt=sc.nextByte();
	System.out.println("the byte value is "+bt);
	System.out.println("----------------------");
	
	System.out.println("enter the short value : ");
	short st=sc.nextShort();
	System.out.println("the short value is "+st);
	System.out.println("----------------------");
	
	System.out.println("enter the integer value : ");
	int it=sc.nextInt();
	System.out.println("the integer value is "+it);
	System.out.println("----------------------");
	
	System.out.println("enter the long value : ");
	long lg=sc.nextLong();
	System.out.println("the long value is "+lg);
	System.out.println("----------------------");
	
	
	System.out.println("enter the float value : ");
	float ft=sc.nextFloat();
	System.out.println("the float value is "+ft);
	System.out.println("----------------------");
	
	System.out.println("enter the double value : ");
	double db=sc.nextDouble();
	System.out.println("the float value is "+db);
	System.out.println("----------------------");
}

}


package www.com.pg2;

public class Program2 {

	public static void main(String[] args) {
			
		//implicit 
	byte b=126;
	System.out.println("the byte value is "+b);
	
	short s=b;
		System.out.println("the short value is "+s);
		
		int i=s;
		System.out.println("the integer value is "+i);
		
		long l=i;
		System.out.println("the long value is "+l);
		
		float f=l;
		System.out.println("the float value is "+f);
		
		double d=f;
		System.out.println("the double value is "+d);
	
		
		//implicit type conversion
		double d=126.0;
		System.out.println("the double value is "+d);
		
		float f=(float)d;
		System.out.println("the float value is "+f);
		
		long l=(long)f;
		System.out.println("the long value is "+l);
		
		int i=(int)l;
		System.out.println("the integer value is "+i);
		
		short s=(short)i;
		System.out.println("the short value is "+s);
		
     	byte b=(byte)s;
		System.out.println("the short value is "+b);
   
	}

}
       byte b=10;
       short s=50;
       int i=65000;
       float f=25.16f;
       long l=787787;
       double d=52.89;
       
       char ch='A';
       boolean bo = true;
        
       i=b;
       System.out.println(i);  //implicit type converstion
       
       b=(byte)i;
       System.out.println(b);   //expilicit type converstion



Scanner Class
import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the byte value :");
		byte bt=sc.nextByte();
		System.out.println("the byte value you entered is "+bt);
		System.out.println("enter the short value :");
		short sh=sc.nextShort();
		System.out.println("the short value you entered is "+sh);
		System.out.println("enter the integer value :");
		int it=sc.nextInt();
		System.out.println("the integer value you entered is "+it);
		System.out.println("enter the long  value :");
		long lg=sc.nextLong();
		System.out.println("the long value you entered is "+lg);
		System.out.println("enter the float value :");
		float ft=sc.nextFloat();
		System.out.println("the float value you entered is "+ft);
		System.out.println("enter the string value :");
		String str=sc.next();
		System.out.println("the string value you entered is "+str);
		System.out.println("enter the string value :");
		String str1=sc.nextLine();
		System.out.println("the string value you entered is "+str1);

	}

}

Static and nonstatic 

public class StaticOrNonstatic {
	static {
System.out.println("hi");
	}
	{
	
		System.out.println("hello");
		
	}
	public Test2()
	{		
		System.out.println("great");
	}
	
	
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	
}
}
output=hi
=hiii hiii


public class StaticOrNonstatic {
	
//	static {
//System.out.println("hi");
//	}
	{
	
		System.out.println("hello");
		
	}
	public StaticOrNonstatic()
	{		
		System.out.println("great");
	}
	
	
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	new StaticOrNonstatic();
}
}

output=hiii hiii
hello
great

public class StaticOrNonstatic {
	
//	static {
//System.out.println("hi");
//	}
	{
	
		System.out.println("hello");
		
	}
	public StaticOrNonstatic()
	{		
		System.out.println("great");
	}
	
	
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	//new StaticOrNonstatic();
}
}

output=hiii hiii

public class StaticOrNonstatic {
	
	static int number;
//static {
//System.out.println("hi");
//	}
//	{
//	
//		System.out.println("hello");
//		
//	}
	public StaticOrNonstatic()
	{		
		System.out.println("great");
		number=10;
	}
	
	
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	//new StaticOrNonstatic();
	StaticOrNonstatic t1=new StaticOrNonstatic();
	System.out.println(t1.number);
	
}
}

output=hiii hiii
great
10


public class StaticOrNonstatic {
	
	static int number;
static {
System.out.println("hi");
number=10;
	}
	{	
		System.out.println("hello");
		number=10;		
	}
	public StaticOrNonstatic()
	{		
		System.out.println("great");
	
	}
		
	public static void main(String[] args) {
	System.out.println("hiii hiii");
	//new StaticOrNonstatic();
//	StaticOrNonstatic t1=new StaticOrNonstatic();
//	System.out.println(t1.number);
	StaticOrNonstatic t1=new StaticOrNonstatic();
	StaticOrNonstatic t2=new StaticOrNonstatic();
	StaticOrNonstatic t3=new StaticOrNonstatic();
	StaticOrNonstatic t4=new StaticOrNonstatic();
	StaticOrNonstatic t5=new StaticOrNonstatic();
}
}
output=
hi
hiii hiii
hello
great
hello
great
hello
great


Arthematic operators

import java.util.Scanner;

public class ArthematicOpertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("enter second number: ");
        int num2 = sc.nextInt();
        int res1 = num1+num2;
        System.out.println("Addition result is:"+res1);
        System.out.println("=========================");
        int res2 = num1-num2;
        System.out.println("Substraction  result is:"+res2);
        System.out.println("=========================");
        int res3 = num1*num2;
        System.out.println("multiplication  result is:"+res3);
        System.out.println("=========================");
        int res4= num1/num2;
        System.out.println("division  result is:"+res4);
        System.out.println("=========================");
        int res5 = num1+num2;
        System.out.println("modulus  result is:"+res5);
        System.out.println("=========================");
    }
}
		//arthematic operators
		int i=1009;
		int j=906;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);


identifiers

import java.util.Scanner;

public class Identifiers {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of num1 : ");
System.out.println("the num1 value you entered is "+sc.nextInt());
System.out.println("Enter the value of num2 : ");
System.out.println("the num2 value you entered is "+sc.nextInt());
	}

}

conditional statements
import java.util.Scanner;

public class conditionalStatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1=sc.nextInt();
		if(num1>=30) {
			System.out.println("num1 is greater");
		}
		if(num1<=30) {
			System.out.println("num1 is lesser");
		}
		if(num1==30) {
			System.out.println("num1 is equal to 30");
		}
		else {
			System.out.println("hii");
		}
		
		System.out.println("enter the number 1 : ");
		int num1=sc.nextInt();
		
		if(num1==20) System.out.println("num1 is equal to 20");
		else if(num1<20)System.out.println("num1 is lesser than to 20");
		else System.out.println("num1 is greater than to 20");
       
	}

}
conditional operators

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 : ");
		int num1=sc.nextInt();
		System.out.println("enter the number 2 : ");
		int num2=sc.nextInt();
		System.out.println("enter the number 3 : ");
		int num3=sc.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("num1 is greater");
		}
		else if(num2>num1 && num2>num3){
			System.out.println("num2 is greater");
		}
			else {
				System.out.println("num3 is greater");
			}
		
	   System.out.println("============================");
		
	   System.out.println("enter the passcode : ");
	   String name=sc.next();
	   System.out.println("enter the key : ");
	   int key=sc.nextInt();
	   if (name.equals("akash")||key==10110) {
		System.out.println("entry permitted");   
	   }
	   else {
		   System.out.println("Not permitted");  
	   }
	   
	   

	}

}
different type of printing statements
package www.akash.home;

public class PrintStatements {

	public static void main(String[] args) {
		System.out.print("Hello akash");
		System.out.print("How are you");
		System.out.println("Hello akash");
		System.out.println("How are you");
		// printf,println.print are methods
		System.out.print("How are you");
		System.out.println("Hello akash");
	System.out.print("How are you");
		
		//printf
		System.out.printf("the year akash born in %d and the month is %s",2003,"July");
		//err
		System.err.println("Hello akash");
		System.err.print("How are you");
		System.err.printf("the year akash born in %d and the month is %s",2003,"July");
	}

}


//unary operators
//++(Increment)=pre and post
//--(decrement)=pre and post
		int aa=10,a=10;
		System.out.println(a);//10
		System.out.println(++a);//11
		System.out.println(a++);//11
		System.out.println(a);//12
		System.out.println("===========");
		
		System.out.println(aa);//10
		System.out.println(--aa);//9
		System.out.println(aa--);//9
		System.out.println(aa);//8


//Relational opertors
		int i=10;
		int j=89;
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i<j);
		System.out.println(i>j);
		System.out.println(i>=j);
		System.out.println(i<=j);
output=false
true
true
false
false
true

//conditional statements
//&&(conditional and) 
// ||(conditional or)
		int i=90;
		int j=100;
		System.out.println(i<j && i>j); output=false
		System.out.println(i<j || i>j); true

//assignment operator
		int i=1008;
		i+=1;
		System.out.println(i);
		i-=1;
		System.out.println(i);
		i*=2;
		System.out.println(i);
		i/=2;
		System.out.println(i);		


Decision making statements problem

//		Scanner sc=new Scanner(System.in);
//		String normal="clear";
//		System.out.println("Enter the fuel : ");
//		int fuel=sc.nextInt();
//		//System.out.println(" you Enter the fuel : "+fuel);
//		System.out.println("Enter the wheather : ");
//		String wheather=sc.next();
//		//System.out.println("Enter the fuel : "+wheather);
//		
//		
//		if (fuel>=5 && wheather.equals(normal)) {
//			System.out.println("you can go for trip");
//		}
//		else {
//			System.out.println("you can't go for trip");
//			
//			
//		}
//		if (fuel<5 || wheather!=normal ) { 
//			
//			System.out.println("Cnacel the trip ");
//		}
//			
//		else if(fuel>=5) {
//				System.out.println("refuel the vehicles");
//			}
//		else {
//				System.out.println("wait until wheather it gets better");
//			}
//			
//
//
//		
//		
//		}
//
//	}
//	
		        Scanner sc = new Scanner(System.in);
//		        String normal = "clear";
//
//		        System.out.println("Enter the fuel: ");
//		        int fuel = sc.nextInt();
//		        sc.nextLine(); 
//
//		        System.out.println("Enter the weather: ");
//		        String weather = sc.nextLine(); 
//
//		        if (fuel >= 5 && weather.equals(normal)) {
//		            System.out.println("You can go for the trip.");
//		        } 
//		        if (weather.equals(normal) && fuel >= 5) {
//		            System.out.println("You can go for the trip.");
//		        } else if (weather.equals(normal) && fuel < 5) {
//		            System.out.println("Fuel is low. Refill the fuel and then go for the trip.");
//		        } else if (!weather.equals(normal) && fuel >= 5) {
//		            System.out.println("Wait until the weather gets better.");
//		        } else {
//		            System.out.println("Cancel the trip.");
//		        }

      //  Scanner sc = new Scanner(System.in);
        String normal = "clear";

        System.out.println("Enter the fuel: ");
        int fuel = sc.nextInt();
        sc.nextLine(); 
        

        System.out.println("Enter the weather: ");
        String weather = sc.nextLine(); 

        if (fuel >= 5 && weather.equals(normal)) {
            System.out.println("You can go for the trip.");
        } 
        if (weather.equals(normal) || fuel >= 5) {
        	if (weather.equals(normal) && fuel < 5) {
                System.out.println("Fuel is low. Refill the fuel and then go for the trip.");
        	}
        	
        	if (!weather.equals(normal) && fuel >= 5) {
                System.out.println("Wait until the weather gets better.");
        	}
    
        	
        	
        } 
        else {
            System.out.println("Cancel the trip.");
        }

        String weekend="sunday";
        System.out.println("enter the day : ");
         String day1=sc.next();
         
        if(day1.equals(weekend)) System.out.println(" friend come for the trip ");
        	
        else System.out.println("fuck you");
        
        
             
		    }
		}

//looping statements exmaplez of while and do-while

package www.akash.home;

import java.util.Scanner;

public class loopps {

	public static void main(String[] args) {
		//while loops
		//		int i=0;
		//		while(i<=10) {
		//			
		//			while(j<=10) {}
		//			System.out.println("3*"+i+"="+i*3);
		//			i=i+1;
		//		}

		//		int i=0;
		//		while(i<10) {
		//			System.out.println(i);
		//			i++;
		//		}

		//do while
		//		int i=1;
		//		do {
		//			System.out.println(i);
		//			i++;
		//		}while(i<=0);


		//1)print 1 to 100 values
		//while
		//		int i=1;
		//		while(i<=100) {
		//			System.out.println(i);
		//			i++;
		//		}
		//do while
		//		int i=1;
		//		do {
		//			System.out.println(i);
		//			i++;
		//		}
		//		while(i<=100);



		//2)print even numbers between 200 and 500
		//using while
		//		int i=200;
		//		while(i<=500) {
		//			System.out.println(i);
		//			i=i+1;
		//			i++;			
		//		}

		//using do while 
		//		int i=200;
		//		do {
		//			System.out.println(i);
		//			i=i+1;
		//			i++;	
		//			
		//		}
		//		while(i<=500);


		//3)print the numbers which is divisible by 7 for the range of 150 to 200
		//while loop
		//	int i=150;
		//	
		//		while(i<=200) {
		//			if(i%7==0) {
		//			System.out.println(i);
		//			
		//		}
		//			i++;
		//		}
		//or
		//		int i=154;
		//		while(i<=200) {
		//			System.out.println(i);
		//			i+=7;
		//		}


		//5)print the sum of the even numbers between 40 to 80
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the FirstNumber : ");
		//		int FirstNumber=sc.nextInt();
		//		System.out.println("enter the LastNumber : ");
		//		int LastNumber=sc.nextInt();
		//		while(FirstNumber<=LastNumber) {
		//			if(FirstNumber%2==0) {
		//				System.out.println(FirstNumber);
		//			}
		//			
		//			FirstNumber++;
		//		}
		//		6)Print the odd numbers between 200 to 25(reverse order)
		//		Scanner sc=new Scanner(System.in);
		//		System.out.println("enter the FirstNumber : ");
		//		int FirstNumber=sc.nextInt();
		//		System.out.println("enter the LastNumber : ");
		//		int LastNumber=sc.nextInt();
		//		while(FirstNumber>=LastNumber) {
		//			if(FirstNumber%2!=0) {
		//				System.out.println(FirstNumber);
		//			}
		//			
		//			FirstNumber--;
		//		}

		//4)prime number or not



		3)for loop
		    for(int i=0;i<=5;i++) {
		    	for(int j=0;j<=10;j++) {

		    		System.out.print(j);
		    	}
		    	System.out.println();
		    }


		for(int i=5;i>=1;i--) {
			System.out.println(i);
			5
			4
			3
			2
			1			
		}
		
		for(int i=5;i>=1;) {
			System.out.println(i);	
			i=i-2;
		}
		 
		int i;
		for( i=1;i<=10;i*=2) {
			System.out.println(i);
			
			

			 */
	/* 	

pattern programing 

package www.com.pattern;

public class pattern1 {

	public static void main(String[] args) {
		int i;
		System.out.println("#");

	}

}
//#

package www.com.pattern;

public class pattern2 {
	public static void main(String[] args) {
		
	
	for(int i=0;i<=5;i++) {
		System.out.println("#");
	}

	}}
//#
//#
//#
//#
//#
//#


package www.com.pattern;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
	int size=sc.nextInt();
		for(int i=0;i<=size;i++) {
			System.out.print(" # ");
		}

	}

}

//enter the size : 
//5
// #  #  #  #  #  # 


package www.com.pattern;

import java.util.Scanner;

public class patter4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
	int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
			System.out.print(" # ");
			}
			System.out.println();
		}

	}

}


//enter the size : 
//6
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 
// #  #  #  #  #  # 


package www.com.pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}



//
//enter the size : 
//5
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 


package www.com.pattern;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}


//enter the size : 
//5
//1 1 1 1 1 
//2 2 2 2 2 
//3 3 3 3 3 
//4 4 4 4 4 
//5 5 5 5 5 

package www.com.pattern;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		int count=1;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}
	}

//enter the size : 
//5
//1 2 3 4 5 
//6 7 8 9 10 
//11 12 13 14 15 
//16 17 18 19 20 
//21 22 23 24 25 


package www.com.pattern;

import java.util.Scanner;

public class patter8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size : ");
		int size=sc.nextInt();
		int count=size*size;
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				System.out.print(count+" ");
				count =count -1;
			}
			System.out.println();
		}

	}

}


//enter the size : 
//5
//25 24 23 22 21 
//20 19 18 17 16 
//15 14 13 12 11 
//10 9 8 7 6 
//5 4 3 2 1 

package www.com.pattern;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	System.out.println("enter the size : ");
		
		for(int i=1;i<=5;i++) {
			int k=i;
			for(int j=1;j<=5;j++) {
				
				System.out.print(k+" ");
				k=k+5;
			}
			System.out.println();
		}
	}

}
//1 6 11 16 21 
//2 7 12 17 22 
//3 8 13 18 23 
//4 9 14 19 24 
//5 10 15 20 25 


package www.com.pattern;

public class program10 {

	public static void main(String[] args) {
    for(int i=0;i<=5;i++) {
    	
    	for(int j=0;j<=5;j++) {
    		System.out.print("# ");
    }
    	
     	for(int j=0;j<=5;j++) {
    		System.out.print("% ");
    }
  System.out.println();
	}
	}
}
//
//# # # # # # % % % % % % 
//# # # # # # % % % % % % 
//# # # # # # % % % % % % 
//# # # # # # % % % % % % 
//# # # # # # % % % % % % 
//# # # # # # % % % % % % 


package www.com.pattern;

public class pattern11 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * * 

package www.com.pattern;

public class pattern12 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}

	}

}

//0
//11
//222
//3333
//44444
//555555

package www.com.pattern;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i; j++) {

				System.out.print(j);
			}
			System.out.println();
		}
	}

}
//1
//12
//123
//1234
//12345

package www.com.pattern;

public class pattern14 {

	public static void main(String[] args) {
		
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i; j++) {

				System.out.print(count+" ");
				count++;
				
				
			}
			System.out.println();
			
		}

	}

}
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 


package www.com.pattern;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    for(int i=0;i<=5;i++) {
	    	
	    	for(int j=0;j<=5;j++) {
	    		System.out.print("# ");
	    }
			for(int j=0;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	
	}
}



//# # # # # # * 
//# # # # # # * * 
//# # # # # # * * * 
//# # # # # # * * * * 
//# # # # # # * * * * * 
//# # # # # # * * * * * *

package www.com.pattern;

public class pattern16 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}


	}

}
//output
//* * * * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 
//* 
package www.com.pattern;

public class program17 {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {	        
		    System.out.print("-");
		}
			for(int j=1;j<=5;j++) {	        
			    System.out.print("#");
			    
			
		}
		System.out.println();

	}
	}
}

//------#####
//-----#####
//----#####
//---#####
//--#####
//-#####


package www.com.pattern;

public class program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {	        
		    System.out.print("-");
			}
		
			for(int j=1;j<=5;j++) {	        
			    System.out.print("#");
			    
		}
		System.out.println();
	}
	}

}
//-#####
//--#####
//---#####
//----#####
//-----#####

	}

}
	package www.akash.home;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		
	
	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10 
	//11 12 13 14 15
	int count=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.printf("%3d",count);
			count++;
			
		}
		System.out.println("");
		
	}
	
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<=50;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		for(int i=1;;) {
			if(i<=3) {
				System.out.println(i);
				i++;
			}
			
		}
		
		
		
	}

}



*/

/* 
package www.akash.home;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		/*for(int i=0;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		* * * * * * 
		* * * * * 
		* * * * 
		* * * 
		* * 
		* 
		
	
	//1 
	//2 3 
	//4 5 6 
	//7 8 9 10 
	//11 12 13 14 15
	int count=1;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=i;j++) {
			System.out.printf("%3d",count);
			count++;
			
		}
		System.out.println("");
		
	}
	
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<=50;j++) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		
		for(int i=1;;) {
			if(i<=3) {
				System.out.println(i);
				i++;
			}
			
		}
		
		
		int i;
		int j;
		int count=1;
		for(i=0;i<=6;i++) {						
			for(j=1;j<=i;j++) {
				System.out.printf("%3d",+count);
				count++;
				
			}
			System.out.println();
		}
		  1
		  2  3
		  4  5  6
		  7  8  9 10
		 11 12 13 14 15
		 16 17 18 19 20 21
		
		

		        int i, j, k;
		        int z = 1; // Controls the number of stars

		        for (i = 1; i <= 6; i++) {
		            // Print leading spaces
		            for (j = 6 - i; j >= 1; j--) {
		                System.out.print(" ");
		            } 					
		            
		            // Print stars
		            for (k = 1; k <= z; k++) {
		                System.out.print("*");
		            }
		            z += 2; // Increase the number of stars for the next row
		            System.out.println(); // Move to the next line
		        }

		        
		         *
		        ***
		       *****
		      *******
		     *********
		    ***********
		        for (i = 0; i < 6; i++) {
		            // Print leading spaces
		            for (j = 0; j < i; j++) {
		                System.out.print(" ");
		            }
		            // Print stars
		            for (k = 0; k < (2 * (6 - i) - 1); k++) {
		                System.out.print("*");
		            }
		            System.out.println(); // Move to the next line
		            
		           ***********
		            *********
		             *******
		              *****
		               ***
		                *
		        } 
		int i,j;
		
		for(i=1;i<=5;i++) {
			int count=i;
			for(j=1;j<=5;j++) {
				
				System.out.print(count+" ");
				count=count+5;
			}
			
			System.out.println();
		}
		    
	
	}

1 6 11 16 21 
2 7 12 17 22 
3 8 13 18 23 
4 9 14 19 24 
5 10 15 20 25 
		
int i,j;
		int count=1;
		for(i=1;i<=5;i++) {
			
			for(j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}	
}
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
		
		
		
		
		
		int i,j;
		for(i=0;i<=5;i++) {
			for(j=5;j>=i;j--) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
* 
 AlphaBet programming from A to Z

 
package www.pattern.alpha.numbers;

import java.util.Scanner;

public class patter {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n : ");
	int n=sc.nextInt();
	int i;
	int j;//A
	for(i=0;i<=n-1;i++) {
		for(j=0;j<=n-1;j++) {
			if(i==0 && j!=0 && j!=(n-1)||i==(n/2)||j==0 && i!=0 || j==(n-1) && i!=0) {
			System.out.print(" * ");		
			}
			else {
				System.out.print("   ");
			}
			
		}//B
		System.out.print("   ");
			for(j=0;j<=n-1;j++) {
				if(i==0 && j!=(n-1) || j==0 || i==(n-1) && j!=(n-1) ||j==(n-1) && i!=0 &&  i!=(n/2) && i!=(n-1)  || i==(n/2) && j!=(n-1)  ) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
				
			}//C
			System.out.print("   ");
			for(j=0;j<=n-1;j++) {
				if( i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}//D
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0 ||i==0 && j!=0 && j!=(n-1)  ||i==(n-1) && j!=0 && j!=(n-1) || j==(n-1) && i!=0 && i!=(n-1) ) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//E
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0 || i==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//F
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0  && i!=0 ||  i==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//G
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 && j!=0 || j==0 && i!=(n-1) && i!=0 || i==(n-1) && j!=0 || i==(n/2) && j>=(n/2) || j==(n-1) && i>=n/2) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//H
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0||j==(n-1) || i==(n/2) ) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				//I
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0||i==(n-1)||j==(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}//J
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(i==0 || j==(n/2) || i==(n-1) && j<=(n/2)) {
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {
					if(j==0  || i+j == (n/2) || i-j==(n/2)) {  //k
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//L
					if(j==0 ||i==(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//M
					if ((i == j && i <= n / 2) || (i + j == n - 1 && j >= n / 2) || j==0 || j==(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//N
					if (j==0 || i == j || j==(n-1)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//o
					if(j==0 && i!=0 && i!=(n-1) ||i==0 && j!=0 && j!=(n-1) && j!=0  ||i==(n-1) && j!=0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i!=(n-1) ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//P
					 if ((j==0||i == 0 || i == n / 2) && j < n - 1 || j == n - 1 && i < n / 2 ) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//Q
					  if (j==0 && i!=0 && i!=(n-1) ||i==0 && j!=0 && j!=(n-1) && j!=0  ||i==(n-1) && j!=0 && j!=(n-1) && j!=0 || j==(n-1) && i!=0 && i!=(n-1)||i==j && j>=(n/2)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//R
					  if (j==0||i == 0 && j<=(n/2)|| i == n / 2 && j<=(n/2) ||  i - j == (n / 2)|| j==(n/2) && i<=(n/2)) {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//s
					  if (i == 0 || i == n / 2 || i == n - 1 || j==0 && i<=(n/2)|| j==(n-1) && i>=(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//T
					  if (i==0 || j==(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//U
					  if (j==0 && i!=(n-1) ||i==(n-1)&& j!=0 && j!=(n-1) ||j==(n-1) && i!=(n-1) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//V
					  if (j==0 && i<=(n/2) ||i-j==(n/2)||i+j==(n-1)+(n/2)||j==(n-1)&& i<=(n/2) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//W
					  if (j==0 && i!=(n-1)||i==(n-1)&& j!=0&& j!=(n-1)||j==(n-1) && i!=(n-1)||j==(n/2)&&i>=(n/2))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//X
					  if (i==j||i+j==(n-1))  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//W
					  if (i==j && j<=(n/2) || i+j==(n-1) && i<=(n/2) || j==(n/2) && i>=(n/2) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.print("   ");
				for(j=0;j<=n-1;j++) {//Z
					  if (i==0||i+j==(n-1)||i==(n-1) )  {  
					System.out.print(" * ");		
					}
					else {
						System.out.print("   ");
					}
					
				}
				System.out.println(" ");
			}
	
}
}


decision making statements



package www.akash.home;

import java.util.Scanner;

public class Decisionmakingstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the marks of a student  : ");
		int marks=sc.nextInt();
		if(marks<35)System.out.println("Student is failed");
		else if(marks==35)System.out.println("Student is pass");
		else if(marks>35 && marks<70) System.out.println("Student secured third class");
		else if(marks>=70 && marks<=85) System.out.println("Student secured second class");
		else if (marks>85)System.out.println("Student is first class");
		else System.out.println("Student is failed");
		
		
		sc.close();

	}

}
package www.akash.home;

import java.util.Scanner;

public class Decisionmakingstatements {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the day  : ");
		String day=sc.next();
		if(day.equals("satday") ||day.equals("sunday")) System.out.println("Yayy, it's a weekend");
		else System.out.println("Uff,it's a weekday");
		sc.close();

	}

}
Enter the day  : 
monday
Uff,it's a weekday
Enter the day  : 
satday
Yayy, it's a weekend





array


import java.util.Scanner;

public class arrayy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of wings undre beta group : ");
		int wings=sc.nextInt();
		System.out.println("enter the count of college constructed by keerthi  under each wing : ");
		int col=sc.nextInt();
		
		
		//create 2d array
		long arr[][]=new long[wings][col];
		long overaall_revenue=0;
		
		//collecting data
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("inside the wing number : "+(i+1));
			for( int j=0;j<arr[i].length;j++) {
				
				System.out.println("enter the revenue made by college number - "+(j+1));
				arr[i][j]=sc.nextLong();
				overaall_revenue=overaall_revenue +arr[i][j];
				
				
				
			}
			
		}
		System.out.println("-----------------------");
		//display data
         for(int i=0;i<arr.length;i++) {
			
			System.out.println("inside the wing number : "+(i+1));
			for( int j=0;j<arr[i].length;j++) {
				
				System.out.println("revenue made by college number - "+(j+1)+ "is = "+arr[i][j]);
			}
			
		}
         System.out.println("--------------------------");
         System.out.println("overall revenue genreates of all beta instituion are = "+overaall_revenue);
	}}


	//sum of an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	
	int a[]= new int[n];
	System.out.println("enter the elemsts of an array");
	
	for(int i=0;i<n;i++) {
		System.out.print("enter the element at "+(i+1)+" :");
		 a[i]=sc.nextInt();
	}
	int sum=0;
	
	
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("the sum of the array is "+sum);
	
	
}}


//average of an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	System.out.println("enter the elemsts of an array");
	int sum=0;
	float avg=0;
	int a[]=new int[n];
	for(int i=0;i<a.length;i++) {
		
		
		System.out.print("enter the index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		
		sum=sum+a[i];
		}
	avg=(sum/n);
	System.out.println("the average of array is "+avg);
	}
}

//reversing an array
package www.akash.home;

import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	
	int a[]=new int[] {1,2,3,45,4};
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}}



package www.akash.home;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	
	int a[]= new int[n];
	System.out.println("enter the elemsts of an array");
	
	for(int i=0;i<n;i++) {
		System.out.print("enter the element at "+(i+1)+" :");
		 a[i]=sc.nextInt();
	}
	int sum=0;
	
	
	
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println("the sum of the array is "+sum);
	//arrays.toString()=to print in a arrays form
	System.out.println(Arrays.toString(a));
	
	
}}



//joining two array into single arrays
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the size of an array1 : ");
	int n1=sc.nextInt();
	String[] arr1=new String[n1];
	for(int i=0;i<n1;i++) {
		System.out.println("enter the arr1 of index of  "+(i+1)+" : ");
		arr1[i]=sc.next();
	}
	
	
	System.out.println("enter the size of an array2 : ");
	int n2=sc.nextInt();	
	String[] arr2=new String[n2];	
	for(int i=0;i<n2;i++) {
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		arr2[i]=sc.next();
	}
	
	
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	System.out.println("after joing arr1 and arr2 with arr3");
	
	String[] arr3=new String[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++) {
		arr3[i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++) {
		arr3[i+arr1.length]=arr2[i];
	}
	System.out.println(Arrays.toString(arr3));
	
}}

//largest number in given array
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
  
public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) {
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int largestnum=a[0];
	int maxIndex=0;
	int secondLargest=a[0];
	int secondMaxIndex=0;
	for(int i=0;i<a.length;i++) {
		if(largestnum<a[i]) {
			largestnum=a[i];
			maxIndex=i;
		}
	
    }
		
	}System.out.println("the largest value in given array is :  "+largestnum);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	
}}


package www.akash.home;
import java.util.Arrays;


public class Array {
  
public static void main(String[] args) { 
	
	int[] a=new int[] {2,4,23,65,76};
	int max=a[0];
	int secondMax=a[1];
	  for (int i = 0; i < a.length; i++) {
          if (a[i] > max) {
              secondMax = max; // Update second largest before replacing largest
              max = a[i];
          } else if (a[i] > secondMax && a[i] != max) {
              secondMax = a[i];
          }
      }
	System.out.println("second maximum elemets is "+secondMax);
	
}
}

//largest number in given array
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array{
  
public static void main(String[] args) { 
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) 
	{
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int largestnum=a[0];
	int maxIndex=0;

	for(int i=0;i<a.length;i++) {
		if(largestnum<a[i]) {
			largestnum=a[i];
			maxIndex=i;
		}
	
    }
	System.out.println("the largest value in given array is :  "+largestnum);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	}

	
}
*/
/* 
//second largest number 
package www.akash.home;
import java.util.Arrays;
import java.util.Scanner;

public class Array{
  
public static void main(String[] args) { 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array : ");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("enter the arrays");
	for(int i=0;i<a.length;i++) 
	{
		System.out.println("enter the arr1 of index of "+(i+1)+" : ");
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));
	int max1=0;
	int max2=0;
	int maxIndex=0;
	int maxIndex2=0;
	
	if(a[0]>a[1]) {
		max1=a[0];
		max2=a[1];
	}
	else {
		max1=a[1];
		max2=a[0];
	}
	for(int i=2;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
			maxIndex=i;
			
		}
		else if(a[i]>max2){
			
			max2=a[i];
			maxIndex2=i;
		}
	}
	System.out.println("the firstlargest element is"+max1);
	System.out.println("the secondlargest element is"+max2);
	System.out.println("the largest value index  in given array is : "+maxIndex);
	System.out.println("the Secondlargest value index  in given array is : "+maxIndex2);
}}

output=enter the size of an array : 
5
enter the arrays
enter the arr1 of index of 1 : 
32
enter the arr1 of index of 2 : 
545
enter the arr1 of index of 3 : 
23
enter the arr1 of index of 4 : 
56
enter the arr1 of index of 5 : 
45
[32, 545, 23, 56, 45]
the firstlargest element is545
the secondlargest element is56
the largest value index  in given array is : 0
the Secondlargest value index  in given array is : 3




Linear Search
//with static input 
package www.akash.home;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr=new int[] {34,21,334,23412,2345,4512,244,223,2331,1,4324};
		int key=1;
		 boolean found = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				System.out.println("array key found at index  : "+i);
				 found=true;
				break;				
			}
			
			}
		if (!found) {
            System.out.println("Key is not found in the array.");
		}
		

	}

}

//with dyanmic input
package www.akash.home;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a=new int[]{12,21,23,11,3,4};
		for(int i=0;i<a.length-1;i++) { //i < arr.length - 1 it does not include last elememnt
			 for(int j=0;j<a.length-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
				 
			 }
					 
		}
		 System.out.println("sorted array is ");

		 System.out.println(Arrays.toString(a));
	 
	}

}
output=
sorted array is 
[3, 4, 11, 12, 21, 23]


with dynamic input
package www.akash.home;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array : ");
		int n=sc.nextInt();
		
		int a[]= new int[n];
		System.out.println("enter the elemsts of an array");
		
		for(int i=0;i<n;i++) {
			System.out.print("enter the element at "+(i+1)+" :");
			 a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length-1;i++) { //i < arr.length - 1 it does not include last elememnt
			 for(int j=0;j<a.length-i-1;j++) {
				 if(a[j]>a[j+1]) {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
				 
			 }
					 
		}
		 System.out.println("sorted array is ");

		 System.out.println(Arrays.toString(a));
	 
	}

}
	output=
enter the size of an array : 
6
enter the elemsts of an array
enter the element at 1 :3234
enter the element at 2 :23
enter the element at 3 :34
enter the element at 4 :1
enter the element at 5 :67845
enter the element at 6 :43
sorted array is 
[1, 23, 34, 43, 3234, 67845]





pallindrom
package www.akash.home;

public class pallindrom {

	public static void main(String[] args) {
		String str="acecar";
		char[] arr=str.toCharArray(); //The toCharArray() method in Java converts a string into a character array, 
		String rev="";
		for(int i=arr.length-1;i>=0;i--) {
			rev=rev+arr[i];
		}
		if(str.equals(rev)) {
		System.out.println("it is palidrome");
		}
		else {
			System.out.println("it is not palidrome");
	
		}

	}

		}


string reverse
package www.akash.home;
  
 public class RevString {
 
 public static void main(String[] args) 
 { 
	 String str="racecar"; char[]
 arr=str.toCharArray(); //The toCharArray() method in Java converts a string into a character array, 
 String rev=""; 
 for(int i=arr.length-1;i>=0;i--) {
rev=rev+arr[i];
} 
 System.out.println(rev);
 
 }
 
 }


 panagram
 package www.akash.home;

public class panagram {

	public static void main(String[] args) {
	 String str="the quick brown fox jumps over the lazy dog";
	 str=str.toLowerCase();
	boolean ispanagram=true;
     for(char ch='a';ch<='z';ch++) {
    	 if(!str.contains(String.valueOf(ch))){  //String.valueOf(ch) converts the character into a string
    		 ispanagram=false;
    		 break;
    		 
    	 }
    	 
     }
     if (ispanagram) System.out.println("It is a pangram.");
         
      else {
         System.out.println("It is not a pangram.");
     }

     
	}

}
simple 


package www.akash.home;

public class panagram {

	public static void main(String[] args) {
	 String str="the quick brown fox jumps over the lazy dog";	 
	
	 for(char ch='a';ch<='z';ch++) {
		 if(!str.contains(String.valueOf(ch))) {
			 System.out.println("it is not panagram");
			 break;
		 }
		 
	 }
	 System.out.println("it is panagram");
	}}

*/

/*
public class StringMethods {

	public static void main(String[] args) {
		
//literal based representations =equals
				String s1="akash";
				String s2="akash";
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2");
				}
				if(s1==s2) {
					System.out.
					println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
		 //output=s1 equals to s2
				// address is equals

//object based representation =equals
				String s1=new String("Akash");
				String s2=new String("Akash");
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2 ");
				}
				if(s1==s2) {
					System.out.println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
          output=s1 equals to s2
        		  address are not equals


//literal based representations =equalsIgnoreCase
		String s1="akash";
		String s2="AKASH";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2");
		}
		if(s1==s2) {
			System.out.
			println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}

		output=s1 equals to s2
				address are not equals


//object based representation =equalsIgnoreCase
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2 ");
		}
		if(s1==s2) {
			System.out.println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}
		output=s1 equals to s2
				address are not equals
				}

}



//alpahbets
import java.util.Scanner;

public class patternNew {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int i;
		int j;
		//B
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++) {
				if(i==0&&j!=(n-1)||j==0||i==(n-1)&&j!=(n-1)||j==(n-1)&&i!=0&&i!=(n-1)||i==(n/2)) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}
      System.out.println("");
}
}
}
		//v
		for(i=0;i<=n-1;i++) {
			for(j=0;j<=n-1;j++) {
				if(j==0&&i<=(n/2)||i+j==(n-1)+(n/2)||i-j==(n/2)||j==(n-1)&&i<=(n/2)) {
				System.out.print(" * ");		
				}
				else {
					System.out.print("   ");
				}
			}
      System.out.println("");
}
}
}



StringMethods

public class StringMethods {

	public static void main(String[] args) {
		/*
//literal based representations =equals
				String s1="akash";
				String s2="akash";
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2");
				}
				if(s1==s2) {
					System.out.
					println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
		 //output=s1 equals to s2
				// address is equals

//object based representation =equals
				String s1=new String("Akash");
				String s2=new String("Akash");
				if(s1.equals(s2)) {
					System.out.println("s1 equals to s2");
				}
				else {
					System.out.println("s1 is not equals s2 ");
				}
				if(s1==s2) {
					System.out.println("address is equals");	
				}
				else {
					System.out.println("address are not equals");	
				}
          output=s1 equals to s2
        		  address are not equals


//literal based representations =equalsIgnoreCase
		String s1="akash";
		String s2="AKASH";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2");
		}
		if(s1==s2) {
			System.out.
			println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}

		output=s1 equals to s2
				address are not equals


//object based representation =equalsIgnoreCase
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("s1 is not equals s2 ");
		}
		if(s1==s2) {
			System.out.println("address is equals");	
		}
		else {
			System.out.println("address are not equals");	
		}
		output=s1 equals to s2
				address are not equals
				 
		
//compareTo
		String s1=new String("Akash");
		String s2=new String("Akash");
		if(s1.compareTo(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
		}
		
//	.compareToIgnoreCase
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
			
		}
		
		
//compareTo with memory difference
				String s1=new String("Akash");
				String s2=new String("akash");
				if(s1.compareTo(s2)==0) {
					System.out.println("it is a same");
				}
				else {
					System.out.println("it is not same");
				}
		
		System.out.println(s1.compareTo(s2));
		output=it is notsame
                -32
		
//compareToIgnoreCase with memory difference
		String s1=new String("Akash");
		String s2=new String("akash");
		if(s1.compareToIgnoreCase(s2)==0) {
			System.out.println("it is a same");
		}
		else {
			System.out.println("it is not same");
			
		}
		System.out.println(s1.compareTo(s2));
		output=it is a same
                -32

		
		
		
//charAt
		    String s1 = "akashAkashAKash";
	       System.out.println(s1.charAt(9)); //output = h
	       System.out.println(s1.charAt(90)); //output =Index 90 out of bounds for length 15
				int i=s1.charAt(9);
				System.out.println(i);
				
System.out.println("=======================================");
				
//indexOf3
          String s1 ="SachinRameshGandhi";
          System.out.println(s1.indexOf("a"));//1
          System.out.println(s1.indexOf("Ramesh"));//6
          System.out.println("=======================================");
          
		
//contains
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.contains("Ramesh"));//true
		System.out.println(s1.contains("Uamesh"));//false
		System.out.println(s1.contains("RAM"));//false
		System.out.println("=======================================");

//endsWith
		String s1 ="SachinRameshGandhi";
		boolean res=s1.endsWith("Gandhi");//true
		System.out.println(res);      
		System.out.println(s1.endsWith("Hi"));//false
		System.out.println(s1.endsWith("i"));//true

//hashCode
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.hashCode()); //output=returns a hash value of an objects,850348197
	
//getClass
		String s1 ="SachinRameshGandhi";
		System.out.println(s1.getClass());
		//output=class java.lang.String
	
	}


}
		//lastIndexOf		
		String s1 ="SachinRameshGandhi";
		 System.out.println(s1.lastIndexOf("a"));//13
        System.out.println("=======================================");
       
       
//isBlank
		String s1="";
		String s2="     ";
		System.out.println(s1.isBlank());  //output=true				                              	
		System.out.println(s2.isBlank());     //true
		System.out.println("=======================================");
		

//isEmpty
		String s1="";
		String s2="     ";
		System.out.println(s1.isEmpty());// true
		System.out.println(s2.isEmpty());//false
		System.out.println("=======================================");
		
		
//length	
String s1 ="SachinRameshGandhi";
System.out.println(s1.length()); //18
System.out.println("=======================================");


//replace		
String s1 ="SachinRameshGandhi";
System.out.println(s1.replace("Sachin","akash"));

		
	
//startsWith
String s1 ="SachinRameshGandhi";
System.out.println();



package www.akash.home;

public class Array {
 
public static void main(String[] args) {
//2D array	 
	int arr[][]=new int[3][2];
	arr[0][0]=1;
	arr[0][1]=2;
	
	arr[1][0]=1;
	arr[1][1]=2;
	
	arr[2][0]=1;
	arr[2][1]=2;
	
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	
System.out.println("==============================");
//or	


	int arr1[][]= {
			{1,2},
			{3,4},
			{5,6}
	};
	int size=0;
	for(int i=0;i<arr1.length;i++) {
		for(int j=0;j<arr1[i].length;j++) {
			System.out.print(arr1[i][j]+" ");
			size+=1;
		}
		System.out.println();
	
		
		
	}
	System.out.println(size);
 }
 
 }



package www.akash.home;

public class Array {
 
public static void main(String[] args) {
	
//jagged array	 
		int arr[][]=new int[3][];
		
		 arr[0] = new int[3];  
	     arr[1] = new int[5];  
	     arr[2] = new int[2];
	     
	     
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=4;
		
		arr[1][0]=1;
		arr[1][1]=2;
		arr[1][2]=2;
		arr[1][3]=2;
		arr[1][4]=2;
		
		arr[2][0]=1;
		arr[2][1]=2;
		int size=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				size+=1;
			}
			System.out.println();
		
			
			
		}
		System.out.println(size);
		
		System.out.println("===================================="); 
		//or
		int arr1[][]= {
				{1,2},
				{3,4,45,2,452,5},
				{5,6,6,5}
		};
		int sizee=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
				sizee+=1;
			}
			System.out.println();
		
			
			
		}
		System.out.println(sizee);
	 }
	 
	 
}



}


}

	*/



		 	


