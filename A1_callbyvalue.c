#include<stdio.h>
void calculate(int,int);
int main(){
    int a,b;
    printf("enter a and b\n");
    scanf("%d%d",&a,&b);
    calculate(a,b);
}

void calculate(int x,int y){
    x = x-1;
    int sum = x+y;
    printf("the sum is %d",sum);
}