public class Main {
    public static void main(String[] args) {
        Device device1 = new Device("Sumsung",500,"123");
        Device device2 = new Device("Sumsung",500,"123");
        Device device3 = new Device("Apple",800,"123");

        System.out.println(device1);
        System.out.println(device1.equals(device2));
        System.out.println(device2.equals(device3));
        System.out.println(device1.hashCode());
        System.out.println(device2.hashCode());
        System.out.println(device3.hashCode());

        Monitor monitor1 = new Monitor("Dell", 650, "111-222", 1080, 920);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("TPlink", 100, "234", 100, "AABF15");

    }


}
