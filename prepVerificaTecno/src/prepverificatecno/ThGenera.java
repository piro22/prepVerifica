/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepverificatecno;

import java.util.*;

/**
 *
 * @author giacomo
 */
public class ThGenera extends Thread {
    
    DatiCondivisi dc;
    Random random = new Random();
    
    int ripeti; 
    char buffer;
    char[] caratteri = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' ','.'};

    public ThGenera(DatiCondivisi dc, int ripeti) {
        this.dc = dc;
        this.ripeti = ripeti;
    }
    
    
    
    public void run()
    {
        for(int i = 0; i < ripeti; i++){
            int temp = random.nextInt(28);
            
            buffer = caratteri[temp];
            
            System.out.println(buffer);
            
            dc.archivia(buffer, i);
            
        }
        
        
    }
    
}
