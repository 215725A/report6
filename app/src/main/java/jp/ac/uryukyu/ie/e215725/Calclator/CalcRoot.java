package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcRoot implements Calc{
    public double number;       //平方根を求めたい数字
    public double result;       //平方根にした結果

    /**
     * コンストラクタ
     * @param _number 平方根を求めたい数字
     */
    public CalcRoot(double _number){
        this.number = _number;
    }

    /**
     * 計算結果を出力する
     * calc メソッドのオーバーライド
     */
    @Override
    public void calc(){
        System.out.println(calcRoot());
    }

    /**
     * 平方根を計算するメソッド
     * @return フィールド変数numberの平方根
     */
    public double calcRoot(){
        if(this.number >= 0){
            result = Math.sqrt(this.number);
        }else{
            System.out.println("負の数の平方根は計算できません");
            System.out.println("そのため入力した値を返します");
            result = this.number;
        }
        return result;
    }

}
