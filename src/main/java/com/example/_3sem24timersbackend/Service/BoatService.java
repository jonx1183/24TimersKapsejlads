package com.example._3sem24timersbackend.Service;

import com.example._3sem24timersbackend.Model.BoatModel;
import com.example._3sem24timersbackend.Repository.BoatRepository;
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

  public void createBoat(BoatModel boat){
    boatRepository.save(boat);
  }

  public void deleteBoatById(int id){
    boatRepository.deleteById(id);
  }
}
