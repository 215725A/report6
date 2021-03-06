package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;
import java.util.*;

public class CalcSubtract extends Calc{
    public ArrayList<Double> doubleData;    //引き算をしたい数のリスト

    /**
     * コンストラクタ
     * @param _doubleData 引き算をしたい数のリスト
     */
    public CalcSubtract(ArrayList<Double> _doubleData){
        this.doubleData = _doubleData;
    }

    /**
     * リストの中身を計算する
     * リストの最初の要素から引いていくメソッド
     * calcメソッドのオーバーライド
     */
    @Override
    public void calc(){
        for(int index = 0; index < doubleData.size(); index++){
            if(index == 0){
                resultOfDouble = doubleData.get(index);
            }else{
                resultOfDouble -= doubleData.get(index);
            }
        }
    }
}
