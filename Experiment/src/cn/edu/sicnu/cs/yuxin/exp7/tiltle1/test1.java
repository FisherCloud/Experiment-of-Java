package cn.edu.sicnu.cs.yuxin.exp7.tiltle1;

import java.io.*;
import java.util.Random;

public class test1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        final String FILENAME = "temp.txt";
        File file = new File(FILENAME);
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("FileWriter写入随机10000个整数时间：" + filewriter(file));
        System.out.println("BufferedWriter写入随机10000个整数时间：" + bufferedwriter(file));
        System.out.println("FileReader读取随机10000个字符时间：" + filereader(file));
        System.out.println("BufferedReader读取随机10000个字符时间：" + bufferedreader(file));
        file.delete();
    }

    private static long filereader(File file) throws IOException {
        long startTime = System.currentTimeMillis();
        FileReader fileReader = new FileReader(file);
        char[] chars = new char[100000];
        fileReader.read(chars);
        /*
        for (char ch : chars) {
            System.out.print(ch);
        } */                         //输出内容
        fileReader.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long bufferedreader(File file) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        char[] chars = new char[100000];
        bufferedReader.read(chars);
        /*
        for (char ch : chars) {
            System.out.print(ch);
        }*/
        bufferedReader.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    private static long filewriter(File file) throws IOException {
        long startTime = System.currentTimeMillis();
        FileWriter fileWriter = new FileWriter(file);
        Random random = new Random();
        int data = 0;
        for (int i = 0; i < 10000; i++) {
            data = random.nextInt();
            fileWriter.write(data);
        }
        fileWriter.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

    private static long bufferedwriter(File file) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        Random random = new Random();
        int data = 0;
        for (int i = 0; i < 10000; i++) {
            data = random.nextInt();
            bufferedWriter.write(data);
        }
        bufferedWriter.close();
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
