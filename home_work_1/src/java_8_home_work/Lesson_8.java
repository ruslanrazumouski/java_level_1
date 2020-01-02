package java_8_home_work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lesson_8 extends JFrame {

    private JTextField txtGuess;
    private JLabel lblInfo;
    private int theNumber;

    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        try {
            int guess = Integer.parseInt(guessText);

            if (guess < theNumber)
                message = guess + " меньше загаданной. Попробуйте снова.";
            else if (guess > theNumber)
                message = guess + " больше загаданной. Попробуйте снова.";
            else {
                message = guess + " правильная цифра. Вы победили!";
                newGame();
            }
        }
        catch (Exception e) {
            message = "Введите цифру от 1 до 100";
        }
        finally {
            lblInfo.setText(message);
            txtGuess.requestFocus();
            txtGuess.selectAll();
        }
    }

    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);
    }

    public Lesson_8() {
        setTitle("Игра \"Угадай цифру\"");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 434, 33);
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton btnRun = new JButton("Проверить");
        btnRun.addActionListener( actionEvent -> checkGuess() );
        btnRun.setBounds(167, 168, 100, 23);
        getContentPane().add(btnRun);
        btnRun.setToolTipText("Получить ответ");
        btnRun.setVisible(true);

        JSeparator sep_1 = new JSeparator();
        sep_1.setBounds(30, 69, 400, 2);
        getContentPane().add(sep_1);

        txtGuess = new JTextField();
        txtGuess.addActionListener( actionEvent -> checkGuess() );
        txtGuess.setBounds(200, 96, 50, 20);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        JLabel lblDigit = new JLabel("Введите цифру от 1 до 100");
        lblDigit.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDigit.setBounds(33, 99, 160, 14);
        getContentPane().add(lblDigit);

        JSeparator sep_2 = new JSeparator();
        sep_2.setBounds(30, 145, 400, 2);
        getContentPane().add(sep_2);

        lblInfo = new JLabel("Введите цифру и нажмите кнопку \"Проверить\"");
        lblInfo.setHorizontalAlignment(SwingConstants.CENTER);
        lblInfo.setBounds(0, 202, 434, 14);
        getContentPane().add(lblInfo);
    }

    public static void main(String[] args) {
        Lesson_8 theGame = new Lesson_8();
        theGame.newGame();
        theGame.setSize(new Dimension(450,280));
        theGame.setVisible(true);
    }
}
