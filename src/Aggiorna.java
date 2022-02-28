
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Personal
 */
public class Aggiorna implements Runnable{
    
    private JLabel lblOra;

    public Aggiorna() {
        
    }

    public Aggiorna(JLabel lblOra) {
        this.lblOra = lblOra;
    } 
    
    @Override
    public void run() {
        LocalTime ora;
        while(!Thread.interrupted()){
            ora=LocalTime.now();
            lblOra.setText(ora.format(DateTimeFormatter.ofPattern("hh : mm : ss")));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aggiorna.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
