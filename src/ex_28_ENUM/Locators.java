package ex_28_ENUM;

public enum Locators
{
    inputbtn("#inputBtn"),
    LoginBtn("#loginBtn");

    private String Locator;

    Locators(String Locator){
        this.Locator=Locator;
    }

    String getLocator()
    {
        return this.Locator;
    }
}

