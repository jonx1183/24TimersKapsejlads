package com.example._3sem24timersbackend.Service;

import com.example._3sem24timersbackend.Model.BoatModel;
import com.example._3sem24timersbackend.Repository.BoatRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatService {

  @Autowired
  private BoatRepository boatRepository;

  public List<BoatModel> getListOfBoats(){
    return boatRepository.findAll();
  }

  public BoatModel createBoat(BoatModel boat){
    return boatRepository.save(boat);
  }

  public void deleteBoatById(Integer id){
    boatRepository.deleteById(id);
  }
}
