package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;
import java.util.*;

public class CalcMultiple extends Calc{
    public ArrayList<Double> doubleData;    //掛け算をしたい数のリスト

    /**
     * コンストラクタ
     * @param _doubleData 掛け算をしたい数のリスト
     */
    public CalcMultiple(ArrayList<Double> _doubleData){
        this.doubleData = _doubleData;
    }

    /**
     * calcメソッドのオーバーライド
     * リストの中身を掛け算していく
     * 初期値として1を与える(0に何をかけても0になるため)
     */
    @Override
    public void calc(){
        resultOfDouble = 1;
        for(var num : doubleData){
            resultOfDouble *= num;
        }
    }
    
}
