package com.ProjekatSB.ProjekatSB;

import com.ProjekatSB.ProjekatSB.entity.Znamenitost;
import com.ProjekatSB.ProjekatSB.service.ZnamenitostServis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/znamenitost")

public class ZnamenitostResursi {
    private final ZnamenitostServis znamenitostServis;

    public ZnamenitostResursi(ZnamenitostServis znamenitostServis) {
        this.znamenitostServis = znamenitostServis;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Znamenitost>> getAllZnamenitosti() {
        List<Znamenitost> znamenitosti = znamenitostServis.findAllZnamenitosti();
        return new ResponseEntity<>(znamenitosti, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Znamenitost> getZnamenitostById(@PathVariable("id") int id) {
        Znamenitost znamenitost = znamenitostServis.findZnamenitostById(id);
        return new ResponseEntity<>(znamenitost, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Znamenitost> addZnamenitost(@RequestBody Znamenitost znamenitost) {
        Znamenitost novaznamenitost = znamenitostServis.addZnamenitost(znamenitost);
        return new ResponseEntity<>(novaznamenitost, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Znamenitost> updateZnamenitost(@RequestBody Znamenitost znamenitost){
        Znamenitost updateznamenitost = znamenitostServis.updateZnamenitost(znamenitost);
        return new ResponseEntity<>(updateznamenitost,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteZnamenitost(@PathVariable("id") int id){
     znamenitostServis.deleteZnamenitost(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
