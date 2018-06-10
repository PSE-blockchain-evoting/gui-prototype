package com.evoting.components.listExtensions;

import com.evoting.components.ListExtension;

import javax.swing.*;

public class TextFieldExtension extends ComponentExtension<JTextField> {

    public TextFieldExtension(ListExtension next) {
        super(next);
    }

    @Override
    protected JTextField createNewType() {
        return new JTextField();
    }

    public String getText(int i){
        assert(0 <= i && i < components.size());
        return components.get(i).getText();
    }
}
