import java.util.Objects;

public class EthernetAdapter extends Device {

    private int speed;
    private int mac;

    public EthernetAdapter(String manufacture, float price, String serialNumber, int speed, int mac) {
        super(manufacture, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMac() {
        return mac;
    }

    public void setMac(int mac) {
        this.mac = mac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return speed == that.speed &&
                mac == that.mac;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), speed, mac);
    }

    @Override
    public String toString() {
        return super.toString() + "EthernetAdapter{" +
                "speed=" + speed +
                ", mac=" + mac +
                '}';
    }
}
