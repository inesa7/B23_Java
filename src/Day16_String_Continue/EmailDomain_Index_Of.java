package Day16_String_Continue;

public class EmailDomain_Index_Of {
    public static void main(String[] args) {

        String email = "John_Daniel@apple.com";
        int beginningIndex = email.indexOf("@") +1  ;
        int endingIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println("domain = " + domain);
    }
}
//find domain of email "John_Daniel@apple.com"
