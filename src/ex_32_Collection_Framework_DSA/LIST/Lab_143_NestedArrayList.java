package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_143_NestedArrayList
{
    public static void main(String[] args) {

        List<String> fruites = new ArrayList();
        fruites.add("Orange");
        fruites.add("Mango");
        fruites.add("Banana");
        System.out.println(fruites);

        List vegatables = new ArrayList();
        vegatables.add("tamato");
        vegatables.add("patato");
        vegatables.add("onion");
        System.out.println(vegatables);

        List flowers= new ArrayList();
        flowers.add("Rose");
        flowers.add("Sunflower");
        flowers.add("Lotus");
        System.out.println(flowers);

        List All_element= new ArrayList();
        All_element.add(fruites);
        All_element.add(vegatables);
        All_element.add(flowers);
        System.out.println(All_element);

        for(int i=0; i<All_element.size(); i++)
        {
            System.out.println(All_element.get(i));
        }
    }
}
