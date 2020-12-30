package jupiterMart;

import java.util.ArrayList;

public class cellPhones extends products{
    String OS;
    String screenSize;

    public cellPhones() {

        ArrayList<String> cellPhone = new ArrayList<>();
        cellPhone.add("iPhone XR");
        cellPhone.add("iPhone 11");
        cellPhone.add("iPhone 12");
        cellPhone.add("Samsung Galaxy S20");
        cellPhone.add("Google Pixel 5");
        cellPhone.add("Motorola One 5G");

        System.out.println(cellPhone);

    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
