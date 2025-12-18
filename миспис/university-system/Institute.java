public class Institute {
    private String name;
    private String address;

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getInfo() {
        return name + " (" + address + ")";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}