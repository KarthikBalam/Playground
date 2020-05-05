#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int se=0,sd=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      se=se+a[i];
    else
      sd=sd+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<se;
  cout<<"\nThe sum of the odd numbers in the array is "<<sd;
  
}