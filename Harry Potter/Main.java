#include<iostream>
using namespace std;
int main()
{
  int num,last,first,tot;
  cin>>num;
  last=num%10;
  tot=last;
  first=(num/1000)%10;
  tot=tot+first;
  cout<<tot;
  return 0;
}