#include <iostream>
using namespace std;

bool find(int arr[], int size, int key)
{
  //linear search
  for(int i=0;i<size;i++)
    {
      if(arr[i]==key)
        return true;
    }
  //not present
  return false;
}

int main()
{
  int arr[5]={1,2,5,16,300};
  int size=5;
  cout<<"Enter the key to find: "<<endl;
  int key;
  cin>>key;
  
  if(find (arr,size,key))
  {
    cout<<"Found"<<endl;
  }
  else
  {
    cout<<"Not found"<<endl;
  }
}
