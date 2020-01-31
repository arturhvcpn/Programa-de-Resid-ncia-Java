package CountingSort;

import java.util.Scanner;

public class CountingSort {

    public static void countingSort(int array[]){

        int varAuxilar[] = new int[array.length];

        for(int i = 0; i < varAuxilar.length;i++){
            varAuxilar[i] = 0;
        }

        for(int i = 0; i < array.length; i++){
            varAuxilar[array[i]]++;
        }
/*

    void sort(char arr[])
    {
        int n = arr.length;

        // The output character array that will have sorted arr
        char output[] = new char[n];

        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i=0; i<256; ++i)
            count[i] = 0;

        // store count of each character
        for (int i=0; i<n; ++i)
            ++count[arr[i]];

        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i=1; i<=255; ++i)
            count[i] += count[i-1];

        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n-1; i>=0; i--)
        {
            output[count[arr[i]]-1] = arr[i];
            --count[arr[i]];
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i<n; ++i)
            arr[i] = output[i];
    }
 */
    }

    public static void imprimirArray(int array[]){
        for(int i = 0; i < array.length;i++){
            System.out.println("Output of data " + i +":" + array[i]);
        }
    }
    public static void main(String[] args){

        int array[] = {1,2,2,3,4,5,5};

        countingSort(array);
        imprimirArray(array);

    }
}
