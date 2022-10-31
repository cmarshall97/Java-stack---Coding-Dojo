//ALL methods in CafeUtil class

class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for (int i =1; i<=10; i++){
            sum = sum + i ;
        }
        return sum;
    }

    public double getOrderTotal(double[]prices){
        double total = 0;
        for(double lineItems : prices){
            total = total + lineItems;
        }
        return total;
    }
        // for(double i=0; i<=prices.length; i++){
        //     total = total+prices[i];
        // }
        // return total;
}
