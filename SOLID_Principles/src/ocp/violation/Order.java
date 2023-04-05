package ocp.violation;

public class Order {
        String item;
        public void buy(String item)
        {
                if(item.equals("cake"))
                        System.out.print("Cake is bought");
                else
                        System.out.print("Icecream is bought");
        }
}
