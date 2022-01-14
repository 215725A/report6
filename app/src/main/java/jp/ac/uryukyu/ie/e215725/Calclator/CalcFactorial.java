package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcFactorial extends Calc{
    public double radix;        //基数

    /**
     * コンストラクタ
     * @param _radix ユーザーから入力された基数
     */
    public CalcFactorial(double _radix){
        this.radix = _radix;
    }

    /**
     * calcメソッドのオーバーライド
     * 階乗の計算をするメソッドを呼び出す
     */
    @Override
    public void calc(){
        resultOfDouble = calcFactorial(this.radix);
    }


    /**
     * 階乗を求めるメソッド
     * 正の値の場合のみ階乗の計算を行う
     * @param radix 階乗の基数
     * @return  階乗した値
     */
    public double calcFactorial(double radix){
        if (this.radix == 0) {
            return 1;
        }else if(this.radix > 0){
            return this.radix * calcFactorial(this.radix - 1);
        }else{
            System.out.println("負の数の階乗はありません");
            System.out.println("そのため、入力した値をそのまま返します");
            return this.radix;
        }
    }
    
}
