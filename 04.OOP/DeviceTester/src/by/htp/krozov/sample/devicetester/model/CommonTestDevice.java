package by.htp.krozov.sample.devicetester.model;

/**
 * Created by krozov on 12/23/13.
 */
public abstract class CommonTestDevice implements TestDevice {
    protected String vendor;
    protected String model;
    protected String serialNumber;

    private boolean on;

    public CommonTestDevice(String vendor, String model, String serialNumber) {
        this.vendor = vendor;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean turnOff() {
        on = false;
        return false;
    }

    @Override
    public boolean turnOn() {
        on = true;
        return true;
    }

    public boolean isOn() {
        return on;
    }

    public String getVendor() {
        return vendor;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
