import java.util.Objects;

public class Device {
    private String manufacture;
    private float price;
    private String serialNumber;

    public Device(String manufacture, float price, String serialNumber) {
        this.manufacture = manufacture;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public float getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 &&
                Objects.equals(manufacture, device.manufacture) &&
                Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(manufacture, price, serialNumber);
    }

    @Override
    public String toString() {
        return "Device:" +
                "manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'';
    }


}
