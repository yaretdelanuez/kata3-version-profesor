
package kata3;

import kata3.core.HistogramDisplay;
import kata3.core.Histogram;
import java.awt.BorderLayout;
import javax.swing.JFrame;


public class Main extends JFrame {
    private HistogramDisplay histogramDisplay;

    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main(){
        setTitle("Histogram");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        rootPane.setLayout(new BorderLayout());
        rootPane.add(createHistogramDisplay(), BorderLayout.CENTER);
        
    }

    private void execute() {
        Histogram histogram = new InternalHistogramLoader().Load();
        histogramDisplay.display(histogram);
        setVisible(true);
    }
    private SwingHistogramDisplay createHistogramDisplay(){
        SwingHistogramDisplay display = new SwingHistogramDisplay();
        this.histogramDisplay = display;
        return display;
    }
}
