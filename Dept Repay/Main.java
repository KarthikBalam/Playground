#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  float f,g;
  std::cin>>a>>b>>c;
  d=(a*b*c)/100;
  e=d+a;
  f=(0.02)*d;
  g=e-f;
  std::cout<<d<<"\n"<<e;
  std::cout<<"\n"<<f;
  std::cout<<"\n"<<g;
}