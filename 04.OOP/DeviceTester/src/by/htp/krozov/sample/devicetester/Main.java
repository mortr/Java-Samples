package by.htp.krozov.sample.devicetester;

import by.htp.krozov.sample.devicetester.model.Device;
import by.htp.krozov.sample.devicetester.model.MobilePhone;

/**
 * Created by krozov on 12/24/13.
 */
public class Main {

    public static void main(String[] args) {
        DeviceTester tester = new DeviceTester();

        Device nexus5Device = new MobilePhone("LG", "Nexus 5", "test_serial", "1212fa");
        tester.test(nexus5Device);
    }
}
