package Company.JD;

/**
 * Created by lrx on 2017/4/7.
 */
public class Main3 {
    static int a[] = new int[100];

    public static void main(String[] args) {
        combile(5,3);
    }
    public static void combile(int n,int r){
        int i,j;
        for(i=n;i>=r;i--){ //i代表的选取的数里最大的数，最大数放在a[r]
            a[r]=i;
            if(r==1){
                for(j=1;a[j]>0;j++)
                    System.out.print(a[j]+"");
                    System.out.println();
                continue;
            }
            else
                combile(i-1,r-1);
        }
    }
}
