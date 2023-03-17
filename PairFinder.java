/*
 * PairFinder.java
 * 
 * Implementation of class that finds all pairs in an array that sum to a number
 * 
 * Computer Science 112
 * 
 * name: Alice Han and Janae Perez
 * BU emails: alicehan@bu.edu and jperez26@bu.edu
 * 
 */


public class PairFinder {
    public static void findPairSums(int k, int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    System.out.println(arr[i] + " + " + arr[j] + " = " + k);
                }
            }
        }
    }

    public static void findPairSumsFaster(int k, int[] arr){
        Sort.mergeSort(arr);
        int start = 0; 
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] + arr[end] == k){
                System.out.println(arr[start] + " + " + arr[end] + " = " + k);
                end--;
            }else if(arr[start] + arr[end] < k){
                start++;
            }else{
                end--;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 4, 7, 7, 8, 5, 15};
        int k = 12;
        //findPairSums(k, arr);
        findPairSumsFaster(k, arr);
    }
}
