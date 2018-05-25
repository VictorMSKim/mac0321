package batalha.controller;

public abstract class Event {

    private long evtTime;

    public Event(long eventTime) {
        evtTime = eventTime;
    }

    public boolean ready() {
        return System.currentTimeMillis() >= evtTime;
    }

    public abstract void action();

    public abstract String description();

}
