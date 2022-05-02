package demo;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
=======
import javax.swing.border.EmptyBorder;
import java.awt.*;
>>>>>>> main

/**
 * @author 左齐亮
 * @version 1.0
 */
<<<<<<< HEAD
public class CalculatorDemo  implements ActionListener {
    private JFrame jFrame;
    private JPanel contentPanel;//内容面板
    private JTextField textFieldIn,textFieldOut;//文本框 显示输入
    private JButton[] btns = new JButton[40];
    private String exp,out;


    public CalculatorDemo() {
        jFrame = new JFrame();
=======
public class CalculatorDemo extends JFrame {
    private JPanel contentPanel;//内容面板
    private JTextField textField;//文本框
    private JButton[] btns = new JButton[40];


    public CalculatorDemo() {
        setTitle("TI 程序员计算器");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 450, 600);
>>>>>>> main
        contentPanel = new JPanel();
        //设置面板的边框
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        //设置为边框布局管理器
        contentPanel.setLayout(new BorderLayout(0, 0));
        //应用内容面板
<<<<<<< HEAD
        jFrame.setContentPane(contentPanel);
        JPanel jPanel = new JPanel();//用于保存文本框
        textFieldIn = new JTextField();
        textFieldOut = new JTextField();
        jPanel.add(textFieldIn);
        jPanel.add(textFieldOut);
        contentPanel.add(jPanel, BorderLayout.NORTH);//将面板放在北部

=======
        setContentPane(contentPanel);
        JPanel jPanel = new JPanel();//用于保存文本框
        textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.LEFT);//文本框使用右对齐
        jPanel.add(textField);
        textField.setColumns(22);//设置文本框有18列
        contentPanel.add(jPanel, BorderLayout.NORTH);//将面板放在北部
>>>>>>> main
        JPanel panel2 = new JPanel();    //新建面板用于保存按钮
        contentPanel.add(panel2, BorderLayout.CENTER);    //将面板放置在边界布局的中央
        panel2.setLayout(new GridLayout(8, 5, 5, 5));    //面板使用网格8x5布局
        btns[0] = new JButton("DEC");
        panel2.add(btns[0]);
        btns[1] = new JButton("HEX");
        panel2.add(btns[1]);
        btns[2] = new JButton("OCT");
        panel2.add(btns[2]);
        btns[3] = new JButton("OFF");
        panel2.add(btns[3]);
        btns[4] = new JButton("ON/C");
        panel2.add(btns[4]);
        btns[5] = new JButton("STO");
        panel2.add(btns[5]);
        btns[6] = new JButton("RCL");
        panel2.add(btns[6]);
        btns[7] = new JButton("SUM");
        panel2.add(btns[7]);
        btns[8] = new JButton("(");
        panel2.add(btns[8]);
        btns[9] = new JButton(")");
        panel2.add(btns[9]);
        btns[10] = new JButton("SHF");
        panel2.add(btns[10]);
        btns[11] = new JButton("d");
        panel2.add(btns[11]);
        btns[12] = new JButton("E");
        panel2.add(btns[12]);
        btns[13] = new JButton("F");
        panel2.add(btns[13]);
        btns[14] = new JButton("K");
        panel2.add(btns[14]);
        btns[15] = new JButton("1'sC");
        panel2.add(btns[15]);
        btns[16] = new JButton("A");
        panel2.add(btns[16]);
        btns[17] = new JButton("B");
        panel2.add(btns[17]);
        btns[18] = new JButton("C");
        panel2.add(btns[18]);
        btns[19] = new JButton("÷");
        panel2.add(btns[19]);
        btns[20] = new JButton("OR");
        panel2.add(btns[20]);
        btns[21] = new JButton("7");
        panel2.add(btns[21]);
        btns[22] = new JButton("8");
        panel2.add(btns[22]);
        btns[23] = new JButton("9");
        panel2.add(btns[23]);
        btns[24] = new JButton("X");
        panel2.add(btns[24]);
        btns[25] = new JButton("AND");
        panel2.add(btns[25]);
        btns[26] = new JButton("4");
        panel2.add(btns[26]);
        btns[27] = new JButton("5");
        panel2.add(btns[27]);
        btns[28] = new JButton("6");
        panel2.add(btns[28]);
        btns[29] = new JButton("-");
        panel2.add(btns[29]);
        btns[30] = new JButton("XOR");
        panel2.add(btns[30]);
        btns[31] = new JButton("1");
        panel2.add(btns[31]);
        btns[32] = new JButton("2");
        panel2.add(btns[32]);
        btns[33] = new JButton("3");
        panel2.add(btns[33]);
        btns[34] = new JButton("+");
        panel2.add(btns[34]);
        btns[35] = new JButton("CE");
        panel2.add(btns[35]);
        btns[36] = new JButton("0");
        panel2.add(btns[36]);
        btns[37] = new JButton("·");
        panel2.add(btns[37]);
        btns[38] = new JButton("+/_");
        panel2.add(btns[38]);
        btns[39] = new JButton("=");
        panel2.add(btns[39]);

<<<<<<< HEAD

    }
    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JTextField getTextFieldIn() {
        return textFieldIn;
    }

    public void setTextFieldIn(JTextField textField) {
        this.textFieldIn = textField;
    }

    public JButton[] getBtns() {
        return btns;
    }

    public void setBtns(JButton[] btns) {
        this.btns = btns;
    }

    public void display(){
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("TI 程序员计算器");
        jFrame.setBounds(200, 100, 450, 600);


        textFieldIn.setFont(new Font(Font.SERIF, Font.BOLD, 40));//设置字体样式
        textFieldIn.setBorder(BorderFactory.createEmptyBorder());//设置单行文本控件无边框
        textFieldIn.setHorizontalAlignment(SwingConstants.LEFT);//文本框使用左对齐
        textFieldIn.setEnabled(false);//设置单行文本框不能点击
        textFieldIn.setColumns(22);//设置文本框有18列

        textFieldOut.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        textFieldOut.setBorder(BorderFactory.createEmptyBorder());
        textFieldOut.setHorizontalAlignment(SwingConstants.RIGHT);//文本框使用右对齐
        textFieldOut.setEnabled(false);
        textFieldOut.setColumns(22);//设置文本框有18列
        //设置按钮样式 添加事件监听
        for (int i = 0; i < 40; i++) {
            btns[i].setForeground(Color.BLUE);//设置按钮字体颜色为蓝色
            btns[i].setFont(new Font(Font.SERIF, Font.BOLD, 16));//设置字体
            btns[i].setContentAreaFilled(false);//设置按钮为透明效果
            btns[i].addActionListener(this);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
=======
        for (int i = 0; i < 40; i++) {
            btns[i].setBackground(Color.BLACK);
            btns[i].setForeground(Color.WHITE);
        }
>>>>>>> main

    }

    public static void main(String[] args) {
<<<<<<< HEAD
        CalculatorDemo calculatorDemo = new CalculatorDemo();
        calculatorDemo.display();
=======
        CalculatorDemo jFrame = new CalculatorDemo();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
>>>>>>> main
    }
}
