package jp.ac.uryukyu.ie.e215725;

/*
* This Java source file was generated by the Gradle 'init' task.
*/

import org.junit.jupiter.api.Test;

import jp.ac.uryukyu.ie.e215725.Calclator.CalcAdd;
import jp.ac.uryukyu.ie.e215725.Settings.Calc;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class CalcAddTest {
    /**
     * 足し算をするメソッドの計算が正しいかどうか検証する。
     * 検証手順
     * 1. 不動小数点型のデータリストを用意する
     * 2. 1 ~ 3 までをデータリストに追加する
     * 3. 変数sumに 1 ~ 3までを足した値を保存する
     * 4. add.calc()を実行する
     * この時、resultOfDoubleにcalc()の結果が保存されている
     * 5. ただの足し算なら計算結果は6になる
     * つまり、sumの値とreusltOfDoubleの値が等しいことを検証する
     */
    @Test
    void addTest() {

        ArrayList<Double> doubleData = new ArrayList<>();
        double sum = 0.;
        for (int i = 1; i < 4; i++) {
            sum += (double) i;
            doubleData.add((double) i);
        }
        Calc add = new CalcAdd(doubleData);
        add.calc();
        assertEquals(sum, add.resultOfDouble);

    }
}