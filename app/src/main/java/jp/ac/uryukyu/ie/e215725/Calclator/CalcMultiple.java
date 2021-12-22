package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcMultiple implements Calc{
    public double value1;       //掛けられる数
    public double value2;       //掛ける数

    /**
     * コンストラクタ
     * @param _value1 ユーザーが入力した掛けられる数
     * @param _value2 ユーザーが入力した掛ける数
     */
    public CalcMultiple(double _value1, double _value2){
        this.value1 = _value1;
        this.value2 = _value2;
    }

    /**
     * calcメソッドのオーバーライド
     * 掛け算を行うメソッドを呼び出して結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcMultiple());
    }

    /**
     * 掛け算を行うメソッド
     * @return フィールド変数value1とvalue2を掛けた値を返す
     */
    public double calcMultiple(){
        return this.value1 * this.value2;
    }
    
}
