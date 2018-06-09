package com.evoting;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CandidateEntry extends JPanel {
    private int nr;
    private JLabel lblNumber;
    private JTextField txfName;
    private JButton btnDescription;
    private JButton btnRemove;

    public CandidateEntry(int n){
        super();

        this.nr = n;
        lblNumber = new JLabel(nr + ". Name:");
        txfName = new JTextField();
        btnDescription = new JButton("Beschreibung");
        btnRemove = new JButton("-");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });


        BoxLayout bl = new BoxLayout(this, BoxLayout.X_AXIS);
        this.setLayout(bl);

        this.add(lblNumber);
        this.add(txfName);
        this.add(btnDescription);
        this.add(btnRemove);

    }

    private String getEnteredName(){
        return txfName.getName();
    }

    private void setNumber(int n){
        this.nr = n;
        lblNumber.setText(nr + ". Name:");
    }

    private int getNumber(){
        return nr;
    }
}
