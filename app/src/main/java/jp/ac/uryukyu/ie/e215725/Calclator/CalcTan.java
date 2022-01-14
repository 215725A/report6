package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcTan extends Calc{
    public double theta; //角度

    /**
     * コンストラクタ
     * @param _theta ユーザーが入力した角度
     */
    public CalcTan(double _theta){
        this.theta = _theta;
    }

    /**
     * calcメソッドのオーバーライド
     * タンジェントの値を計算するメソッド
     */
    @Override
    public void calc(){
        resultOfDouble = Math.tan(Trigonometric.changeToRadian(theta));
    }
    
}
