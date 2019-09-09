import java.util.Scanner;
public class Exercise2 
{
        
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int numPizzas,numToppings;
        System.out.print("Enter the number of pizzas: ");
        numPizzas = input.nextInt ();
        System.out.print("Enter the total number of toppings: ");
        numToppings = input.nextInt ();
        double PricePizzas = 12.00;
        double PriceToppings = 1.50;
        double tax = 0.05;
        
        double totalPizzas = numPizzas * PricePizzas;
        double totalToppings = numToppings * PriceToppings;
        double totalPrice = totalPizzas + totalToppings;
        double totalTax = totalPrice * tax;
        double totalPriceTax = totalPrice + totalTax;
        
        System.out.println("Receipt: Number of Pizzas: "+numPizzas);
        System.out.println("Number of Toppings: "+numToppings);
        System.out.printf("Cost (incl tax): %.2f", totalPriceTax);
        
        
        
        
    }
}
