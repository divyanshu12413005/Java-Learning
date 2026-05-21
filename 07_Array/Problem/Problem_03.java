

class ArrayExample{
    void SearchValue(){
        int arr[]={1, 5, 3, 9, 2};
        int x=2;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
                
            }
           
        }
        System.out.println(ans);
       
    }
}
public class Problem_03 {
    public static void main(String[] args) {
        ArrayExample example = new ArrayExample();
        example.SearchValue();
    }
}