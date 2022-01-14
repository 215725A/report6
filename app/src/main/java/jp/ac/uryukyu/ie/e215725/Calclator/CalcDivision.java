package jp.ac.uryukyu.ie.e215725.Calclator;

import jp.ac.uryukyu.ie.e215725.Settings.Calc;
import java.util.ArrayList;

public class CalcDivision extends Calc{
    public ArrayList<Double> doubleData; //除算したい数のリスト

    /**
     * コンストラクタ
     * @param _value1 ユーザーが入力した割られる数
     * @param _value2 ユーザーが入力した割る数
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
