class excep1{
    excep1(){
        try{
            int arr[] = {1,4,3,7};
            System.out.println(arr[8]);
        }
        catch(Exception e){
            System.out.println("Try catch Exception");
        }

    }

};
class excep2{
    excep2(int x)
    {
        if(x<50){
            throw new ArithmeticException("Throw catch Exception");
        }
        else{
            System.out.println("x is grater than 50");
        }

    }



};


class exception {
    public static void main(String [] args) {
        excep1 obj1 = new excep1();
        excep2 obj2 = new excep2(20);

    }
}
