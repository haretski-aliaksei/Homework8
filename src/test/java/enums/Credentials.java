package enums;

public enum Credentials {
    LOGIN("selenium_chrome"),
    PASSWORD("Axa@Demo");

    private String credential;

    Credentials(String credential) {
        this.credential = credential;
    }

    public String getCredential() {
        return credential;
    }
}
