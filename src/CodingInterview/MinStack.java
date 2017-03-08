package CodingInterview;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/3/8.
 */
//有一个方法 min() 返回栈的最小值
public class MinStack<key extends Comparable<key>> {
    private ArrayList<key> stack = new ArrayList<key>();
    // 存储最小值
    private ArrayList<key> minStack = new ArrayList<key>();
    public key min() {
        if(minStack.isEmpty())
            return null;
        // 返回ArrayList最后一个元素
        return minStack.get(minStack.size()-1);
    }
    public void push(key v) {
        if(stack.size() == 0){
            stack.add(v);
            minStack.add(v);
            return;
        }else {
            // 若新入元素小于当前最小值，则入保存最小元素的栈，否则让保存最小元素的栈再次push当前最小值
            if(v.compareTo(minStack.get(minStack.size()-1)) < 0){
                minStack.add(v);
            }else {
                minStack.add(minStack.get(minStack.size()-1));
            }
            stack.add(v);
        }

    }
    public key pop() {
        if(stack.isEmpty())return null;
        minStack.remove(minStack.size()-1);
        return stack.remove(stack.size()-1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        MinStack<Integer> m = new MinStack<>();
        m.push(1);
        m.push(2);
        m.pop();
        m.push(4);
        System.out.print(m.min() + " ");
        m.pop();
        m.pop();
        System.out.print(m.min() + " ");
    }
}
