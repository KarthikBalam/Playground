#include<iostream>
int main()
{
  long ch,firstnumber,secondnumber;
  std::cout<<"Enter first number : ";
  std::cin>>firstnumber;
  std::cout<<"Enter second number : ";
  std::cin>>secondnumber;
  std::cin>>ch;
  std::cout<<"Menu"<<"\n";
  std::cout<<"1.Addition"<<"\n";
  std::cout<<"2.Subtraction"<<"\n";
  std::cout<<"3.Multiplication"<<"\n";
  std::cout<<"4.Division"<<"\n";
  std::cout<<"5.Remainder"<<"\n";
  switch(ch)
  {
    case 1:std::cout<<firstnumber+secondnumber;
      break;
    case 2:std::cout<<firstnumber-secondnumber;
      break;
    case 3:std::cout<<firstnumber*secondnumber;
      break;
    case 4:std::cout<<firstnumber/secondnumber;
      break;
    case 5:std::cout<<firstnumber%secondnumber;
      break;
    default:
      std::cout<<"Invalid operation";
  }
  return 0;
}