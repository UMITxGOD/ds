/*
1.Traverse − print all the array elements one by one.
2.Insertion − Adds an element at the given index.
3.Deletion − Deletes an element at the given index.
4.Search − Searches an element using the given index or by the value.
5.Update − Updates an element at the given index.
*/
#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
int GlobalCounter=0;

void swap(int *LEFT,int *RIGHT){
*LEFT=*LEFT^*RIGHT;
*RIGHT=*LEFT^*RIGHT;
*LEFT=*LEFT^*RIGHT;
}

int* createArrayList(int counter){
GlobalCounter+=counter;
int* arr=malloc(GlobalCounter*sizeof(int));
return arr;
}/* 
bool insertion(int element,int position,int counterIncrement){
    int arr=createArray(counterIncrement);
    if(arr[position]){
     arr[position]=temp;
     arr[position];
    }
    arr[position]=element
}
*/
int main(){
    int *arr=createArrayList(3);
    arr=createArrayList(1);
    arr=createArrayList(5);
    arr=createArrayList(19);
    for(int i=0;i<GlobalCounter;i++)
    printf("arr[%d]=%d\n",i,arr[i]);
    int size=sizeof(arr);
    printf("size = %d",size);
    return 0;
}