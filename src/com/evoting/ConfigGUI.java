package com.evoting;

import com.evoting.components.VerticalTabs;
import com.evoting.views.*;

import javax.swing.*;
import java.util.ResourceBundle;

public class ConfigGUI extends JFrame {

    private VerticalTabs tabsLayout;

    private ConfigView generalView;
    private ConfigView timeView;
    private ConfigView candidateView;
    private ConfigView voterView;
    private ConfigView finishView;

    public ConfigGUI(){
        ResourceBundle lang = ResourceBundle.getBundle("res/AdminConfig");

        tabsLayout = new VerticalTabs(5);
        generalView = new GeneralConfigView(tabsLayout.getTabPanel(0), tabsLayout);
        tabsLayout.setTabText(0, lang.getString("GeneralTab"));
        timeView = new TimespanView(tabsLayout.getTabPanel(1), tabsLayout);
        tabsLayout.setTabText(1, lang.getString("TimespanTab"));
        candidateView = new CandidateView(tabsLayout.getTabPanel(2), tabsLayout);
        tabsLayout.setTabText(2, lang.getString("CandidateTab"));
        voterView = new VoterView(tabsLayout.getTabPanel(3), tabsLayout);
        tabsLayout.setTabText(3, lang.getString("VoterTab"));
        finishView = new FinishView(tabsLayout.getTabPanel(4), tabsLayout);
        tabsLayout.setTabText(4, lang.getString("FinishTab"));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(lang.getString("Title"));

        this.getContentPane().add(tabsLayout);

        this.setVisible(true);


    }
}
