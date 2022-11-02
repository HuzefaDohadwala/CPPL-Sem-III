/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;


void add(int x , int y){
    cout<<"adding two numbers:"<<endl;
    cout<<x+y<<endl;
}
void add(double x , double y ){
    cout<<"adding two numbers:"<<endl;
    cout<<x+y<<endl;
}
void add(int x , int y , int z ){
    cout<<"adding three numbers:"<<endl;
    cout<<x+y+z<<endl;
}
int main(){
add(10,20);
add(10.4,20.3);
add(10,20,30);    
return 0;    
}