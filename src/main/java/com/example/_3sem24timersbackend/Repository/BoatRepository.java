package com.example._3sem24timersbackend.Repository;

import com.example._3sem24timersbackend.Model.BoatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoatRepository extends JpaRepository<BoatModel, Integer> {

}
