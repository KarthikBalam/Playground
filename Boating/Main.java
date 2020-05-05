#include<iostream>
using namespace std;
int main()
{
  int weight,adult=75,childweight=30,children,adu;
  cin>>weight>>adu>>children;
  if(weight > (adult*adu)+(childweight*children))
  {
	cout<<"Boat is stable";
  }
  else
  {
	cout<<"Boat will drow";
  }
  return 0;
}