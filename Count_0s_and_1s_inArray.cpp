#include <iostream>
using namespace std;

int main(){
  
int arr[]={0,1,0,1,0,1,0,0,0,0,1,0,1,1,0};
int size=15;

int numZero=0;
int numOne=0;
  
for(int i=0;i<size;i++)
{
  //if zero found, increment
  if(arr[i]==0)
  {
    numZero++;
  }
  if(arr[i]==1)
  {
    numOne++;
  }
}

cout << "Number of zeroes: "<<numZero<<endl;
cout << "Number of ones: "<<numOne<<endl;
  
}
