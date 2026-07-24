class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[i - m];
        }

        bubbleSort(nums1);
    
    }

        static void bubbleSort(int array[]) {
        int size = array.length;
    
   
        for (int k = 0; k < size - 1; k++){
            for (int z = 0; z < size - k - 1; z++){
                if (array[z] > array[z + 1]) {
                int temp = array[z];
                array[z] = array[z + 1];
                array[z + 1] = temp;
                }
            }
        }
    }
}