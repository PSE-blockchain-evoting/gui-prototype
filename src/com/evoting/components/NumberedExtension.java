package com.evoting.components;

import javax.swing.*;
import java.util.LinkedList;

public class NumberedExtension extends ComponentExtension<JLabel>{

    public NumberedExtension(ListExtension next){
        super(next);
        components = new LinkedList<>();
    }

    @Override
    public void addEntry(Entry e) {
        int nr = list.getEntries().size();
        JLabel lblNew = new JLabel(genText(nr));
        components.add(lblNew);
        e.add(lblNew);

        super.addEntry(e);
    }

    @Override
    public void removeEntry(Entry e) {
        int i = searchIndex(e);

        components.remove(i);
        //Change numbers afterwards
        for(int j = i; j < components.size(); j++){
            components.get(j).setText(genText(j));
        }

        super.removeEntry(e);
    }

    @Override
    protected JLabel createNewType() {
        return new JLabel();
    }

    private String genText(int i){
        return i + ". ";
    }
}
