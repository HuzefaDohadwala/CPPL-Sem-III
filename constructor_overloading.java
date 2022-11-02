
class area{
    int l1 , l2;
    area(int x , int y){
        l1=x+10;
        l2=y*2;
        area();
        
    }
    
    area(int x){
        l1=x+10;
        l2=x;
        area();
    }
    
    int area(){
     System.out.println("area is:");        
     System.out.println(l1*l2);
     return 0 ;
    }
    
}
public class Main
{
	public static void main(String[] args) {
		area obj1 = new area (2,10);
		area obj2 = new area (10);
	}
}
