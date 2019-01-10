#include "iostream"


using namespace std;

Template <class T>



void swap(T*a , T*b){

T temp;
temp=*a;
*a=*b;
*b=temp;




}


int main(){


  T x,y;
  cin>>x>>y;


  swap(x,y);

  cout<<x<<"and"<<y;

}
