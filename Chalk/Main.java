#include<iostream>
#include<math.h>
using namespace std;
int main()
{
 float n,k,l,x;
  cin>>n;
  k=(sqrt(n));
  x=1/k;
  l=floor(n+x*n)+1;
  cout<<l;
}