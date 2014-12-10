package by.htp.krozov.sample.devicetester;

import by.htp.krozov.sample.devicetester.model.TestDevice;
import by.htp.krozov.sample.devicetester.model.MobilePhone;

/**
 * Created by krozov on 12/24/13.
 */
public class Main {

    public static void main(String[] args) {
        DeviceTester tester = new DeviceTester();

        //Create annonyms
        DeviceTester.OnFailedListener onFailedListener = new DeviceTester.OnFailedListener() {
            @Override
            public void onTestFail(TestDevice device) {
                System.out.println("Test failed to device " + device + '.');
            }
        };
        tester.setOnFailedListener(
                onFailedListener);

        TestDevice nexus5TestDevice = new MobilePhone("LG", "Nexus 5", "test_serial", "1212fa");
        tester.test(nexus5TestDevice);
    }
}
