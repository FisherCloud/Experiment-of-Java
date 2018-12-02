package cn.edu.sicnu.cs.yuxin.exp2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IdiomsGame {
    private final static String[] idioms = {"凉拌黄瓜", "明明白白", "马到成功", "从中作梗", "舍我其谁", "传诵一时"};
    private final static String[] chars = {"王", "根", "基", "你", "要", "努", "力", "学", "习", "做", "一", "个", "好", "人", "不", "要", "干", "坏", "事", "儿"};

    public static void main(String[] args) {
        Run();
    }

    public static void Run() {  //游戏运行函数
        Scanner input = new Scanner(System.in);
        String[] charbuffer = new String[10];
        boolean[] charbufferflag = new boolean[10];
        int index = (int) System.currentTimeMillis() % idioms.length;
        int indeb = 0;
        String idiom = idioms[index];
        String buffer;
        int j = (int) System.currentTimeMillis() % 3;
        int n = 0;
        boolean[] rflag = {false, false, false, false};
        boolean flag = true;
        int c = 0;
        int count = 0;
        for (int i = 0; i < idiom.length() - 1; i++) {   // 查找重复字，并放入charbuffer字符数组中
            for (int k = i + 1; k < idiom.length(); k++) {
                if (idiom.substring(i, i + 1).equals(idiom.substring(k, k + 1))) {
                    charbuffer[c++] = idiom.substring(i, i + 1);
                }
            }
        }
        for (int i = 0; i < charbuffer.length; i++) {   // 从字符数组中随机取字符放入charbuffer字符数组中
            if (i >= c) {
                if (i >= 4 - c) {
                    charbuffer[i] = chars[j];
                    j += 2;
                } else {
                    charbuffer[i] = idiom.substring(i, i + 1);
                }
            }
        }

        final String[] strBuffer = charbuffer;
        int[] charCode = new int[charbuffer.length];
        Arrays.fill(charCode, -1);
        Random random = new Random(index);
        for (int i = 0; i < charCode.length; i++) {  //随机交换charbuffer字符数组中的字符
            int temp = random.nextInt(10);
            charCode[i] = temp;
            for (int k = 0; k < i; k++) {
                if (temp == charCode[k]) {
                    temp = random.nextInt(10);
                    charCode[i] = temp;
                    k = 0;
                }
            }
        }
        for (int i = 0; i < charCode.length; i++) {
            System.out.print(charCode[i] + " ");
            charbuffer[i] = strBuffer[charCode[i]];
        }
        // 以下开始游戏
        System.out.println("四字成语中包含的汉字如下：");
        for (int i = 0; i < charbuffer.length; i++) {
            System.out.print(i + 1 + "." + charbuffer[i] + ";");
        }
        for (int i = 0; i < 6; i++) {
            if (flag) {
                System.out.print("\n[");
                for (int k = 0; k < idiom.length(); k++) {
                    if (rflag[k]) {
                        System.out.print(idiom.substring(k, k + 1));
                    } else {
                        System.out.print("O");
                    }
                }
                System.out.print("]\n");
                flag = false;
            }
            if (i == 0) {
                System.out.print("剩余猜测次数为" + (6 - i) + "次，请输入你的猜测：");
            } else {
                System.out.print("剩余猜测次数为" + (6 - i) + "次，请再次输入你的猜测：");
            }
            do {
                n = input.nextInt();
                if (n < 1 || n > charbuffer.length) {
                    System.out.print("你的输入有误！剩余猜测次数为" + (6 - i) + "次，请再次输入你的猜测：");
                } else {
                    break;
                }
            } while (true);
            index = idiom.indexOf(charbuffer[n - 1]);
            indeb = idiom.indexOf(charbuffer[n - 1], index + 1);
            if (index != -1) {
                rflag[index] = true;
                if (indeb != -1) {
                    rflag[indeb] = true;
                }
                if (charbufferflag[n - 1]) {
                    System.out.print("对不起，“" + charbuffer[n - 1] + "”字你已经猜过了，");
                } else {
                    System.out.print("[");
                    for (int k = 0; k < idiom.length(); k++) {
                        if (rflag[k]) {
                            System.out.print(idiom.substring(k, k + 1));
                        } else {
                            System.out.print("O");
                        }
                    }
                    System.out.print("]\n");
                    System.out.print("恭喜你，“" + charbuffer[n - 1] + "”字在成语中的位置是：" + (index + 1));
                    if (indeb != -1) {
                        System.out.print("、" + (indeb + 1));
                    }
                    System.out.println();
                }
            } else {
                count++;
                if (charbufferflag[n - 1]) {
                    System.out.print("对不起，“" + charbuffer[n - 1] + "”字你已经猜过了，");
                } else {
                    System.out.print("对不起，“" + charbuffer[n - 1] + "”字不再成语中，");
                }
                if (i == 5) {
                    System.out.print("并且你已经Game Over了！");
                    return;
                }
            }
            charbufferflag[n - 1] = true;
            if (rflag[0] && rflag[1] && rflag[2] && rflag[3]) {
                System.out.print("太棒了！你一共猜错了" + count + "次，已经猜出了整个成语");
                break;
            } else if (i == 5) {
                System.out.print("很遗憾！你一共猜错了" + count + "次，你已经Game Over了！");
            }
        }
    }
}
