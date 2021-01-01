package practiceJupiterMart;

public class products {

    private int id;
    private int price;
    private String OS;
    private String screenSize;
    private boolean isLaptop;


    public products(int id, int price, String OS, String screenSize, boolean isLaptop) {
        this.id = id;
        this.price = price;
        this.OS = OS;
        this.screenSize = screenSize;
        this.isLaptop = isLaptop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }
}
