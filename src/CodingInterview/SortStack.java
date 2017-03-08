package CodingInterview;

import java.util.Stack;

/**
 * Created by lrx on 2017/3/8.
 */
// 升序排列栈，允许使用一个辅助栈
public class SortStack {
    public static void sort(Stack<Integer> stack){
        Stack<Integer> buffer = new Stack<>();

        if(stack.size() <= 1)return;
        // 使用辅助栈将栈倒序，每从待排序栈拿出一个元素就将其放在辅助栈的合适位置
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
