
class SmartDevice {
    protected String deviceName;
    private boolean powerStatus;

    public SmartDevice(String deviceName) {
        this.deviceName = deviceName;
        this.powerStatus = false;
    }

    public void turnOn() {
        powerStatus = true;
        System.out.println("Device is now ON");
    }
}

class SmartLight extends SmartDevice {
    int brightness;

    public SmartLight(String deviceName, int brightness) {
        super(deviceName);
        this.brightness = brightness;
    }

    @Override
    public void turnOn() {
        System.out.println(
                "Light is ON with brightness level " + brightness);
    }
}

class SmartFan extends SmartDevice {
    int speed;

    public SmartFan(String deviceName, int speed) {
        super(deviceName);
        this.speed = speed;
    }

    @Override
    public void turnOn() {
        System.out.println(
                "Fan is spinning at speed " + speed
        );
    }
}

public class inher{
    public static void main(String[] args) {


        SmartLight light = new SmartLight("Bedroom Light", 80);
        light.turnOn();


        SmartDevice dev = new SmartLight("Living Room Light", 100);
        dev.turnOn();


        SmartLight myLight = (SmartLight) dev;
        System.out.println(
                "Brightness level: " + myLight.brightness
        );


        SmartFan fan = new SmartFan("Ceiling Fan", 3);
        fan.turnOn();
    }
}


