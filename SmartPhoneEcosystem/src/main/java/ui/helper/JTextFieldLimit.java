/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.helper;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author https://www.tutorialspoint.com/how-can-we-limit-the-number-of-characters-inside-a-jtextfield-in-java
 */
public class JTextFieldLimit extends PlainDocument {
    private int limit;
    
    public JTextFieldLimit(int limit) {
       super();
       this.limit = limit;
    }
    
    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
       if (str == null)
          return;
       if ((getLength() + str.length()) <= limit) {
          super.insertString(offset, str, attr);
       }
    }
}
