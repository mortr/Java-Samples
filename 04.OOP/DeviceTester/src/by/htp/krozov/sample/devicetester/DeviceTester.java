package by.htp.krozov.sample.devicetester;

import by.htp.krozov.sample.devicetester.model.Device;

/**
 * Created by krozov on 12/24/13.
 */
public class DeviceTester {

    private boolean logEnable = true;

    public boolean isLogEnable() {
        return logEnable;
    }

    public void setLogEnable(boolean enable) {
        this.logEnable = enable;
    }

    public void test(Device... devices) {
        int testSuccess = 0;
        for (Device device : devices) {
            if (testTurnOn(device) && testWork(device) && testTurnOff(device)) {
                testSuccess++;
            }
        }
        System.out.printf("Тест прошел успешно %d, провален - %s.\n", testSuccess, devices.length - testSuccess);
    }

    private boolean testTurnOn(Device device) {
        boolean on = device.turnOn();
        if (logEnable) {
            if (on) {
                System.out.print("Устройство " + device + " включено успешно.");
            } else {
                System.out.print("Тест включения провален на устройстве " + device + ".");
            }
        }
        return on;
    }

    private boolean testTurnOff(Device device) {
        boolean off = device.turnOff();
        if (logEnable) {
            if (off) {
                System.out.print("Устройство " + device + " выключено успешно.");
            } else {
                System.out.print("Тест выключения провален на устройстве " + device + ".");
            }
        }
        return off;
    }

    private boolean testWork(Device device) {
        boolean testResult = device.test();
        if (logEnable) {
            if (testResult) {
                System.out.print("Устройство " + device + " прошло тест успешно.");
            } else {
                System.out.print("Тест на устройстве " + device + ".");
            }
        }
        return testResult;
    }
}
