/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepverificatecno;

/**
 *
 * @author giacomo
 */
public class ThAggiorna extends Thread {
    int punti;
    int spazi;
    DatiCondivisi dc;
    int ripetizioni;

    public ThAggiorna(DatiCondivisi dc, int ripetizioni) {
        this.dc = dc;
        this.punti = 0;
        this.spazi = 0;
        this.ripetizioni = ripetizioni;
    }
    
    public void run()
    {
        for(int i = 0; i < ripetizioni; i++)
        {
            
            
            
        }
    }
    
}
