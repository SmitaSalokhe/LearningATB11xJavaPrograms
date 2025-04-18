package Ex_28_ENUM;

public class MainEnumClaas_Colours_Locators
{
    public static void main(String[] args)
    {
        System.out.println(Colours.BLUE.getHexcode());
        System.out.println(Colours.RED.getHexcode());

        System.out.println("--------------");

        System.out.println(Locators.inputbtn.getLocator());
        System.out.println(Locators.LoginBtn.getLocator());

        System.out.println("--------------");

        System.out.println(APIsURLs.vwo.getUrl());
        System.out.println(APIsURLs.google.getUrl());

    }
}
