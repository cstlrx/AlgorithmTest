package swordToOffer;

/**
 * Created by lrx on 2017/3/20.
 */
// 字符串循环左移
public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if(str.length() <= 1) return str;
        n = n % str.length();
        String pre = str.substring(0,n);
        String back = str.substring(n,str.length());
        return back.concat(pre);
    }
}
