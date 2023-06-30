package Bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Bank implements ActionListener {
    String pinValue = "5555";
    Savings savingsAccount = new Savings();
    Current currentAccount = new Current();

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Welcome to X Bank");
    JLabel enterPin = new JLabel("Enter pin");
    JTextField pin = new JTextField();
    JButton login = new JButton("Login");

    JFrame chooseAccountType = new JFrame();
    JLabel chooseAccountTypeLabel = new JLabel("Choose Account Type");
    JButton savingsButton = new JButton("Savings");
    JButton currentButton = new JButton("Current");

    JFrame chooseSavings = new JFrame();
    JLabel whatDoYouWant = new JLabel("What do you want?");
    JButton depositSavings = new JButton("Deposit");
    JButton withdrawalSavings = new JButton("Withdrawal");

    JFrame chooseCurrent = new JFrame();
    JLabel whatDoYouWantCurrent = new JLabel("What do you want?");
    JButton depositCurrent = new JButton("Deposit");
    JButton withdrawalCurrent = new JButton("Withdrawal");

    JFrame depositAmountSavings = new JFrame();
    JLabel enterDepositSavingsAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositSavingsLabel = new JLabel("Amount");
    JTextField amountDepositSavings = new JTextField();
    JButton depositSavingsButton = new JButton("Deposit");

    JFrame withdrawalAmountSavings = new JFrame();
    JLabel enterWithdrawalSavingsAmountLabel = new JLabel("Enter withdrawal amount");
    JLabel amountWithdrawalSavingsLabel = new JLabel("Amount");
    JTextField amountWithdrawalSavings = new JTextField();
    JButton withdrawalSavingsButton = new JButton("Withdrawal");

    JFrame depositAmountCurrent = new JFrame();
    JLabel enterDepositCurrentAmountLabel = new JLabel("Enter deposit amount");
    JLabel amountDepositCurrentLabel = new JLabel("Amount");
    JTextField amountDepositCurrent = new JTextField();
    JButton depositCurrentButton = new JButton("Deposit");

    JFrame withdrawalAmountCurrent = new JFrame();
    JLabel enterWithdrawalCurrentAmountLabel = new JLabel("Enter withdrawal amount");
    JLabel amountWithdrawalCurrentLabel = new JLabel("Amount");
    JTextField amountWithdrawalCurrent = new JTextField();
    JButton withdrawalCurrentButton = new JButton("Withdrawal");

    Bank() {
        label.setFont(new Font("Consolas", Font.BOLD, 20));
        label.setBounds(45, 10, 250, 40);

        enterPin.setFont(new Font("Consolas", Font.PLAIN, 18));
        enterPin.setBounds(45, 50, 250, 40);

        pin.setFont(new Font("Consolas", Font.PLAIN, 18));
        pin.setBounds(45, 80, 250, 40);

        login.setFont(new Font("Consolas", Font.BOLD, 18));
        login.setFocusable(false);
        login.setBounds(70, 140, 140, 40);
        login.addActionListener(this);

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.add(enterPin);
        frame.add(pin);
        frame.add(login);
    }

    public void chooseAccountTypeWindow() {
        chooseAccountTypeLabel.setFont(new Font("Consolas", Font.BOLD, 20));
        chooseAccountTypeLabel.setBounds(70, 20, 250, 40);

        savingsButton.setFont(new Font("Consolas", Font.BOLD, 20));
        savingsButton.setFocusable(false);
        savingsButton.setBounds.
