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
        String name = menuItems.get(0); // to access an element in an ArrayList using an index
        for (String menu: menuItems)
            System.out.println(menu);
    }
}
