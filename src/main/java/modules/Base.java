package modules;

public class Base {
    private static String baseUrl = "http://book.theautomatedtester.co.uk/";

    public static String getBaseUrl() {
        System.out.print("Using Url>>>>>>>::" + baseUrl);
        return baseUrl;
    }

}
