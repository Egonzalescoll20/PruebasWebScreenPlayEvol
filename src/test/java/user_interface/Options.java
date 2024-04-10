package user_interface;

public enum Options {
    OPENCART("https://katalon-demo-cura.herokuapp.com/");
    private final String url;

    Options(String url) {
        this.url = url;
    }

    public String url(){
        return url;
    }
}
