package com.example._3sem24timersbackend.Controller;

import com.example._3sem24timersbackend.Model.BoatModel;
import com.example._3sem24timersbackend.Service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoatRESTController {
  @Autowired
  private BoatService boatService;

  @GetMapping("/ListOfBoats")
  public List<BoatModel>getListOgBoats(){
    List<BoatModel> lstBoats = boatService.getListOfBoats();

    return lstBoats;
  }

  @PostMapping("/CreateBoat")
  public void createBoat(BoatModel boat){
    boatService.createBoat(boat);
  }

  @DeleteMapping("/DeleteBoat")
  public void deleteBoat(int id){
    boatService.deleteBoatById(id);
  }
}
