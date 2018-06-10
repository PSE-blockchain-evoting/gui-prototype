package com.evoting.views;

import com.evoting.components.VerticalTabs;
import com.evoting.components.VoterList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VoterView extends ConfigView {

    private VoterList vl;
    private JButton btnAdd;

    public VoterView(JPanel container, VerticalTabs vt) {
        super(container, vt);
    }

    @Override
    protected void initComponents() {
        vl = VoterList.createVoterList();
        vl.addNewEntry();

        btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                vl.addNewEntry();
            }
        });
    }

    @Override
    protected LayoutManager2 buildLayout(JPanel container) {
        GroupLayout gl = new GroupLayout(container);

        gl.setHorizontalGroup(
                gl.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                        .addGroup(gl.createParallelGroup()
                                .addComponent(vl, 0, 1, Short.MAX_VALUE)
                                .addComponent(btnAdd)
                        )
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );

        gl.setVerticalGroup(
                gl.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                        .addComponent(vl, 0, 1, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );
        return gl;
    }
}
