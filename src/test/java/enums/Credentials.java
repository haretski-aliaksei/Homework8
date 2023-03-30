package enums;

public enum Credentials {
    LOGIN("selenium_chrome"),
    PASSWORD("Axa@Demo"),
    INCORRECT_LOGIN("incorrectLogin");

    private String credential;

    Credentials(String credential) {
        this.credential = credential;
    }

    public String getCredential() {
        return credential;
    }
}
