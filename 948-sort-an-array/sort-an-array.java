class Solution {
    public int[] sortArray(int[] nums){
        mergeSort(nums,0,nums.length-1);

        return nums;
    }
    public void merge(int[] nums, int l,int mid, int r){
        int[] a = new int[mid-l+1];
        int[] b = new int[r-mid];

        for(int i=0;i<a.length;i++){
            a[i] = nums[l+i];
        }
        for (int i=0; i < b.length; i++) {
            b[i] = nums[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(k<=r){
            if(j==b.length){
                nums[k] = a[i];
                i++;
                k++;
            }else if(i==a.length){
                nums[k] = b[j];
                j++;
                k++;
            }else if(a[i]<=b[j]){
                nums[k] = a[i];
                i++;
                k++;
            }else{
                nums[k] = b[j];
                j++;
                k++;
            }
        }

    }
    public void mergeSort(int[] nums,int l,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(nums, l,mid);
        mergeSort(nums,mid+1,r);

        merge(nums,l,mid,r);
    }
}