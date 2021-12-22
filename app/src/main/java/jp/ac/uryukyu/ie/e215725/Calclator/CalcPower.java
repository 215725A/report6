package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcPower implements Calc{
    public double value1;       //累乗の底
    public double index;        //指数

    /**
     * コンストラクタ
     * @param _value1   //ユーザーが入力した底
     * @param _index    //ユーザーが入力した指数
     */
    public CalcPower(double _inputvalue1, double _inputindex){
        this.value1 = _inputvalue1;
        this.index = _inputindex;
    }

    /**
     * calcメソッドのオーバーライド
     * 累乗を計算するメソッドを呼び出して結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcPower());
    }

    /**
     * 累乗を計算するメソッド
     * @return 底を指数乗した値を返す
     */
    public double calcPower(){
        return Math.pow(this.value1, this.index);
    }
}
