package com.company;

import com.util.SwingUtils;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

import static java.awt.Frame.MAXIMIZED_BOTH;


public class Test {

    static Map<String, List<Integer>> resultTable = new HashMap<>();
    static int maxCount;

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

        Locale.setDefault(Locale.ROOT);

        //SwingUtils.setLookAndFeelByName("Windows");
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        //SwingUtils.setDefaultFont(null, 20);

        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        SwingUtils.setDefaultFont("Arial", 20);

        EventQueue.invokeLater(() -> {
            try {
                JFrame frameMain = new Form();
                frameMain.setVisible(true);
                frameMain.setExtendedState(MAXIMIZED_BOTH);
            } catch (Exception ex) {
                SwingUtils.showErrorMessageBox(ex);
            }
        });
    }
}
