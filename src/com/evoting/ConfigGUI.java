package com.evoting;

import com.evoting.components.VerticalTabs;
import com.evoting.views.*;

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

        generalView = new GeneralConfigView(tabsLayout.getTabPanel(0), tabsLayout);
        tabsLayout.setTabText(0, "Allgemein");
        timeView = new TimespanView(tabsLayout.getTabPanel(1), tabsLayout);
        tabsLayout.setTabText(1, "Zeitraum");
        candidateView = new CandidateView(tabsLayout.getTabPanel(2), tabsLayout);
        tabsLayout.setTabText(2, "Kandidaten");
        voterView = new VoterView(tabsLayout.getTabPanel(3), tabsLayout);
        tabsLayout.setTabText(3, "Wähler");
        finishView = new FinishView(tabsLayout.getTabPanel(4), tabsLayout);
        tabsLayout.setTabText(4, "Fertigstellen");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Konfiguration");

        this.getContentPane().add(tabsLayout);

        this.setVisible(true);


    }
}
