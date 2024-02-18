interface Mediator {
    void addDevice(Device device);

    void doAlarm();

    void endAlarm(Device device);
}
