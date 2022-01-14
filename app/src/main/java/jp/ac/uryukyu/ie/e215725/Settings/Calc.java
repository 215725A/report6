package jp.ac.uryukyu.ie.e215725.Settings;

public abstract class Calc {
    /*
     * public double calcRoot(); //平方根
     * public double calcAdd(); //足し算
     * public double calcSubtract(); //引き算
     * public double calcMultiple(); //掛け算
     * public double calcDivision(); //割り算
     * public double calcPower(); //累乗
     * public int calcBinary(); //2進数に変換
     * public double calcSin(); //正弦
     * public double calcCos(); //余弦
     * public double calcTan(); //正接
     */
    public double resultOfDouble;
    public int resultOfInteger;

    abstract public void calc();

    public void printResultInteger() {
        System.out.println(resultOfInteger);
    }

    public void printResultDouble(){
        System.out.println(resultOfDouble);
    }

}
