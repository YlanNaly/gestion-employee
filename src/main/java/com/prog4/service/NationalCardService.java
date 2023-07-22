package com.prog4.service;

import com.prog4.entity.NationalCard;
import com.prog4.repository.NationalCardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class NationalCardService {
    private final NationalCardRepository repository;

    public List<NationalCard> findAll(){
        return repository.findAll();
    }

    public NationalCard findById(Long id){
        Optional<NationalCard> nationalCard = repository.findById(id);
        NationalCard nationalCard1 = new NationalCard();
        if(nationalCard.isPresent()){
            nationalCard1.setDate(nationalCard.get().getDate());
            nationalCard1.setNumber(nationalCard.get().getNumber());
            nationalCard1.setPlace(nationalCard.get().getPlace());
        }
        nationalCard1.setId(id);
        return nationalCard1;
    }
}
