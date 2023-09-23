#include<iostream>
using namespace std;

int fact(int n){
  if(n==1){
    return 1;
  }
  int ans=n*fact(n-1);
  return ans;
}

int main(){
  cout<<"Enter a number:";
  int n;
  cin>>n;
  int answer=fact(n);
  cout<<"The answer is :"<<answer;

  return 0;  
}
