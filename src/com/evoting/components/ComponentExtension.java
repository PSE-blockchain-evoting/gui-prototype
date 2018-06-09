package com.evoting.components;

import javax.swing.*;
import java.util.LinkedList;

public abstract class ComponentExtension<Type extends JComponent> extends ListExtension{

    protected LinkedList<Type> components;

    public ComponentExtension(ListExtension next) {
        super(next);

        components = new LinkedList<>();
    }

    @Override
    public void addEntry(Entry e) {
        Type tNew = createNewType();

        components.add(tNew);
        e.add(tNew);
        super.addEntry(e);
    }

    @Override
    public void removeEntry(Entry e) {
        int i = searchIndex(e);
        components.remove(i);

        super.removeEntry(e);
    }

    protected abstract Type createNewType();

    protected int searchIndex(Entry e){
        int n = 0;
        for(Entry e1 : list.getEntries()){
            if(e1 == e){
                return n;
            }
            n++;
        }
        throw new IllegalStateException("This entry doesn't exist.");
    }
}
