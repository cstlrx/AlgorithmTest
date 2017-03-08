package CodingInterview;

import java.util.Stack;

/**
 * Created by lrx on 2017/3/8.
 */
// ��������ջ������ʹ��һ������ջ
public class SortStack {
    public static void sort(Stack<Integer> stack){
        Stack<Integer> buffer = new Stack<>();

        if(stack.size() <= 1)return;
        // ʹ�ø���ջ��ջ����ÿ�Ӵ�����ջ�ó�һ��Ԫ�ؾͽ�����ڸ���ջ�ĺ���λ��
        while (!stack.isEmpty()) {
            int top = stack.pop();
            while(!buffer.isEmpty() && top > buffer.peek()){
                stack.push(buffer.pop());
            }
            buffer.add(top);
        }
        while(!buffer.isEmpty()) {
            stack.push(buffer.pop());
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(4);
        s.push(6);
        s.push(3);
        s.push(90);
        s.push(0);

        sort(s);
    }
}
