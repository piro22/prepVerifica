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
public class ThContaSpazi extends Thread{
    DatiCondivisi dc;
    int ripetizioni;
    char[] archivio;
    int spazi;

    
    
    public ThContaSpazi(DatiCondivisi dc, int ripetizioni) {
        this.dc = dc;
        this.ripetizioni = ripetizioni;
        this.archivio = new char[ripetizioni];
        this.spazi = 0;
    }
    
    
    
    public void run(){
        for(int i = 0; i < ripetizioni; i++)
        {
            archivio[i] = dc.recuperaArchivio(i);
            //System.out.println(archivio[i]);
            
            if(archivio[i] == ' '){
                spazi = spazi + 1;
            }
            
            dc.setSpazi(spazi);
        }
        
        
    }
    
}
