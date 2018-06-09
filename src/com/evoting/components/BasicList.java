package com.evoting.components;

import javax.swing.*;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class BasicList extends JPanel {

    protected JPanel pnlScroll;
    protected LinkedList<Entry> entries;

    public BasicList(){
        this.setLayout(new BorderLayout());
        pnlScroll = new JPanel();

        GridLayout gl = new GridLayout(0, 1);
        pnlScroll.setLayout(gl);

        JPanel p = new JPanel(new BorderLayout());
        p.add(pnlScroll, BorderLayout.NORTH);

        JScrollPane scp = new JScrollPane(p);
        this.add(scp);

        entries = new LinkedList<>();
    }
}
