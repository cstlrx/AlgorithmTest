package CodingInterview;

import java.util.Stack;

/**
 * Created by lrx on 2017/3/11.
 */
// 双栈表达式求值
    // 失败
public class GetExpressionValueStack {
    // 优先级
    private static int getPro(char c){
        switch(c) {
            case '+': return 0;
            case '-': return 0;
            case '*': return 1;
            case '/': return 1;
            case '(': return 2;
            case ')': return 2;
        }
        return -1;
    }
    public static int getValue(String str) {
        Stack<Integer> intStack = new Stack<>();// 数字栈
        Stack<Character> charStack = new Stack<>();// 符号栈
        char[] array = str.toCharArray();
        int index = 0;
        while(index != array.length) {
            if(array[index] == '+') {
                if(!charStack.isEmpty() && getPro(charStack.peek()) >= getPro('+')){
                    int a = intStack.pop();
                    int b = intStack.pop();
                    switch(charStack.pop()) {
                        case '+': intStack.push(a+b);break;
                        case '-': intStack.push(b-a);break;
                        case '*': intStack.push(a*b);break;
                        case '/': intStack.push(b/a);break;
                    }
                }
                else
                    charStack.push('+');
            }
            else if(array[index] == '-') {
                if(!charStack.isEmpty() && getPro(charStack.peek()) >= getPro('-')){
                    int a = intStack.pop();
                    int b = intStack.pop();
                    switch(charStack.pop()) {
                        case '+': intStack.push(a+b);break;
                        case '-': intStack.push(b-a);break;
                        case '*': intStack.push(a*b);break;
                        case '/': intStack.push(b/a);break;
                    }
                }
                else
                    charStack.push('-');
            }
            else if(array[index] == '*') {
                if(array[index+1] != '('){
                    int a = intStack.pop();
                    int b = array[++index]-'0';
                    intStack.push(a*b);
                }else {
                    charStack.push('*');
                }
            }
            else if(array[index] == '/') {
                if(array[index+1] != '('){
                    int a = intStack.pop();
                    int b = array[++index]-'0';
                    intStack.push(a/b);
                }else {
                    charStack.push('/');
                }
            }
            else if(array[index] == '(')
                charStack.push(array[index]);
            else if(array[index] == ')') {
                while(charStack.peek() != '('){
                    int a = intStack.pop();
                    int b = intStack.pop();
                    char c = charStack.pop();
                    if(c == '+')intStack.push(a+b);
                    else if(c == '-')intStack.push(b-a);
                    else if(c == '*')intStack.push(a*b);
                    else {
                        intStack.push(b/a);
                    }
                }
                charStack.pop();
            }
            else {
                intStack.push(array[index]-'0');
            }
            index++;
        }
        while(!charStack.isEmpty()){
            int a = intStack.pop();
            int b = intStack.pop();
            char c = charStack.pop();
            if(c == '+')intStack.push(a+b);
            else if(c == '-')intStack.push(b-a);
            else if(c == '*')intStack.push(a*b);
            else {
                intStack.push(b/a);
            }
        }
        return intStack.pop();
    }

    public static void main(String[] args) {
        String str = "";

        System.out.println(getValue("7-(4+3)*2+7"));

    }
}
