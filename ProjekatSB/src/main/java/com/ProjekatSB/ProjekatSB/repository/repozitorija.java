package com.ProjekatSB.ProjekatSB.repository;

import com.ProjekatSB.ProjekatSB.entity.Znamenitost;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface repozitorija extends  JpaRepository<Znamenitost,Integer> {


    void deleteZnamenitostById(int id);

Optional<Znamenitost> findZnamenitostById(int id);
}
