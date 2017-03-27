package Stack;

import java.util.Scanner;

/**
 * Created by fajiao on 2017/3/27.
 */
public class TestStack {
    public static void main(String[] args) throws Exception {
        SequenceStack stack = new SequenceStack();
        Scanner in = new Scanner(System.in);
        int temp;
        for (int i = 0; i < 10; i++) {
            System.out.println("请输入第"+ (i+1) + "个整数：");
            temp = in.nextInt();
            stack.push(temp);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
