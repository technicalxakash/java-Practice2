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




*/

