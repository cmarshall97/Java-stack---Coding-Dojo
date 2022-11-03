//ALL methods in CafeUtil class
import java.util.ArrayList;
class CafeUtil {

//find the streak of order goal
    public int getStreakGoal(){
        int sum = 0;
        for (int i =1; i<=10; i++){
            sum = sum + i ;
        }
        return sum;
    }

//using an array of prices - return the total price
    public double getOrderTotal(double[]prices){
        double total = 0;
        for(double lineItems : prices){
            total = total + lineItems;
        }
        return total;
    }

//view menu item
    public static void displayMenu(ArrayList<String>menuItems){
        for (int index = 0; index < menuItems.size(); index++){
            System.out.println(menuItems.get(index));
        }
        //below also works but does not display index number
        // for (String menu: menuItems)
        //     System.out.println(menu);
    }
//Add a customer
    public static void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        //Next print the userName to the console, saying "Hello, [user name here]!"
        //does not work
        System.out.println("Hello, + customers.get(userName) !");
        //Next print "There are ___ people in front of you" using the number 
        //for how many people are ahead of them (how many items already in the array)
        System.out.println("There are \n people in front of you");
        //Then, add the customer's name to the given customers list. And print the list.
        customers.add(userName);
        System.out.println(customers);

    }
}
