package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcCos extends Calc{
    public double theta; //角度

    /**
     * コンストラクタ
     * @param _theta //ユーザーが入力した角度
     */
    public CalcCos(double _theta){
        this.theta = _theta;
    }

    /**
     * calcメソッドのオーバーライド
     * コサインの値を計算するメソッド
     */
    @Override
    public void calc(){
        resultOfDouble = Math.cos(Trigonometric.changeToRadian(theta));
    }
    
}
