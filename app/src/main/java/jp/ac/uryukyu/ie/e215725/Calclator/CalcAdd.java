package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcAdd implements Calc{
    public double value1;       //足される数
    public double value2;       //足す数

    /** 
     * コンストラクター
     * @param _value1 引数1
     * @param _value2 引数2
     */
    public CalcAdd(double _value1, double _value2){
        this.value1 = _value1;
        this.value2 = _value2;
    }

    /**
     * 計算結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcAdd());
    }

    /**
     * 値1と値2の足し算を行うメソッド
     * @return 値1と値2の和
     */
    public double calcAdd(){
        return this.value1 + this.value2;
    }
}
