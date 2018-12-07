package cn.edu.sicnu.cs.yuxin.exp7.tiltle2;

import java.io.*;
import java.util.Arrays;

public class LetterFrequencyCount {

    private long[] counts = new long[26];
    private double[] frequencys = new double[26];

    LetterFrequencyCount() {
        Arrays.fill(counts, 0);
        Arrays.fill(frequencys, 0.0);
    }

    public boolean loadFile(File file) throws IOException {
        Arrays.fill(counts, 0);
        Arrays.fill(frequencys, 0.0);
        String text = "";
        String strbf = "";
        if (!file.exists()) {
            file.createNewFile();
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        while ((strbf = bufferedReader.readLine()) != null) {
            text = text + strbf;
        }
        for (char ch : text.toCharArray()) {
            if ((ch >= 'A' && ch <= 'Z')) {
                counts[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                counts[ch - 'a']++;
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (!text.equals("")) {
                frequencys[i] = (double) counts[i] / text.toCharArray().length;
            }
        }
        bufferedReader.close();
        return true;
    }

    public boolean loadFile(String fileName) throws IOException {
        if (loadFile(new File(fileName))) {
            return true;
        } else {
            return false;
        }
    }

    public double getFrequency(char a) {
        if (a >= 'a') {
            return frequencys[a - 'a'];
        } else {
            return frequencys[a - 'A'];
        }
    }

    public void printFrequencies() {
        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%c:%2.2f", 'A' + i, frequencys[i] * 100);
            System.out.println("%");
        }
    }

    public static void main(String[] args) throws IOException {
        final String FILENAME = "./src/cn/edu/sicnu/cs/yuxin/exp7/tiltle2/Text.txt";
        LetterFrequencyCount letterFrequencyCount = new LetterFrequencyCount();
        letterFrequencyCount.loadFile(FILENAME);
        System.out.printf("%c:%2.2f", 'Z', letterFrequencyCount.getFrequency('Z') * 100);
        System.out.println("%");
        letterFrequencyCount.printFrequencies();
    }
}
