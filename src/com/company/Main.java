package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        //
        // grocery grocery1 = new grocery();



        Scanner in = new Scanner(System.in);
        String response = "";
        ArrayList<Itemgrocery> Items = new ArrayList<>();

        do {
            System.out.println("Please enter item: ");
            String item = in.nextLine();



            System.out.println("Please enter price: ");
            double price = in.nextDouble();


            System.out.println("Please enter quantity: ");
            int quantity = in.nextInt();



            Items.add(new Itemgrocery(item, price, quantity));

            System.out.println("Input another Grocery Item? Yes or No");
            response = in.next();
            in.nextLine();
            }while( !response.equalsIgnoreCase("no"));




        double total =0;
        int purchase =0;
        System.out.println("Item" + "\t Price" + "\t Quantity" + " \t Cost");
        for(Itemgrocery t:Items) {
            System.out.print(t.getItem() + "\t");
            System.out.print("$" + t.getPrice() + "\t\t");
            System.out.print(+t.getQuantity() + "\t\t");
            System.out.print("$" + t.getCost() + "\t\t\n");


            total += t.getCost();
            purchase += t.getQuantity();
        }
        System.out.println ("Total Purchase Amount = " + "$" +total);
        System.out.println ("Total Items Purchased = " + "$" +purchase);



    }
}
