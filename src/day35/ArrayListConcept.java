package day35;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
    public static void main(String[] args) {
        //ArrayList<String> amazonProduct = new ArrayList<>();
        List<String> amazonProduct = new ArrayList<>();
        amazonProduct.add("IPhone");
        amazonProduct.add("Laptop");
        amazonProduct.add("Pen");
        amazonProduct.add("Lighter");
        amazonProduct.add("Painting");
        amazonProduct.add("Chandelier");
        amazonProduct.add("Book");
        amazonProduct.add("Drawing Board");
        amazonProduct.add("Chopper");
        amazonProduct.add("Chopper");
        amazonProduct.add("Notebook");
        amazonProduct.add("Notebook");
        amazonProduct.add("DataCable");

        System.out.println(amazonProduct);
        System.out.println("===========================");
        for(int i=0; i<amazonProduct.size(); i++)
        {
            System.out.println(amazonProduct.get(i));
        }

        System.out.println("===========================");
        int i=0;
        while ( i<amazonProduct.size())
        {
            System.out.println(amazonProduct.get(i));
            i++;
        }
        System.out.println("===========================");
        for(String product: amazonProduct)
        {
            System.out.println(product);
        }

    }
}

//Order is maintained
//This can hold duplicate Values
