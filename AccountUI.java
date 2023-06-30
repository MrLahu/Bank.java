package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AccountUI {

    private JFrame frame;
    private JTextField pinField;
    private JLabel pinLabel;
    private JButton loginButton;

    private JFrame accountTypeFrame;
    private JButton savingTypeButton;
    private JButton currentTypeButton;

    private JFrame currentFrame;
    private JLabel balanceLabel;
    private JButton depositCurrentButton;
    private JButton withdrawalCurrentButton;

    private JFrame depositFrame;
    private JLabel balanceCLabel;
    private JTextField depositCurrentField;
    private JButton depositButton;

    private JFrame withdrawalFrame;
    private JLabel balanceCWLabel;
    private JTextField withdrawalCurrentField;
    private JButton withdrawalButton;

    public void initialize() {
        initializeAccountUI();
    }

    private void initializeAccountUI() {
        frame = new JFrame("Window");
        pinField = new JTextField();
        pinLabel = new JLabel("Enter Pin");
        loginButton = new JButton("Login");

        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);

        frame.add(pinLabel);
        frame.add(pinField);
        frame.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float userPin = Float.parseFloat(pinField.getText());
                if (userPin == 5555) {
                    initializeAccountTypeUI();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Pin, Try Again");
                }
            }
        });
    }

    private void initializeAccountTypeUI() {
        accountTypeFrame = new JFrame("Window");
        savingTypeButton = new JButton("Savings");
        currentTypeButton = new JButton("Current");

        accountTypeFrame.setSize(300, 300);
        accountTypeFrame.setLayout(new GridLayout(2, 1));
        accountTypeFrame.setVisible(true);

        accountTypeFrame.add(currentTypeButton);
        accountTypeFrame.add(savingTypeButton);

        currentTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initializeCurrentUI();
            }
        });

        savingTypeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Initialize savingUI() here
            }
        });
    }

    private void initializeCurrentUI() {
        currentFrame = new JFrame("Window");
        balanceLabel = new JLabel("Balance: 100000");
        depositCurrentButton = new JButton("Deposit");
        withdrawalCurrentButton = new JButton("Withdraw");

        currentFrame.setSize(300, 300);
        currentFrame.setLayout(new GridLayout(3, 1));
        currentFrame.setVisible(true);

        currentFrame.add(balanceLabel);
        currentFrame.add(depositCurrentButton);
        currentFrame.add(withdrawalCurrentButton);

        depositCurrentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initializeDepositCUI();
            }
        });

        withdrawalCurrentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initializeWithdrawalCUI();
            }
        });
    }

    private void initializeDepositCUI() {
        depositFrame = new JFrame("Window");
        balanceCLabel = new JLabel("Balance: 100000");
        depositCurrentField = new JTextField();
        depositButton = new JButton("Deposit");

        depositFrame.setSize(300, 300);
        depositFrame.setLayout(new GridLayout(3, 1));
        depositFrame.setVisible(true);

        depositFrame.add(balanceCLabel);
        depositFrame.add(depositCurrentField);
        depositFrame.add(depositButton);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You deposited " + depositCurrentField.getText());
            }
        });
    }

    private void initializeWithdrawalCUI() {
        withdrawalFrame = new JFrame("Window");
        balanceCWLabel = new JLabel("Balance: 100000");
        withdrawalCurrentField = new JTextField();
        withdrawalButton = new JButton("Withdrawal");

        withdrawalFrame.setSize(300, 300);
        withdrawalFrame.setLayout(new GridLayout(3, 1));
        withdrawalFrame.setVisible(true);

        withdrawalFrame.add(balanceCWLabel);
        withdrawalFrame.add(withdrawalCurrentField);
        withdrawalFrame.add(withdrawalButton);

        withdrawalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You withdrew " + withdrawalCurrentField.getText());
            }
        });
    }

    public static void main(String[] args) {
        AccountUI accountUI = new AccountUI();
        accountUI.initialize();
    }
}
