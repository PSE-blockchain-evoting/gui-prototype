package com.evoting;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class CandidateView extends ConfigView{

    private CandidateList clCandidates;
    private JButton btnAdd;

    public CandidateView(JPanel container, VerticalTabs vt) {
        super(container, vt);
    }

    @Override
    protected void initComponents() {

        clCandidates = new CandidateList();
        clCandidates.addCandidate();

        btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                clCandidates.addCandidate();
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
                        .addComponent(clCandidates, 0, 1, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                    )
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );

        gl.setVerticalGroup(
                gl.createSequentialGroup()
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
                    .addComponent(clCandidates, 0, 1, Short.MAX_VALUE)
                    .addComponent(btnAdd)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, 100)
        );
        return gl;
    }
}
