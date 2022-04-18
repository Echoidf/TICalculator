package function;

public interface Programmer {
    void input1();
    void input2();
    void input3();
    void input4();
    void input5();
    void input6();
    void input7();
    void input8();
    void input9();
    void input0();
    void inputA();
    void inputB();
    void inputC();
    void inputD();
    void inputE();
    void inputF();
    String HEX();// 10转16
    void DEC();// 16转10
    void OFF();// 关机
    void ONorC();// 开机，开机时按下为全部清空数据
    void SUM();// 求和
    void lParenthesis();// 左括号
    void rParenthesis();// 右括号
    void SHF();// 移位
    void inverseCode();// 反码
    void twoC();// 补码
    void OR();// 或
    void AND();// 与
    void XOR();// 异或
    void CE();// "CE=Clear Entry，只清除当前这步输入的数字"
    void division();// "/"
    void multiply();// "*"
    void plus();// "+"
    void subtraction();// "-"
    void getAnswer();// "="
}
