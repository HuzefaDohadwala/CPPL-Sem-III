/******************************************************************************
Method overloading is also known as Compile-time Polymorphism, Static Polymorphism, or Early binding in Java. 
In Method overloading compared to parent argument,
child argument will get the highest priority. 

*******************************************************************************/
class sum{
 void sum(int x , int y){
    System.out.println("adding two numbers");
    System.out.println(x+y);
}
 double sum(double x , double y){
    System.out.println("adding two numbers");
    System.out.println(x+y);
    return 0;
}
 void sum(int x , int y,int z){
    System.out.println("adding three numbers");
    System.out.println(x+y+z);
}
}
public class Main
{
	public static void main(String[] args) {
		sum obj = new sum();
		obj.sum(10,20);
		obj.sum(11.3,55.6);
		obj.sum(10,20,30);
	}
}
