class Solution {
public:
    bool isPalindrome(int num) {
        int result=0, remainder;
        cout<<"Enter a number: "<<num<<endl;
        while(num!=0){
            remainder= num % 10;
            result=result * 10 + remainder;
            num=num/10; 
        }
        if (result==num)
           return true;
         else
           return false;
    }
};
