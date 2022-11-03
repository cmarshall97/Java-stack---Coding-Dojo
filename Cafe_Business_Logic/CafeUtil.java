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
        //below works but does not display index number
        // for (int index = 0; index < menuItems.size(); index ++){
        //     System.out.println(menuItems.get(index));
        // }
        //below also works but does not display index number
        // for (String menu: menuItems)
        //     System.out.println(menu);

        for (int i = 0; i < menuItems.size(); i ++){
            System.out.printf("%s %s\n", i, menuItems.get(i));
        }
        //the \n allows for the entries to be on different lines
        //%s is a placeholder
    }
//Add a customer
    public static void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        //Next print the userName to the console, saying "Hello, [user name here]!"
        System.out.println("Hello," + userName);
        //Next print "There are ___ people in front of you" using the number 
        //for how many people are ahead of them (how many items already in the array)
        System.out.printf("There are %s \n people in front of you", customers.size());
        //Then, add the customer's name to the given customers list. And print the list.
        customers.add(userName);
        System.out.println(customers);

    }
}
