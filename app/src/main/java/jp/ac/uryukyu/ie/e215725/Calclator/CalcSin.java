package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcSin extends Trigonometric implements Calc{
    public double sin;          //サイン

    /**
     * コンストラクタ
     * スーパークラス(Trigonometric)を継承する
     * @param _theta ユーザーが入力した角度
     */
    public CalcSin(double _theta){
        super(_theta);
    }

    /**
     * calcメソッドのオーバーライド
     * Sinを求めるメソッドの実行結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcSin());
    }

    /**
     * サインの値を求めるメソッド
     * @return sin(radian) の値
     */
    public double calcSin(){
        sin = Math.sin(this.radian);
        return sin;
    }
}
