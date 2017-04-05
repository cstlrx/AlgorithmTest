package swordToOffer.StringTest;

/**
 * Created by lrx on 2017/4/2.
 */
//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是
public class IsNumber {
    public static void main(String[] args) {

        boolean res = isNumeric2("5e2".toCharArray());
        System.out.println(res);
    }
    // 扫描数字
    private static int scanDight(char[] arr, int s) {
        while (s < arr.length && Character.isDigit(arr[s])) {
            s++;
        }
        return s;
    }
    private static boolean scanBackE(char[] arr, int s) {
        if (s == arr.length)
            return false;
        if(arr[s] == '-' || arr[s] == '+') {
            s++;
        }
        int i = scanDight(arr,s);
        if (i == s || i < arr.length) return false;
        return true;
    }
    public static boolean isNumeric2(char[] str) {
        int index = 0;
        if(str[0] == '-' || str[0] == '+') {
            index++;
        }
        index = scanDight(str, index);
        if (index != str.length) {
            if (str[index] == '.') {
                int i = scanDight(str, ++index);
                if (i == index) return false;
                else if (i == str.length) return true;
                index = i;
                if (str[index] == 'e' || str[index] == 'E') {
                    return scanBackE(str, ++index);
                } else {
                    return false;
                }
            } else if (str[index] == 'e' || str[index] == 'E') {
                return scanBackE(str, ++index);
            } else {
                return false;
            }
        }
        return true;
    }
    public static boolean isNumeric(char[] str) {
        boolean flagAdd = false;
        boolean flagSubPre = false;
        boolean flagSubBack = false;
        boolean flage = false;
        boolean flagE = false;
        boolean flagPoint = false;
        int numBackE = 0;

         for(int i=0; i<str.length; i++) {
             if(str[i] == '+') {
                 if (i > 0) return false;
                 if (!flagAdd) {
                     flagAdd = true;
                 } else {
                     return false;
                 }
             }
             else if(str[i] == 'e')
                 if(!flage && str[i] == 'e') {
                     flage = true;
                 } else {
                     return false;
                 }
             else if(str[i] == 'E')
                 if(!flagE && str[i] == 'E') {
                     flagE = true;
                 } else {
                     return false;
                 }
             else if(str[i] == '.')
                 if(!flagPoint) {
                     flagPoint = true;
                 } else {
                     return false;
                 }
             else if(str[i] == '-') {
                 if (flage || flagE) {
                     if (!flagSubBack) {
                         flagSubBack = true;
                     } else {
                         return false;
                     }
                 } else {
                     if (!flagSubPre) {
                         flagSubPre = true;
                     } else {
                         return false;
                     }
                 }
             }
             else if(Character.isDigit(str[i])) {
                 if (flage || flagE) {
                     numBackE++;
                 }
             }
             else if(!Character.isDigit(str[i]))
                 return false;

         }
         if(flagE || flage) {
            if(numBackE ==0) return false;
         }
         return true;

    }
}
