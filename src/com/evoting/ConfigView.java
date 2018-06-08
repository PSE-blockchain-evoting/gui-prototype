package com.evoting;

import javax.swing.*;
import java.awt.*;

public abstract class ConfigView extends JPanel {

    protected JPanel pnlMain;
    protected JPanel pnlButtons;
    protected JButton btnCancel;
    protected JButton btnContinue;

    protected LayoutManager2 layout;


    public ConfigView(JPanel container){
        btnCancel = new JButton("Abbrechen");
        btnContinue = new JButton("Weiter");
        pnlMain = new JPanel();
        //pnlMain.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        pnlButtons = new JPanel();
        //pnlButtons.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        pnlButtons.add(btnCancel);
        pnlButtons.add(btnContinue);


        GroupLayout containerLayout = new GroupLayout(container);

        containerLayout.setHorizontalGroup(
                containerLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(pnlMain, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                    .addGroup(containerLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlButtons, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    )
        );

        containerLayout.setVerticalGroup(
                containerLayout.createSequentialGroup()
                        .addComponent(pnlMain, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlButtons,   GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        container.setLayout(containerLayout);


        initComponents();

        layout = buildLayout(pnlMain);
        pnlMain.setLayout(layout);

    }


    protected abstract void initComponents();
    protected abstract LayoutManager2 buildLayout(JPanel container);

}
