package jp.ac.uryukyu.ie.e215725.Calclator;

import java.util.ArrayList;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcAdd extends Calc {
    private ArrayList<Double> doubleData; // 足したい数のリスト

    /**
     * コンストラクター
     * 
     * @param _doubleData 足し算をしたい数のリスト
     */
    public CalcAdd(ArrayList<Double> _doubleData) {
        this.doubleData = _doubleData;
    }

    /**
     * リストの中身を足していくメソッド
     * calcメソッドのオーバーライド
     */
    @Override
    public void calc() {
        for (var num : this.doubleData) {
            resultOfDouble += num;
        }
    }

}
