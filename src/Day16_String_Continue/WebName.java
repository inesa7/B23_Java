package Day16_String_Continue;
// find the name of the web
public class WebName {
    public static void main(String[] args) {
        String url = "www.cybertek.gov";

        int beginning = url.indexOf(".")+1;
        int end =  url.lastIndexOf(".");

        String name = url.substring( beginning ,  end ); // web name
        System.out.println(name); //cybertek

        String domain = url.substring( end + 1 ); // name of url
        System.out.println(domain); //gov

    }
}
