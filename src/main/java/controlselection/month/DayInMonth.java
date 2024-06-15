package controlselection.month;

public class DayInMonth {

    //Írj egy olyan metódust, mely az év és a hónap magyar neve alapján visszaadja,
    // hogy az hány napos! Használj switch szerkezetet!
    // Figyelj arra, hogy ne számítson a kis- és nagybetű különbség!
    //Ha nem ismert a hónap, a metódus 0-t adjon vissza!
    //Figyelj a szökőévre (év osztható néggyel, de nem osztható százzal, kivéve, ha osztható 400-zal)!

    public int numberOfDays(int year, String month) {

        switch (month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;
            case "február":
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
}
