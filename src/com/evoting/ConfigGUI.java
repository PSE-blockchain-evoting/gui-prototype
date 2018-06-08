package com.evoting;

import javax.swing.*;

public class ConfigGUI extends JFrame {

    private VerticalTabs tabsLayout;

    private ConfigView generalView;
    private ConfigView timeView;
    private ConfigView candidateView;
    private ConfigView voterView;
    private ConfigView finishView;

    public ConfigGUI(){
        tabsLayout = new VerticalTabs(5);

        generalView = new GeneralConfigView(tabsLayout.getTabPanel(0));
        tabsLayout.setTabText(0, "Allgemein");
        timeView = new TimespanView(tabsLayout.getTabPanel(1));
        tabsLayout.setTabText(1, "Zeitraum");
        candidateView = new CandidateView(tabsLayout.getTabPanel(2));
        tabsLayout.setTabText(2, "Kandidaten");
        voterView = new VoterView(tabsLayout.getTabPanel(3));
        tabsLayout.setTabText(3, "Wähler");
        finishView = new FinishView(tabsLayout.getTabPanel(4));
        tabsLayout.setTabText(4, "Fertigstellen");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Konfiguration");

        this.getContentPane().add(tabsLayout);

        this.setVisible(true);


    }
}
