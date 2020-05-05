#include<iostream>
#include<cmath>
using namespace std;
int main()
{
   int a,b;
  cin>>a>>b;
  int c=b/2;
  if(a==c)
  	cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  return 0;
}