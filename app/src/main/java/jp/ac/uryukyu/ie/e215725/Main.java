package jp.ac.uryukyu.ie.e215725;

import java.util.*;
import jp.ac.uryukyu.ie.e215725.Calclator.*;
import jp.ac.uryukyu.ie.e215725.Settings.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Double> doubleData = new ArrayList<>();   //不動小数点型のデータリスト
        int intData = 0;    //整数型のデータ
        double index;   //指数
        double radix;   //基数
        double theta;   //角度
        System.out.println("計算方法を選択してください");
        System.out.println("0: 加算 1: 減算 2: 掛算 3: 除算 4: 累乗 5: 階乗");
        System.out.println("6: 平方根 7: Sin 8: Cos 9: Tan 10: 10進数 -> 2進数");
        int command = s.nextInt();

        switch (command) {
            case 0:
                doubleData = dataSetDouble(doubleData);
                Calc add = new CalcAdd(doubleData);
                add.calc();
                add.printResultDouble();
                break;
            case 1:
                doubleData = dataSetDouble(doubleData);
                Calc subtract = new CalcSubtract(doubleData);
                subtract.calc();
                subtract.printResultDouble();
                break;
            case 2:
                doubleData = dataSetDouble(doubleData);
                Calc multiple = new CalcMultiple(doubleData);
                multiple.calc();
                multiple.printResultDouble();
                break;
            case 3:
                doubleData = dataSetDouble(doubleData);
                Calc division = new CalcDivision(doubleData);
                division.calc();
                division.printResultDouble();
                break;
            case 4:
                System.out.println("基数を入力してください");
                radix = s.nextDouble();
                System.out.println("指数を入力してください");
                index = s.nextDouble();
                Calc power = new CalcPower(radix, index);
                power.calc();
                power.printResultDouble();
                break;
            case 5:
                System.out.println("基数を入力してください");
                radix = s.nextDouble();
                Calc factorial = new CalcFactorial(radix);
                factorial.calc();
                factorial.printResultDouble();
                break;
            case 6:
                System.out.println("平方根を求めたい正の有理数を入力してください");
                radix = s.nextDouble();
                Calc root = new CalcRoot(radix);
                root.calc();
                root.printResultDouble();
                break;
            case 7:
                System.out.println("角度を入力してください");
                theta = s.nextDouble();
                Calc sin = new CalcSin(theta);
                sin.calc();
                sin.printResultDouble();
                break;
            case 8:
                System.out.println("角度を入力してください");
                theta = s.nextDouble();
                Calc cos = new CalcCos(theta);
                cos.calc();
                cos.printResultDouble();
                break;
            case 9:
                System.out.println("角度を入力してください");
                theta = s.nextDouble();
                Calc tan = new CalcTan(theta);
                tan.calc();
                tan.printResultDouble();
                break;
            case 10:
                System.out.println("2進数に変換したい整数を入力してください");
                intData = s.nextInt();
                Calc binary = new CalcBinary(intData);
                binary.calc();
                binary.printResultInteger();
                
        }
        s.close();

    }

    static ArrayList<Double> dataSetDouble(ArrayList<Double> doubleData) {
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
