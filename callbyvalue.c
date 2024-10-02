#include<stdio.h>
void calculate(int,int);
int main(){
    int a,b;
    printf("enter a and b\n");
    scanf("%d,%d",&a,&b);
    calculate(a,b);
}

void calculate(int x,int y){
    printf("\n1-addition\n2-substraction\n3-multiplication\n4-division");
    int num,r;
    scanf("%d",&num);
    while(1){
        if(num==1){
            printf("sum is ");
        }
    }
}