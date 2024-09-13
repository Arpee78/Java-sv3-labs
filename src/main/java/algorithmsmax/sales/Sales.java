package algorithmsmax.sales;

import java.util.List;

public class Sales {

    //kiválasztja a legnagyobb árbevételt elért értékesítőt
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);
        for (Salesperson sale : sales) {
            if (sale.getAmount() > salesperson.getAmount()) {
                salesperson = sale;
            }
        }
        return salesperson;
    }

    //kiválasztja azt az értékesítőt, aki a célt a legnagyobb összeggel meghaladta
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);
        for (Salesperson sale : sales) {
            if (sale.getDifferenceFromTarget() > salesperson.getDifferenceFromTarget()) {
                salesperson = sale;
            }
        }
        return salesperson;
    }

    //kiválasztja azt az értékesítőt, aki a legnagyobb összeggel alulmúlta a célt
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales) {
        Salesperson salesperson = sales.get(0);
        for (Salesperson sale : sales) {
            if (sale.getDifferenceFromTarget() < salesperson.getDifferenceFromTarget()) {
                salesperson = sale;
            }
        }
        return salesperson;
    }
}
