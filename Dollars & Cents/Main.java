#include<iostream>
using namespace std;
int main()
{
 int a,b,c,d;
  cin>>a>>b>>c>>d;
  int t,m;
  t=a+c;
  m=b+d;
  if(m>100)
  {
    t=t+1;
    m=m-100;
  }
  cout<<t;
  cout<<"\n"<<m;
}