package com.evoting;

import javax.annotation.Resource;
import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main{

    public static void main(String[] args) {
        //Setting Look and Feel
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        Locale.setDefault(new Locale("de", "DE"));
        ConfigGUI cg = new ConfigGUI();
    }
}
