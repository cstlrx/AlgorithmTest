package swordToOffer;

/**
 * Created by lrx on 2017/3/20.
 */

public class ReverseSentence {
    public static String ReverseSentence(String str) {
        StringBuilder res = new StringBuilder();
        char[] arr = str.toCharArray();
        int pre = str.length()-1;
        int back = str.length();

        while (pre >= 0) {
            while(pre >=0 && arr[pre] != ' ') pre--;
            if(pre != -1)
                res.append(str.substring(pre+1,back)).append(" ");
            else
                res.append(str.substring(pre+1,back));
            back = pre;
            pre--;
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str = ReverseSentence("am I");
        System.out.println(str);
    }
}



