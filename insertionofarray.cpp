#include<iostream>
#include<vector>
using namespace std;

int main(){

  vector<int> arr{1,2,3,3,4,6,8};
  vector<int> brr{3,3,4,10};

  vector<int> ans;

  //outer loop on arr vector
  for(int i=0 ; i<arr.size() ; i++){
    int element=arr[i];

    //for every element, run a loop on brr
    for(int j=0 ; j<brr.size() ; j++){
      if(element==brr[j])
        
        //mark the value of j to avoid duplication
        brr[j]=-1;

        //pusing the common elemnts in ans
        ans.push_back(element);
      
    }
  }

  //printing the element of ans
  for(auto value:ans){
    cout<<value<<" ";
  }
  return 0;
}
