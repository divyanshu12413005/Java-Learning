

class ArrayExample{
    void MaxValue(){
        int arr[]={1, 5, 3, 9, 2};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("Maximum value in the array is: " + ans);
    }
}
public class Problem_02 {
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        example.MaxValue();
    }
}