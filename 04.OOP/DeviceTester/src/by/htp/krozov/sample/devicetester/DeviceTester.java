package by.htp.krozov.sample.devicetester;

import by.htp.krozov.sample.devicetester.model.Device;

/**
 * Created by krozov on 12/24/13.
 */
public class DeviceTester {

    private boolean logEnable = true;
    private FailedListener failedListener;

    public boolean isLogEnable() {
        return logEnable;
    }

    public void setLogEnable(boolean enable) {
        this.logEnable = enable;
    }

    public void test(Device... devices) {
        int testSuccess = 0;
        for (Device device : devices) {
            if (device.turnOn()
                    && device.test()
                    && device.turnOff()) {
                testSuccess++;
            } else if (failedListener != null) {
                failedListener.onTestFail(device);
            }
        }
        System.out.printf("Тест прошел успешно %d, провален - %s.\n", testSuccess, devices.length - testSuccess);
    }

    public void setFailedListener(FailedListener l) {
        this.failedListener = l;
    }

    public interface FailedListener {
        void onTestFail(Device device);
    }
}
