package swordToOffer;

/**
 * @author lrx
 * @time 2016-11-19����11:08:00
 */
/*
 * ��̬��̨��
 */
// ˼·��������̨�ף���ǰΪn��̨�ף����Դ�n-1,n-2,n-3,...�������������ҿ���ֱ�����������ʣ�f(n)=1+f(n-1)+f(n-2)+...
// ������ǰ�ߵ�˼·��쳲���������һ�����ظ�������ĳЩ�Ѿ��������ֵ���ʿ���ʹ��������иĽ���ÿ������Ԫ�ش��ΪԪ���±�Ľⷨ����
// ��һ�ֽⷨ����2^(n-1)�������������ϡ�����
public class JumpFloorII {
	static int getResult(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else {
			int result = 1;// ��Ϊ����ֱ��������ǰ̨��
			for (int i = 1; i < n; i++) {
				result += getResult(i);
			}
			return result;
		}
	}

	public static void main(String[] args) {
		System.out.println(getResult(6));
	}
}
