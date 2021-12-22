package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;

public class CalcBinary implements Calc{
    public int number;          //2進数に変換したい10進数
    public String strBinary;    //2進数に変換する際、一度文字列型にしないといけないため
    public int binary;          //2進数

    /**
     * コンストラクタ
     * @param _inputnumber ユーザーが入力した2進数にしたい10進数
     */
    public CalcBinary(int _inputnumber){
        this.number = _inputnumber;
    }

    /**
     * calcメソッドのオーバーライド
     * 10進数を2進数に変換するメソッドの実行結果を出力する
     */
    @Override
    public void calc(){
        System.out.println(calcBinary());
    }

    /**
     * 10進数を2進数に変換するメソッド
     * 2進数に変換する際、Integerクラスを使うと一度String型にしないといけないため
     * 一度String型で2進数に変換する
     * その後parseIntメソッドを使用し整数型に直す
     * @return フィールド変数number を 2進数にして返す
     */
    public int calcBinary(){
        strBinary = Integer.toBinaryString(this.number);
        binary = Integer.parseInt(strBinary);
        return binary;
    }
    
}
