package com.ProjekatSB.ProjekatSB.entity;
import com.fasterxml.jackson.core.SerializableString;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "znamenitost_tabela");

public class Znamenitost {
    @Id
    @GeneratedValue
    private int id;
    private String naziv;
    private String opis;
    private String slika;
    private double lat;
    private double lon;
    private String opcina;
    private String Drzava;



}
