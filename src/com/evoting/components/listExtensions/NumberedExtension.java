package com.evoting.components.listExtensions;

import com.evoting.components.Entry;
import com.evoting.components.ListExtension;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

public class NumberedExtension extends ComponentExtension<JLabel>{

    public NumberedExtension(ListExtension next){
        super(next);
    }

    @Override
    public void removeEntry(Entry e) {
        int i = searchIndex(e);
        components.remove(i);

        //Change numbers afterwards
        for(int j = i; j < components.size(); j++){
            String t = genText(j);
            components.get(j).setText(t);
        }
    }

    @Override
    protected JLabel createNewType() {
        int nr = list.getEntries().size();
        JLabel lblNew = new JLabel(genText(nr));

        return lblNew;
    }

    private String genText(int i){
        return (i+1) + ". ";
    }
}
