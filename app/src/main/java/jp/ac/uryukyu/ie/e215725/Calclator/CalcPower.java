package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcPower extends Calc{
    public double radix;        //基数
    public double index;        //指数

    /**
     * コンストラクタ
     * @param _radix   //ユーザーが入力した基数
     * @param _index    //ユーザーが入力した指数
     */
    public CalcPower(double _radix, double _index){
        this.radix = _radix;
        this.index = _index;
    }

    /**
     * calcメソッドのオーバーライド
     * 累乗を計算するメソッド
     */
    @Override
    public void calc(){
        resultOfDouble = Math.pow(this.radix, this.index);
    }
}
