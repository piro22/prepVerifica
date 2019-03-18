/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepverificatecno;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author giacomo
 */
public class PrepVerificaTecno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            
            Scanner input=new Scanner(System.in);
            System.out.print("inserisci il numero di volte che vuoi generare un carattere: ");
            int ripeti = input.nextInt();
            char buffer = '#';
            
            DatiCondivisi dc = new DatiCondivisi(ripeti, buffer);
            ThGenera t = new ThGenera(dc, ripeti);
            ThContaPunti cp = new ThContaPunti(dc, ripeti);
            ThContaSpazi cs = new ThContaSpazi(dc, ripeti);
            ThAggiorna a = new ThAggiorna(dc, ripeti);
            
            t.start();
            cp.start();
            cs.start();
            //a.start();
            
            t.join();
            cp.join();
            cs.join();
            //a.join();
            
            System.out.println("spazi: " + dc.getSpazi());
            System.out.println("punti: " + dc.getPunti());
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(PrepVerificaTecno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
