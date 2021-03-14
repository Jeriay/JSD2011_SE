package socket;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] allOut = {3,5,6,8,32,56,98,6,123,875,45,54};
        int pw = 56;
        System.out.println(Arrays.toString(allOut));
        //将pw的值从数组中删除
        for(int i=0;i<allOut.length;i++){
            if(allOut[i]==pw){
                allOut[i]=allOut[allOut.length-1];
                allOut=Arrays.copyOf(allOut,allOut.length-1);
                break;
            }
        }

        System.out.println(Arrays.toString(allOut));

    }
}
