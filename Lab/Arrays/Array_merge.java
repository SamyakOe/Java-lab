import java.util.Arrays;
public class Array_merge {
    static void merge(int[] a1,int[] a2,int[] a3){
        int n1=a1.length;
        int n2=a2.length;
        int i=0,j=0,k=0;
        while(i<n1)
            a3[k++]=a1[i++];
        while(j<n2)
            a3[k++]=a2[j++];
        Arrays.sort(a3);
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,4,6,8,10};
        int[] arr3=new int[arr1.length+arr2.length];
        merge(arr1, arr2, arr3);
        System.out.println("Given arrays:");
        System.out.println("Array 1: "+Arrays.toString(arr1));
        System.out.println("Array 2: "+Arrays.toString(arr2));
        System.out.println("Merged and sorted array: "+Arrays.toString(arr3));
    }
}

