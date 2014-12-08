package by.htp.krozov.sample.devicetester;

import by.htp.krozov.sample.devicetester.model.TestDevice;

/**
 * Created by krozov on 12/24/13.
 */
public class DeviceTester {

    private boolean logEnable = true;
    private OnFailedListener onFailedListener;

    public boolean isLogEnable() {
        return logEnable;
    }

    public void setLogEnable(boolean enable) {
        this.logEnable = enable;
    }

    public int test(TestDevice... testDevices) {
        int testSuccess = 0;
        for (TestDevice testDevice : testDevices) {
            if (testDevice.turnOn()
                    && testDevice.test()
                    && testDevice.turnOff()) {
                testSuccess++;
            } else if (onFailedListener != null) {
                onFailedListener.onTestFail(testDevice);
            }
        }

        if (logEnable) {
            System.out.printf("Тест прошел успешно %d, провален - %s.\n",
                              testSuccess, testDevices.length - testSuccess);
        }

        return testSuccess;
    }

    public void setOnFailedListener(OnFailedListener l) {
        this.onFailedListener = l;
    }

    public interface OnFailedListener {
        void onTestFail(TestDevice testDevice);
    }
}
