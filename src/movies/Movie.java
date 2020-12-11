package movies;

public class Movie {
    private String name;
    private String catergory;

    public Movie(String name, String catergory){
        this.name = name;
        this.catergory = catergory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }
}
