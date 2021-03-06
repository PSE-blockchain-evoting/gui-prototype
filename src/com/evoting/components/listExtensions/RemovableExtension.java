package com.evoting.components.listExtensions;

import com.evoting.components.Entry;
import com.evoting.components.ListExtension;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class RemovableExtension extends ListExtension {

    private LinkedList<JButton> btns;

    public RemovableExtension(ListExtension next) {
        super(next);

        btns = new LinkedList<>();
    }

    @Override
    public void addEntry(Entry e) {

        JButton btnNew = new JButton("-");

        btnNew.addActionListener(new EntryActionListener(e));

        btns.add(btnNew);
        e.add(btnNew);

        super.addEntry(e);
    }

    private class EntryActionListener implements ActionListener{

        private Entry e;

        public EntryActionListener(Entry e){
            this.e = e;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            list.removeEntry(e);

        }
    }
}
