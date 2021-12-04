package com.ProjekatSB.ProjekatSB.entity;
import com.fasterxml.jackson.core.SerializableString;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity




public class Znamenitost implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String naziv;
    private String opis;
    private String slika;
    private double lat;
    private double lon;
    private String opcina;
    private String drzava;
    private String kod;
    private int ocjena;
    private double prosjekocjene;
    private String aktivnost ;


public Znamenitost (String naziv,String opis, String slika,Double lat,Double lon,String opcina,String drzava,String kod,Integer ocjena,Double prosjekocjene,String aktivnost){

    this.naziv=naziv;
    this.opis=opis;
    this.slika=slika;
    this.lat=lat;
    this.lon=lon;
    this.opcina=opcina;
    this.drzava=drzava;
    this.kod=kod;
    this.ocjena=ocjena;
    this.prosjekocjene=prosjekocjene;
    this.aktivnost=aktivnost;
}
public int getId(){
    
    return id;
}
public void setid(int id){
    
    this.id=id;
}
public String getnaziv() {

    return naziv;
}
public void setnaziv(String naziv){
    this.naziv=naziv;
}

    public String getopis() {
        return opis;
    }
    public void setopis(String opis){
        this.opis=opis;
    }

    public String getslika() {
        return slika;
    }
    public void setslika(String slika){
        
    this.slika=slika;
    }

    public String getopcina() {
        return opcina;
    }
    public void setopcina(String opcina){
        
    this.opcina=opcina;
    }

    public String getdrzava() {
        return drzava;
    }
    public void setdrzava(String drzava){
        
    this.drzava=drzava;
    }
    public double getlon() {
        return lon;
    }
    public void setlon(double lon){
        
    this.lon=lon;
    }
    public double getlat() {
        
    return lat;
    }
    public void setlat(double lat) {
        
    this.lat = lat;
    }
    public String getkod() {
        return kod;
    }
    
    public void setkod(String kod) {
        this.kod = kod;
    }
    public int getocjena() {
        return ocjena;
    }

    public void setocjena(int ocjena) {
        this.ocjena = ocjena;
    }
    public double getprosjekocjene() {
        return prosjekocjene;
    }

    public void setprosjekocjene(double prosjekocjene) {
        this.prosjekocjene = prosjekocjene;
    }

    public String getpaktivnost() {
        return aktivnost;
    }

    public void setaktivnost(String aktivnost) {
        this.aktivnost = aktivnost;
    }
        @Override
        public String toString(){
            return
                    naziv + '\'' + opis + '\'' + slika + '\'' + lat + '\'' + lon + '\'' + opcina + '\'' + drzava+ '\'' + kod+ '\'' +ocjena+ '\'' +prosjekocjene+ '\'' +aktivnost;
        }
}
