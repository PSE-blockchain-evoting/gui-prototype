package com.evoting.components;

import com.evoting.components.listExtensions.ComponentExtension;

import javax.swing.*;

public class LabelExtension extends ComponentExtension<JLabel> {

    private static final String TEXT = "Hello World";

    public LabelExtension(ListExtension next) {
        super(next);
    }

    @Override
    protected JLabel createNewType() {
        return new JLabel(TEXT);
    }
}
