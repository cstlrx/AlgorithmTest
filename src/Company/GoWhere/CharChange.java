package Company.GoWhere;

import java.util.*;

/**
 * Created by lrx on 2017/4/1.
 */

public class CharChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();

            String e = sc.nextLine();

            String l = sc.nextLine();
            String[] lis = l.split(" ");
            HashSet<String> list = new HashSet<>();

//            boolean[] flag = new boolean[list.length];
            int res = 0;
            Queue<String> queue = new LinkedList<>();
            queue.offer(s);
            HashMap<String,Integer> maps = new HashMap<>();
            maps.put(s,1);
            if(list.contains(s))
                list.remove(s);
            boolean flag = false;
            while(!queue.isEmpty() && !flag){
                String top = queue.poll();
                int length = top.length();
                StringBuilder builder;

                int level = maps.get(top);
                for(int i = 0;i<length &&  !flag;i++){
                    builder = new StringBuilder(top);
                    for(char c = 'a';c<='z';c++){
                        builder.setCharAt(i,c);
                        String tmpStr = builder.toString();
                        if(tmpStr.equals(top))
                            continue;
                        if(tmpStr.equals(e)){
                            res = level+1;
                            flag = true;
                        }
                        if(list.contains(tmpStr)){
                            queue.offer(tmpStr);
                            list.remove(tmpStr);
                            maps.put(tmpStr,level+1);
                        }
                    }
                }
            }

//            for (int i=0; i<start.length; i++) {
//
//                for(int j=0; j<list.length; j++) {
//                    if(flag[j])continue;
//                    // 若从start到list[j]可以经过一次变化得到且list[j]和end中相同的字母个数比start和end中的大一
//                    if(oneChange(list[j],start) && findSame(list[j],start,end)) {
//                        res++;
//                        flag[j] = true;
//                        start = Arrays.copyOf(list[j].toCharArray(),list[j].length());
//                    }
//                }
//
//            }
//            for (int i=0; i<start.length; i++) {
//                if(start[i] != end[i]) {
//                    for(int j=0; j<list.length; j++) {
//                        if(flag[j])continue;
//                        if(list[j].charAt(i) == end[i] && oneChange(list[j],start)) {
//                            res++;
//                            flag[j] = true;
//                            start = Arrays.copyOf(list[j].toCharArray(),list[j].length());
//                            break;
//                        }
//                    }
//                }
//            }
            System.out.println(res);
        }
    }
    private static boolean findSame(String str1, char[] start, char[] end) {
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<str1.length(); i++) {
            if(start[i] == end[i]) {
                c1++;
            }
            if(str1.charAt(i) == end[i]) {
                c2++;
            }
        }
        return (c2-c1==1) ? true : false;
    }
    private static boolean oneChange(String str1, char[] str2) {
        int c = 0;
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i) != str2[i]) {
                c++;
            }
        }
        return c == 1 ? true : false;
    }
}
class A
{
    public void a()
    {

    }

}
