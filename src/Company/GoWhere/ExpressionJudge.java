package Company.GoWhere;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/1.
 */

public class ExpressionJudge {
    public static boolean chkLegal(String A) {
        char[] arr = A.toCharArray();
//        Stack<Character> st = new Stack<>();
//        Stack<Character> tmp = new Stack<>();
        boolean res = false;
        int l = 0, r = 0;
        for(int i=0; i<A.length(); i++) {
            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
                l++;
            } else if(arr[i] == '}' || arr[i] == ']' || arr[i] == ')') {
                r++;
            }
//            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
//                st.push(arr[i]);
//            } else if(arr[i] == '}' || arr[i] == ']' || arr[i] == ')') {
//                if(st.peek() != arr[i]) {
//                    while(!st.isEmpty() && st.peek() != arr[i]) {
//                        tmp.push(st.pop());
//                    }
//                    if(st.isEmpty()) {
//                        res = false;
//                        break;
//                    } else {
//                        while(!tmp.isEmpty()) {
//                            st.push(tmp.pop());
//                        }
//                    }
//
//                } else {
//                    st.pop();
//                }
//            }
        }
        if(l == r) {
            res = true;
        }
        return res;
    }

    public static void main(String[] args) {
        chkLegal("[a+b*(5-4)]*{x+b+b*({1+2)}}");
    }
}
