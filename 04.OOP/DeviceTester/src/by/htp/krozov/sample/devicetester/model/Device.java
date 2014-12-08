package by.htp.krozov.sample.devicetester.model;

/**
 * Created by krozov on 12/23/13.
 */
public interface Device {

    boolean turnOn();

    abstract boolean turnOff();

    boolean test();
}
