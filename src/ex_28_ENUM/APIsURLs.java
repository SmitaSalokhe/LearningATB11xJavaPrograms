package ex_28_ENUM;

public enum APIsURLs
{
    vwo("https://app.vwo.com"),
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    APIsURLs(String url)
    {
        this.url=url;
    }

    String getUrl()
    {
        return url;
    }

}
