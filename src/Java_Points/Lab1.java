package Java_Points;

import java.util.HashMap;
import java.util.Map;

class  Lab1{
      public static void main(String[] args) {
          Integer i1=-128;int i2=-128;
          Integer i3=Integer.valueOf(-128);
          Integer i4=new Integer(-128);
          System.out.println(i1==i2);
          System.out.println(i3==i4);
          System.out.println(i1==i3);
          System.out.println(i2==i4);
          Map<Integer,Integer> map=new HashMap<>();
          for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
              System.out.println(entry.getKey() + "_" + entry.getValue());
          }
      }
}