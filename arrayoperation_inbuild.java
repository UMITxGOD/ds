import java.util.Arrays;
class arrayoperation_inbuild{
    public static void main(String args[]){
        char array[]={'A','c','b','B','F','d','M'};
        Arrays.sort(array);
        System.out.println("array after sorted :"+Arrays.toString(array));  
        char returned_array[]=Arrays.copyOf(array,10);
        System.out.println("copyOf funtion upto 10 : "+Arrays.toString(returned_array));
        returned_array=Arrays.copyOfRange(array,2,6);
        System.out.println("Range Copy from 2 to 6 : "+Arrays.toString(returned_array));
        Arrays.fill(returned_array,'b');
        System.out.println("after filling returned_array with only b : "+Arrays.toString(returned_array));
        System.out.println("binarySearch of element 'F' in sorted array :"+Arrays.binarySearch(array,'F'));

    }
    
}