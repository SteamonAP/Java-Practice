import java.util.*;

/**
 * Find positions where heart rate alert should be triggered
 * Alert when current rate is 20% higher than average of previous two
 * 
 * @param rates - array of heart rates
 * @return list of positions where alert triggered
 */

public class heartRate {
    public static List<Integer> heartRate(int[] rates) {
        List<Integer> alerts = new ArrayList<>();
        if (rates == null || rates.length == 0){
           return alerts;
        }

        for (int i = 2; i < rates.length; i++) {
            double avg = (rates[i - 1] + rates[i - 2]) / 2.0;

            double threshhold = avg * 1.20;

            if (rates[i] >= threshhold){
                alerts.add(i);
            }
        }

        return alerts;
    }

}
