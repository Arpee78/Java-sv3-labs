package formatlocaleprintf;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Run {

    private final String RUN_TEXT = "Kedves %s! " +
            "A mai dátum: %s. " +
            "Ezen a héten ez a(z) %d. futásod. " +
            "Most %.1f km-t futottál. Csak így tovább!";
    private List<Double> kms;
    private String name;

    public Run(List<Double> kms, String name) {
        this.kms = kms;
        this.name = name;
    }

    public void addRun(double km) {
        kms.add(km);
    }

    public String printFormattedRunText() {
        String date = LocalDate.now().toString();
        double km = kms.get(kms.size()-1);
        return String.format(RUN_TEXT, name, date, kms.size(), km);
    }

}
