#include<iostream>
using namespace std;
int main()
{
 int n,i,c=0;
  cin>>n;
  int a[n],l;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  cin>>l;
  for(i=0;i<n;i++)
  {
    if(a[i]==l)
                {
                        c=1;
                        
                        break;
                }
}
  if(c==1)
  {
    cout<<"She passed her exam";
  }else
    cout<<"She failed";
}