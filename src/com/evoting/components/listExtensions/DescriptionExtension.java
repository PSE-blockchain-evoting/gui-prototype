package com.evoting.components.listExtensions;

import com.evoting.DescriptionDialog;
import com.evoting.components.ListExtension;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class DescriptionExtension extends ComponentExtension<JButton>{

    private LinkedList<DescriptionDialog> dds;
    private JFrame parent;

    public DescriptionExtension(ListExtension next, JFrame parent) {
        super(next);
        this.parent = parent;
        dds = new LinkedList<>();
    }

    @Override
    protected void removeData(int i) {
        super.removeData(i);
        dds.remove(i);
    }

    @Override
    protected JButton createNewType() {
        DescriptionDialog dd = new DescriptionDialog(parent);
        dds.add(dd);

        JButton btnNew = new JButton("Beschreibung");
        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Setting dd visible");
                dd.setVisible(true);
            }
        });

        dd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                btnNew.setToolTipText(dd.getDescription());
            }
        });

        return btnNew;
    }
}
