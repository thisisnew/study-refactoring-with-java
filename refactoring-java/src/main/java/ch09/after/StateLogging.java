package ch09.after;

public class StateLogging extends State {
    @Override
    public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
