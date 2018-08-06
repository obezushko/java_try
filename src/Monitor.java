import java.util.Objects;

public class Monitor extends Device {

    private int resolutionX;
    private int getResolutionY;

    public Monitor(String manufacture, float price, String serialNumber, int resolutionX, int getResolutionY) {
        super(manufacture, price, serialNumber);
        this.resolutionX = resolutionX;
        this.getResolutionY = getResolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getGetResolutionY() {
        return getResolutionY;
    }

    public void setGetResolutionY(int getResolutionY) {
        this.getResolutionY = getResolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Monitor monitor = (Monitor) o;
        return resolutionX == monitor.resolutionX &&
                getResolutionY == monitor.getResolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), resolutionX, getResolutionY);
    }

    @Override
    public String toString() {
        return super.toString() + "Monitor:" +
                "resolutionX=" + resolutionX +
                ", getResolutionY=" + getResolutionY;
    }
}
