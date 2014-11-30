package by.htp.krozov.sample.devicetester.model;

import java.util.Random;

/**
 * Created by krozov on 12/23/13.
 */
public class MobilePhone extends CommonDevice {

    private String emei;

    private Random random;

    public MobilePhone(String vendor, String model, String serialNumber, String emei) {
        super(vendor, model, serialNumber);
        this.emei = emei;
        this.random = random;
    }

    @Override
    public boolean turnOn() {
        return random.nextBoolean();
    }

    @Override
    public boolean turnOff() {
        return random.nextBoolean();
    }

    @Override
    public boolean test() {
        return random.nextBoolean();
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                " vendor='" + vendor + '\'' +
                ", model='" + model + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", emei='" + emei + '\'' +
                '}';
    }
}