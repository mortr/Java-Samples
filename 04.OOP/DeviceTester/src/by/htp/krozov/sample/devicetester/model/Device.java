package by.htp.krozov.sample.devicetester.model;

/**
 * Device for test.
 */
public interface Device {

    boolean turnOn();

    abstract boolean turnOff();

    boolean test();
}
