#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,a;
  int x2=3,y2=4;
  cin>>x1>>y1;
  a= sqrt(pow(x2 - x1, 2) + pow(y2 -y1, 2));
  cout<<a;
  return 0;
}