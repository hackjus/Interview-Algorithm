package nowCoder;

import java.util.Arrays;

/*输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。*/
public class printMinNumber {
    public String PrintminNumbers(int[]numbers){
        String[] strings = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strings[i]=Integer.valueOf(numbers[i]).toString();
        }
        Arrays.sort(strings,(a, b)->{
            return (a+b).compareTo(b+a);
        });
        StringBuilder builder=new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
        }
        return builder.toString();
    }
}
