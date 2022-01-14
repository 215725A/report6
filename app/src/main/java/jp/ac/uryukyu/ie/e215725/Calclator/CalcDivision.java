package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;
import java.util.ArrayList;

public class CalcDivision extends Calc{
    public ArrayList<Double> doubleData; //除算したい数のリスト

    /**
     * コンストラクタ
     * @param _doubleData //除算をしたい数のリスト
     */
    public CalcDivision(ArrayList<Double> _doubleData){
        this.doubleData = _doubleData;
    }

    /**
     * calcメソッドのオーバーライド
     * リストの中身を割り算していく
     * 最初の要素から割っていく
     * 初期値を最初の要素にする(0を割っても0になるため)
     */
    @Override
    public void calc(){
        for(int index = 0; index < doubleData.size(); index++){
            if(index == 0){
                resultOfDouble = doubleData.get(index);
            }else{
                resultOfDouble /= doubleData.get(index);
            }
        }
    }
    
}
