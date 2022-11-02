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
}
