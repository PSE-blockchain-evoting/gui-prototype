package com.evoting;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class DescriptionDialog extends JDialog {

    private JLabel lblDescription;
    private JTextArea txaDescription;
    private JButton btnConfirm;
    private LinkedList<ActionListener> listener;

    public DescriptionDialog(JFrame parent){
        super(parent);

        this.setModal(true);
        this.setSize(200,300);
        this.setLocationRelativeTo(null);

        listener = new LinkedList<>();

        lblDescription = new JLabel("Beschreibung;");
        txaDescription = new JTextArea();
        txaDescription.setColumns(10);
        txaDescription.setRows(1);
        txaDescription.setLineWrap(true);
        txaDescription.setWrapStyleWord(true);

        btnConfirm = new JButton("OK");
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                setVisible(false);
                notifyListener(actionEvent);
            }
        });

        GroupLayout gl = new GroupLayout(this.getContentPane());
        gl.setAutoCreateGaps(true);
        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                        .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addComponent(lblDescription)
                                .addComponent(txaDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirm)
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );
        gl.setVerticalGroup(
                gl.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 10)
                        .addComponent(lblDescription)
                        .addComponent(txaDescription, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirm)
        );
        this.getContentPane().setLayout(gl);
    }

    public void setVisible(String name, boolean b){
        lblDescription.setText("Beschreibung zu " + name + ":");
        super.setVisible(b);
    }

    public void addActionListener(ActionListener al){
        listener.add(al);
    }

    public void removeActionListener(ActionListener al){
        listener.remove(al);
    }

    private void notifyListener(ActionEvent ae){
        for(ActionListener al : listener){
            al.actionPerformed(ae);
        }
    }

    public String getDescription(){
        return txaDescription.getText();
    }
}
