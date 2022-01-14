package jp.ac.uryukyu.ie.e215725.Settings;

import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    public static ArrayList<Double> dataSetDouble(ArrayList<Double> doubleData) {
        Scanner scan = new Scanner(System.in);
        System.out.println("データの数は何個ですか");
        int count = scan.nextInt();
        for (int num = 0; num < count; num++) {
            System.out.printf("%d個目の値を入力\n", num + 1);
            doubleData.add((double) scan.nextInt());
        }
        scan.close();
        return doubleData;
    }
}
