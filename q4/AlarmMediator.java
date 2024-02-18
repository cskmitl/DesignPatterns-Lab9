import java.util.ArrayList;
import java.util.List;

public class AlarmMediator implements Mediator {
    private List<Device> devices = new ArrayList<>();

    @Override
    public void addDevice(Device device) {
        devices.add(device);
    }

    @Override
    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        for (Device device : devices) {
            device.doTask();
        }
    }

    @Override
    public void endAlarm(Device device) {
        System.out.println("Alarm event ended from " + device.getClass().getSimpleName());
    }
}
