package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcTan extends Trigonometric implements Calc{
    public double tan;      //タンジェント

    /**
     * スーパークラス(Trigonometric)を継承する
     * @param _theta ユーザーが入力した角度
     */
    public CalcTan(double _theta){
        super(_theta);
    }

    /**
     * calcメソッドのオーバーライド
     * タンジェントを求めるメソッドの実行結果を出力
     */
    @Override
    public void calc(){
        System.out.println(calcTan());
    }

    /**
     * タンジェントの値を求めるメソッド
     * @return tan(radian)の値
     */
    public double calcTan(){
        tan = Math.tan(this.radian);
        return tan;
    }
    
}
