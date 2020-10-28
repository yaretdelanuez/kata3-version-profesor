
package kata3;

import kata3.core.HistogramLoader;
import kata3.core.Histogram;


public class InternalHistogramLoader implements HistogramLoader {
    private static final String[] data = new String[] {
        "Cadiz", "Madrid", "Madrid", "Barcelona", "Barcelona", "Sevilla", "Madrid", "Madrid", "Zaragoza", "Sevilla"
    };

    @Override
    public Histogram Load() {
        Histogram histogram = new Histogram();
        for (String region : data) {
            histogram.add(region);
        }
        return histogram;
    }


}
