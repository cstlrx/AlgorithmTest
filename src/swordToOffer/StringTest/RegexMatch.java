package swordToOffer.StringTest;

import java.util.Stack;

/**
 * Created by lrx on 2017/4/2.
 */
// 正则表达式匹配
/*
    请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
    而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
    例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class RegexMatch {
    public static boolean match(char[] str, char[] regex) {
        boolean res = true;
        Stack<Character> stack = new Stack<>();
        int strPos = 0;
        int regPos = 0;
        while (regPos < regex.length) {
             char a = regex[regPos];
             if (a == '*') {
                 while(strPos < str.length && (str[strPos] == stack.peek())) {
                     stack.push(str[strPos]);
                     strPos++;
                 }
                 regPos++;
             } else if (a == '.') {
                 if(strPos >= str.length) {
                     if (regPos < regex.length-1 && regex[regPos + 1] == '*') {
                             regPos += 2;
                     } else {
                         return false;
                     }
                 } else {
                     stack.push(str[strPos++]);
                     regPos++;
                 }
             } else {
                 if(strPos <str.length && a == str[strPos]) {
                     stack.push(a);
                     regPos++;
                     strPos++;
                 } else {
                     // 判断下一个字符是否是 *
                     if(regPos < regex.length && regex[regPos+1] == '*'){
                         regPos += 2;
                     } else {
                         return false;
                     }
                 }
             }
        }
        if(strPos < str.length || regPos < regex.length)
            res = false;
        return res;
    }

    public static boolean match2(char[] str, char[] regex) {
        return match2(str, 0, regex , 0);
    }
    private static boolean match2(char[] str, int l1, char[] regex, int l2) {
        if (l1 == str.length && l2 == regex.length) return true;
        if (l1 != str.length && l2 == regex.length) return false;

        // 如果模式串的下一个字符为*
        if(l2 < regex.length-1 && regex[l2 + 1] == '*') {
            if (l1 != str.length && (str[l1] == regex[l2] || regex[l2] == '.')) {
                return match2(str,l1,regex,l2+2) ||
                        match2(str,l1+1,regex,l2+2) ||
                        match2(str,l1+1,regex,l2);
            } else {
                return match2(str,l1,regex,l2+2);
            }
        }
        // str 没有匹配到结尾 并且和模式串相同
        if (l1 != str.length && (str[l1] == regex[l2] || regex[l2] == '.')) {
            return match2(str, l1 + 1, regex, l2 + 1);
        }
        return false;
    }


    public static void main(String[] args) {
        boolean res = match2("aaa".toCharArray(),"ab*a".toCharArray());
        System.out.println(res);
    }
}
