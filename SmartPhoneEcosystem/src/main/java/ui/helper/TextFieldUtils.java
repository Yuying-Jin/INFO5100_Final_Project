/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.helper;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class TextFieldUtils {
     public static void focusGained(JTextField txtField, String text) {
        if (txtField.getText().equals(text)) {
            txtField.setText("");
            txtField.setForeground(Color.BLACK);
        }
    }

    public static void focusLost(JTextField txtField, String text) {
        if (txtField.getText().isEmpty()) {
            txtField.setForeground(Color.GRAY);
            txtField.setText(text);
        }
    }
}
