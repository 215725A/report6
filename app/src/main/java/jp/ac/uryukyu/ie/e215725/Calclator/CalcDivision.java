package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcDivision implements Calc{
    public double value1;       //割られる数
    public double value2;       //割る数

    /**
     * コンストラクタ
     * @param _value1 ユーザーが入力した割られる数
     * @param _value2 ユーザーが入力した割る数
     */
    public CalcDivision(double _inputvalue1, double _inputvalue2){
        this.value1 = _inputvalue1;
        this.value2 = _inputvalue2;
    }

    /**
     * calcメソッドのオーバーライド
     * 割り算を行うメソッドを呼び出して結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcDivision());
    }

    /**
     * 割り算を行うメソッド
     * @return フィールド変数value1 を value2で割った値を返す
     */
    public double calcDivision(){
        return this.value1 / this.value2;
    }
    
}
