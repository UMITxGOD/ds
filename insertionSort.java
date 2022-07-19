/*
 * Insertion sort -> Acsending Order
 * |C|A|D|A|C|
 * Pass -1 |A|C|D|A|C|
 * Pass -2 |A|C|D|A|C| ->No Change ,Since Comparision fail
 * Pass -3 |A|A|C|D|C|
 * Pass -3 |A|A|C|C|D| 
 */
public class  insertionSort{
 public static void $insertionSort(char array[]){
 
  for(int outerCounter = 1 ; outerCounter < array.length ; outerCounter += 1){
   char temp =array[outerCounter];
   int innerCounter = outerCounter;

   while(innerCounter >0 && temp < array[innerCounter-1]){
    array[innerCounter]=array[innerCounter-1];
    innerCounter -= 1;
   }
   
   array[innerCounter]=temp;    
}
System.out.println("After Insertion sort : ");
for (char c : array) {
 System.out.print(c+",");    
}

 }
 //Driver Testing Code 
 public static void main(String args[]){
 char arr[]={'A','F','D','B','C'};
 $insertionSort(arr);
 } 
}