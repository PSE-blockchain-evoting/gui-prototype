package com.evoting.views;

import com.evoting.components.VerticalTabs;

import javax.swing.*;
import java.awt.*;
import java.util.ResourceBundle;

public class GeneralConfigView extends ConfigView {

    JLabel lblName;
    JLabel lblVotingSystem;
    JLabel lblDescription;
    JTextField txfName;
    JComboBox<String> cbxVotingSystem;
    JTextArea txaDescription;


    public GeneralConfigView(JPanel container, VerticalTabs vt){
        super(container, vt);
    }

    protected void initComponents(){
        ResourceBundle lang = ResourceBundle.getBundle("res/AdminConfig");

        lblName = new JLabel(lang.getString("lblNameText") + ":");
        lblName.setHorizontalAlignment(SwingConstants.RIGHT);
        lblVotingSystem = new JLabel(lang.getString("lblVotingSystemText") + ":");
        lblVotingSystem.setHorizontalAlignment(SwingConstants.RIGHT);
        lblDescription = new JLabel(lang.getString("lblDescriptionText") + ":");
        lblDescription.setHorizontalAlignment(SwingConstants.RIGHT);
        txfName = new JTextField();
        cbxVotingSystem = new JComboBox<>();
        txaDescription = new JTextArea();
    }

    @Override
    protected LayoutManager2 buildLayout(JPanel container){
        GroupLayout generalLayout = new GroupLayout(container);

        generalLayout.setAutoCreateContainerGaps(true);
        generalLayout.setAutoCreateGaps(true);

        generalLayout.setHorizontalGroup(
            generalLayout.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                    .addGroup(generalLayout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addGroup(generalLayout.createSequentialGroup()
                                .addComponent(lblName, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfName, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            )
                    .addGroup(generalLayout.createSequentialGroup()
                            .addComponent(lblVotingSystem, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxVotingSystem, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    )
                    .addGroup(generalLayout.createSequentialGroup()
                            .addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(txaDescription, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    )
            )
            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 200)
         );

        generalLayout.setVerticalGroup(
                generalLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                        .addGroup(generalLayout.createSequentialGroup()
                                .addGroup(generalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfName, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGroup(generalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblVotingSystem, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxVotingSystem, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                )
                                .addGroup(generalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDescription, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txaDescription, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                )
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );

        generalLayout.linkSize(SwingConstants.HORIZONTAL, lblName, lblDescription, lblVotingSystem);
        return generalLayout;
    }
}
