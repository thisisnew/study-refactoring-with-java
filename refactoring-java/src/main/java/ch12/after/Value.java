package ch12.after;

import java.util.ArrayList;
import java.util.List;

public class Value {
    private int _value = 0;
    private final List<ValueListener> _listeners = new ArrayList<>();

    public Value(int value) {
        this._value = value;
    }

    public void setValue(int _value) {
        _value = _value;
        notifyToListeners();
    }

    public int getValue() {
        return _value;
    }

    public void addValueListener(ValueListener _listener) {
        _listeners.add(_listener);
    }

    public boolean removeValueListener(ValueListener _listener) {
        return _listeners.remove(_listener);
    }

    private void notifyToListeners() {
        for (ValueListener _listener : _listeners) {
            _listener.valueChanged(new ValueChangeEvent(this));
        }
    }
}
