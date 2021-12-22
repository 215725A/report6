package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcCos extends Trigonometric implements Calc{
    public double cos;      //コサイン

    /**
     * コンストラクタ
     * スーパークラス(Trigonometric)を継承
     * @param _theta
     */
    public CalcCos(double _theta){
        super(_theta);
    }

    /**
     * calcメソッドのオーバーライド
     * コサインを求めるメソッドの実行結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcCos());
    }

    /**
     * コサインの値を求めるメソッド
     * @return cos(radian)の値
     */
    public double calcCos(){
        cos = Math.cos(this.theta);
        return cos;
    }
    
}
