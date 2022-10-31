package lab_6;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Lab6 extends JFrame {
    protected Font defaultFont = new Font("Roboto", Font.PLAIN, 14);
    protected JTextField textField = new JTextField();
    protected JButton button = new JButton();
    protected JLabel labelAsk = new JLabel();

    protected int numToGuess = 0;
    protected int userNum = 0;
    protected String direction = "<";
    protected int triesLeft = 3;
    protected boolean ended = false;
    protected static final String TLD = "You have TRIES tries left, try DIRECTION";

    protected static String ASK_S = "Выбери номер от 1 до 20";
    protected static String BUTTON_INIT_S = "Сделать предположение";
    protected static String RESULT_LEFT_S = "У вас остались попытки, попробуйте направление: ";
    protected static String RESULT_LOST_S = "Вы проиграли. Загаданное число: NUM";
    protected static String RESULT_WON_S = "Вы выиграли!";

    Lab6() {
        super("Labaratory 6");

        numToGuess = 1 + (int) (Math.random() * 20);

        labelAsk.setFont(defaultFont);
        textField.setFont(defaultFont);
        button.setFont(defaultFont);

        labelAsk.setText(ASK_S);
        textField.setText("1");
        button.setText(BUTTON_INIT_S);

        this.setLayout(new BorderLayout());

        JPanel centerPan = new JPanel();
        this.add(centerPan, BorderLayout.CENTER);
        centerPan.setLayout(new BoxLayout(centerPan, BoxLayout.Y_AXIS));
        centerPan.setBorder(new EmptyBorder(24, 24, 24, 24));


        centerPan.add(labelAsk);
        centerPan.add(textField);
        centerPan.add(button);

        button.addActionListener((e) -> buttonOnClick());

        this.setSize(400, 200);
        this.setVisible(true);
    }

    private void buttonOnClick() {
        if (ended) return;

        userNum = Integer.parseInt(textField.getText());

        if (userNum == numToGuess) {
            ended = true;
        } else {
            if (numToGuess>userNum) {
                direction = ">";
            }
            else{
                direction = "<";
            }
            --triesLeft;

            if (triesLeft <= 0) ended = true;
        }

        updateButtonText();
    }

    private void updateButtonText() {
        if (userNum == numToGuess)
            button.setText(RESULT_WON_S);
        else if (triesLeft > 0) {
            // button.setText(RESULT_LEFT_S.replace("TRIES", Integer.toString(triesLeft)));

            RESULT_LEFT_S = TLD.replace("TRIES", Integer.toString(triesLeft));
            RESULT_LEFT_S = TLD.replace("DIRECTION", direction);

            button.setText(RESULT_LEFT_S);
        }
        else
            button.setText(RESULT_LOST_S.replace("NUM", String.format("%d", numToGuess)));
    }

    public static void main(String[] args) {
        new Lab6();
    }
}