package ch09.after;

public class StateStopped extends State {
    @Override
    public int getTypeCode() {
        return Logger.STATE_STOPPED;
    }
}
