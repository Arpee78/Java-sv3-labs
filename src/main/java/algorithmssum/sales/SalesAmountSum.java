package algorithmssum.sales;

import java.util.List;

public class SalesAmountSum {

    public int sumSalesAmount(List<Salesperson> salespeople){
        int sum=0;
        for (Salesperson salesperson : salespeople) {
            sum+= salesperson.getAmount();
        }
        return sum;
    }
}
