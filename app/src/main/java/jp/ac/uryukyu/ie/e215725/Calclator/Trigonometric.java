package jp.ac.uryukyu.ie.e215725.Calclator;

public class Trigonometric {
    public double theta;    //角度
    public double radian;   //ラジアン

    /**
     * コンストラクタ
     * 入力された角度をラジアンに変換する
     * @param _theta
     */
    public Trigonometric(double _theta){
        this.theta = _theta;
        this.radian = Math.toRadians(this.theta);
    }
}
