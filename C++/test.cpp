#include <iostream>
#include <stdio.h>
using namespace std;

int plus(int init,int value) {
    init++;
    if(init<5) {
         cout<<init<<endl;
        int kq = ::plus(init,init+value);
    }
    return value;
}
int main()
{
    int kq=::plus(0,0);
    cout<<kq<<endl;
}
