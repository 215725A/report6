package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcSin implements Calc{
    public double theta;        //角度
    public double radian;       //ラジアン
    public double sin;          //サイン

    /**
     * コンストラクタ
     * 入力された角度をラジアンに変換する
     * @param _theta ユーザーが入力した角度
     */
    public CalcSin(double _theta){
        this.theta = _theta;
        this.radian = Math.toRadians(this.theta);
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
