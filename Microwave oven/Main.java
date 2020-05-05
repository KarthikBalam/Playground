#include<iostream>
using namespace std;
int main()
{
  int a;
  float b,c;
  cin>>a;
  cin>>b>>c;
  if(a==2)
  {c=b*50 /100;
    cout<<c+b;}
  else if(a==3){
	c=b*2;
    cout<<c;}
  else{
    cout<<"Number of items is more";}
}