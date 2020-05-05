#include<iostream>
using namespace std;
int main()
{
  float cost,unit;
  int bill;
  cin>>unit;
  if(unit<=200)
  {
    cost=0.5;
    bill=cost*unit;
    cout<<"Rs."<<bill;
  }
  else if((unit>200)&&(unit<=400))
   {
	cost=0.80;
     bill=cost*unit+200;
     cout<<"Rs."<<bill;
   }
   else
   {
     cost=1.25;
     bill=cost*unit+425;
     cout<<"Rs."<<bill;
   }
 return 0;
}