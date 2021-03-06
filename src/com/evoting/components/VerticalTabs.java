package com.evoting.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerticalTabs extends JPanel {

    private GroupLayout mainLayout;

    private JPanel nav;                //Navigation side bar. Contains all tabs
    private GroupLayout navLayout;
    private int navWidth = 150;

    private JPanel tabPanelContainer;
    private CardLayout tabLayout;

    private int tabcount;
    private JToggleButton[] tabs;
    private JPanel[] panels;
    private String[] tabName;
    private int tabHeight = 100;

    private int selected = 0;

    public VerticalTabs(int tabcount){
        assert(tabcount > 0);

        this.tabcount = tabcount;
        //this.setBorder(BorderFactory.createLineBorder(Color.RED));

        nav = new JPanel();
        //nav.setBorder(BorderFactory.createLineBorder(Color.GREEN));

        tabs = new JToggleButton[tabcount];
        panels = new JPanel[tabcount];
        tabName = new String[tabcount];


        for(int i = 0; i < tabcount; i++){
            tabs[i] = new JToggleButton("Tab " + i);
            tabs[i].addActionListener(new TabListener(i));

            panels[i] = new JPanel();
            tabName[i] = Integer.toString(i);
        }

        //Configuring Tab Panel Container
        tabLayout = new CardLayout();
        tabPanelContainer = new JPanel(tabLayout);
        for(int i = 0; i < tabcount; i++){
            tabPanelContainer.add(panels[i], tabName[i]);
        }

        //Configuring Main Layout
        mainLayout = new GroupLayout(this);
        mainLayout.setHorizontalGroup(
                mainLayout.createSequentialGroup()
                    .addComponent(nav, 50, navWidth, navWidth)
                    .addComponent(tabPanelContainer)
        );
        mainLayout.setVerticalGroup(
               mainLayout.createParallelGroup()
                    .addComponent(nav, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabPanelContainer)
        );
        this.setLayout(mainLayout);

        //Configuring navigationbar Layout
        navLayout = new GroupLayout(nav);
        GroupLayout.ParallelGroup hori = navLayout.createParallelGroup(GroupLayout.Alignment.TRAILING);
        for(int i = 0; i < tabcount; i++){
            hori = hori.addComponent(tabs[i], 0, navWidth, navWidth);
        }
        navLayout.setHorizontalGroup(hori);

        GroupLayout.SequentialGroup vert = navLayout.createSequentialGroup();
        for(int i = 0; i < tabcount; i++) {
            vert.addComponent(tabs[i], 0, tabHeight, Short.MAX_VALUE);
        }
        navLayout.setVerticalGroup(vert);
        nav.setLayout(navLayout);

        setSelected(0);
    }

    public void setSelected(int i){
        System.out.println("Selecting: " + i);
        assert(0 <= i && i < tabcount);

        //If this if condition is running the first tab isn't pressed when program is started
        //if(selected == i){
        //    return;
        //}
        selected = i;

        //TODO: call state change listener

        for(JToggleButton tb : tabs){
            tb.setSelected(false);
        }
        tabLayout.show(tabPanelContainer, tabName[i]);
        tabs[i].setSelected(true);
    }

    public int getSelected(){
        return selected;
    }

    public void setTabText(int tab, String text){
        tabs[tab].setText(text);
    }

    public String getTabText(int tab){
        return tabs[tab].getText();
    }

    public JPanel getTabPanel(int tab){
        return panels[tab];
    }

    public int getTabCount(){
        return tabcount;
    }

    public void nextTab(){
        setSelected((selected + 1) % tabcount);
    }

    private class TabListener implements ActionListener{
        private int id;

        public TabListener(int id){
            this.id = id;
        }

        public int getId(){
            return id;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            setSelected(id);
        }
    }
}
