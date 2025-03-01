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


*/