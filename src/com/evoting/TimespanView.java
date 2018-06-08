package com.evoting;

import javax.swing.*;
import java.awt.*;

public class TimespanView extends ConfigView{

    private JLabel lblStart = new JLabel("Anfang:");
    private JLabel lblEnd = new JLabel("Ende:");
    private JButton btnImmediately = new JButton("Sofort");
    private JSpinner spnStartTime = new JSpinner();
    private JSpinner spnEndTime = new JSpinner();
    private JSpinner spnStartDate = new JSpinner();
    private JSpinner spnEndDate = new JSpinner();
    private JComboBox<String> cbxExtraCond = new JComboBox<>();


    public TimespanView(JPanel container){
        super(container);
    }

    @Override
    protected void initComponents() {

    }

    protected LayoutManager2 buildLayout(JPanel container){
        return null;
    }
}
