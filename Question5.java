
public class Question5 {
    public static void main(String[] args) {
        long n= 5;
        long s=1,e=n,mid,ans=0;
        while(s<=e){
            mid = s +(e-s)/2;
            if((mid*(mid+1))/2<=n){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        System.out.println(ans);
    }
}
