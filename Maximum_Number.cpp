#include <iostream>
#include<limits.h>
using namespace std;

int main(){

  int arr[]={1,3,4,34,35,65,76,37,97,54,10};
  int size=11;

  int maxNum= INT_MIN;
  
  for(int i=0;i<size;i++){
    if (arr[i]>maxNum)
    {
    maxNum=arr[i];
    }
  }

  cout<< "Maximum number: "<<maxNum<<endl;
}
