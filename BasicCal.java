package TICalculator;

/**
 * @author 左齐亮
 * @version 1.0
 */
public interface BasicCal {
    void division();// "/"
    void multiply();// "*"
    void add();// "+"
    void minus();// "-"
    void getAnswer();// "="
    boolean isHex(String str);//判断是否是一个十六进制的字符串
    String HEX(Double num);// 10转16
    Double DEC(String str);// 16转10
    void SUM();// 求和
}
