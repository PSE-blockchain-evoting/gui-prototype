package com.evoting.views;

import com.evoting.components.VerticalTabs;

import javax.swing.*;
import java.awt.*;

public class TimespanView extends ConfigView {

    private JLabel lblStart = new JLabel("Anfang:");
    private JLabel lblEnd = new JLabel("Ende:");
    private JButton btnImmediately = new JButton("Sofort");
    private JSpinner spnStartTime = new JSpinner();
    private JSpinner spnEndTime = new JSpinner();
    private JSpinner spnStartDate = new JSpinner();
    private JSpinner spnEndDate = new JSpinner();
    private JComboBox<String> cbxExtraCond = new JComboBox<>();


    public TimespanView(JPanel container, VerticalTabs vt){
        super(container, vt);
    }

    @Override
    protected void initComponents() {

    }

    protected LayoutManager2 buildLayout(JPanel container){
        return null;
    }
}
