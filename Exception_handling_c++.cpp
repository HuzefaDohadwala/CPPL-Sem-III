
#include <iostream>
using namespace std;

int main()
{
int x = 20;
try {
	cout << "X ="<< x << endl;
	if (x < 50)
	{
		throw x;
		cout<<"hello world";
	}
}
catch (int x ) {
	cout << "Try , throw , catch Exception \n";
}
return 0;
}

