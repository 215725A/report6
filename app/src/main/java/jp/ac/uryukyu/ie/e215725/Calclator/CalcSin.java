package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcSin extends Calc{
    public double theta; //角度

    /**
     * コンストラクタ
     * @param _theta ユーザーが入力した角度
     */
    public CalcSin(double _theta){
        this.theta = _theta;
    }

    /**
     * calcメソッドのオーバーライド
     * サインの値を計算するメソッド
     */
    @Override
    public void calc(){
        resultOfDouble = Math.sin(Trigonometric.changeToRadian(this.theta));
    }
}
