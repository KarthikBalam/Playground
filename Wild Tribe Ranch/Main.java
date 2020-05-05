#include<iostream>
int main()
{
  int max,flor;
  std::cin>>max>>flor;
  if(max < flor)
  {
    std::cout<<"Sorry, you can't enter";
  }
  else if(max == flor)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Yes, you can enter.";
  return 0;
}