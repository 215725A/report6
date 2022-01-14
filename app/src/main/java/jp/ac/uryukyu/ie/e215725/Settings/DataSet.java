package jp.ac.uryukyu.ie.e215725.Settings;

import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {
    /**
     * 不動小数点型のデータリストを作成するメソッド
     * @param doubleData 空のデータリスト
     * @return 不動小数点型のデータリスト
     */
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
