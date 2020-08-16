package leetcode;
//统计字符串的个数

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
    static void max_unique(String str)
    {
        // begin用来保存 最长不重复子串的 开始索引
        int begin=0;
        // maxlen用来保存最长不重复子串的 长度
        int maxlen = 0;
        // 定义一个容器，用来保存遍历时候遇到的每一个字符的出现次数情况
        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
        int n = str.length();

        int j=0;
        for(int i=0; i<n; ++i)
        {
            // 初始化   hash 这个数组，用0补充
            for(int k=0; k<n; k++)
            {
                tm.put(str.charAt(k), 0);
            }
            tm.put(str.charAt(i), 1);
            // 往i+1开始往后找，遇到和i索引处不一样的元素，就将那个位置的“键值”置1；
            // 遇到一样的就 break，让j停在现在这个位置
            for(j=i+1; j<n; ++j)
            {
                if(tm.get(str.charAt(j)) == 0)
                    tm.put(str.charAt(j), 1);
                else
                    break;
            }
            // 上面j刚好停在了，第一次出现重复的那个位置，相减即为这个时候的最长子串长度，
            // i索引是其的开始
            if(j-i > maxlen)
            {
                maxlen = j-i;
                begin = i;
            }
        }
        System.out.println(maxlen + " " + str.substring(begin, begin+maxlen)) ;

    }
    public static void main(String[] args){
        String str1 = "gdfggf3af3eeabc";
        max_unique(str1);
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = string.toCharArray();//将字符串转化成字符数组
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            list.add(aChar);//将字符数组元素添加到集合中
        }
        for  ( int  i  =   0 ; i  <  list.size()  -   1 ; i ++ )  {
            for  ( int  j  =  list.size()  -   1 ; j  >  i; j -- )  {
                if  (list.get(j).equals(list.get(i)))  {
                    list.remove(j);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {//遍历集合取出每个字符
            int count = 0;//定义计数器
            Character character = list.get(i);
            for (int j = 0; j < chars.length; j++) {//遍历数组取出每个字符和集合中的元素比较
                char aChar = chars[j];
                if (character.equals(aChar)){//如果集合中的元素有等于数组中的字符,计数器加1
                    count++;
                }
            }
            if(i==list.size()-1)
                System.out.println(character + ":" + count );//打印结果
            else
                System.out.println(character + ":" + count + ",");//打印结果
        }

    }
}
