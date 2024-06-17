package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {

    List<Hour> hoursOfDay = new ArrayList<>();

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public void addHour(Hour hour) {
        hoursOfDay.add(hour);
    }

    public void setDayPeriod() {
        for (Hour hour : hoursOfDay) {
            int actualHour = hour.getHourNumber();
            if (actualHour > 6 && actualHour < 22) {
                hour.setPeriod(DayPeriod.DAYTIME);
            } else hour.setPeriod(DayPeriod.NIGHTTIME);
        }
    }
}
