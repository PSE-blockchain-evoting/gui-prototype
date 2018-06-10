package com.evoting.views;

import com.evoting.components.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class CandidateView extends ConfigView {

    private CandidateList candidates;
    private JButton btnAdd;

    public CandidateView(JPanel container, VerticalTabs vt) {
        super(container, vt);
    }

    @Override
    protected void initComponents() {
        ResourceBundle lang = ResourceBundle.getBundle("res/AdminConfig");

        JFrame parent = (JFrame)getTopLevelAncestor();
        candidates = CandidateList.createCandidateList(parent);
        candidates.addNewEntry();

        btnAdd = new JButton(lang.getString("btnCandidateAddText"));
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                candidates.addNewEntry();
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
                        .addComponent(candidates, 0, 1, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );

        gl.setVerticalGroup(
                gl.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                    .addComponent(candidates, 0, 1, Short.MAX_VALUE)
                    .addComponent(btnAdd)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );
        return gl;
    }
}
