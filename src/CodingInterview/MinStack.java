package CodingInterview;

import java.util.ArrayList;

/**
 * Created by lrx on 2017/3/8.
 */
//��һ������ min() ����ջ����Сֵ
public class MinStack<key extends Comparable<key>> {
    private ArrayList<key> stack = new ArrayList<key>();
    // �洢��Сֵ
    private ArrayList<key> minStack = new ArrayList<key>();
    public key min() {
        if(minStack.isEmpty())
            return null;
        // ����ArrayList���һ��Ԫ��
        return minStack.get(minStack.size()-1);
    }
    public void push(key v) {
        if(stack.size() == 0){
            stack.add(v);
            minStack.add(v);
            return;
        }else {
            // ������Ԫ��С�ڵ�ǰ��Сֵ�����뱣����СԪ�ص�ջ�������ñ�����СԪ�ص�ջ�ٴ�push��ǰ��Сֵ
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
