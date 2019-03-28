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
public class DatiCondivisi {
    private int ripeti;
    private char buffer;
    private char[] archivio;
    private int punti;
    private int spazi;
    

    public DatiCondivisi(int ripeti, char buffer) 
    {
        this.ripeti = ripeti;
        this.buffer = buffer;
        this.archivio = new char[ripeti];
        this.spazi = 0;
        this.punti = 0;
    }

    public char getBuffer() 
    {
        return buffer;
    }

    public void setBuffer(char buffer) 
    {        
        this.buffer = buffer;
    }
    
    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public int getSpazi() {
        return spazi;
    }

    public void setSpazi(int spazi) {
        this.spazi = spazi;
    }
    
    
    
    public void archivia(char buffer, int pos)
    {
        archivio[pos] = buffer;
    }
    
    public char recuperaArchivio(int pos)
    {
        return archivio[pos];
    }

    
}
