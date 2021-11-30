package com.ProjekatSB.ProjekatSB.service;
import com.ProjekatSB.ProjekatSB.entity.Znamenitost;
import com.ProjekatSB.ProjekatSB.izuzezak.UserNotFoundExeption;
import com.ProjekatSB.ProjekatSB.repository.repozitorija;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

@Service
public class ZnamenitostServis {
    private final repozitorija repozitorija;
@Autowired
    public ZnamenitostServis(com.ProjekatSB.ProjekatSB.repository.repozitorija repozitorija) {
        this.repozitorija = repozitorija;
    }

    public Znamenitost addZnamenitost(Znamenitost znamenitost){
     znamenitost.setkod(UUID.randomUUID().toString());
     return repozitorija.save(znamenitost);

    }

    public List<Znamenitost> findAllZnamenitosti(){
        return repozitorija.findAll();
    }
public Znamenitost updateZnamenitost(Znamenitost znamenitost){
        return repozitorija.save(znamenitost);

}
public Znamenitost findZnamenitostById(int id){
return repozitorija.findZnamenitostById(id).orElseThrow(()-> new UserNotFoundExeption("User by id" + id +"was not found"));

}
public void deleteZnamenitost(int id){
        repozitorija.deleteZnamenitostById(id);
}

}
