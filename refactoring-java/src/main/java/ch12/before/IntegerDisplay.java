package ch12.before;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDisplay extends Frame implements ActionListener {

    private final Label _octalLabel = new Label("0");
    private final Label _decimalLabel = new Label("0");
    private final Label _hexadecimalLabel = new Label("0");
    private final Button _incrementButton = new Button("+");
    private final Button _decrementButton = new Button("-");

    private int _value = 0;

    public IntegerDisplay() {
        super("IntegerDisplay");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
