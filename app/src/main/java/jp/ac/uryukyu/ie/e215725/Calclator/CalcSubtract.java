package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcSubtract implements Calc{
    public double value1;       //引かれる数
    public double value2;       //引く数

    /**
     * コンストラクタ
     * @param _value1 引かれる数
     * @param _value2 引く数
     */
    public CalcSubtract(double _value1, double _value2){
        this.value1 = _value1;
        this.value2 = _value2;
    }

    /**
     * calcメソッドのオーバーライド
     */
    @Override
    public void calc(){
        System.out.println(calcSubtract());
    }

    /**
     * 引き算を行うメソッド
     * @return フィールド変数value1 から value2を引いた値を返す
     */
    public double calcSubtract(){
        return this.value1 - this.value2;
    }
}
