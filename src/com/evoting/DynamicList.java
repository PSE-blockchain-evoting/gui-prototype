package com.evoting;

import javax.swing.*;

import java.awt.*;

public class DynamicList extends JPanel {

    JPanel pnlScroll;

    public DynamicList(){
        this.setLayout(new BorderLayout());
        pnlScroll = new JPanel();

        GridLayout gl = new GridLayout(0, 1);
        pnlScroll.setLayout(gl);

        JPanel p = new JPanel(new BorderLayout());
        p.add(pnlScroll, BorderLayout.NORTH);

        JScrollPane scp = new JScrollPane(p);
        this.add(scp);
    }

    public void addEntry(JComponent comp){
        pnlScroll.add(comp);
        refreshUI();
    }

    public void removeEntry(JComponent comp){
        pnlScroll.remove(comp);
        refreshUI();
    }

    private void refreshUI(){
        if(pnlScroll.getRootPane() == null)
            return;

        pnlScroll.getRootPane().validate();
        pnlScroll.getRootPane().repaint();
    }

}
