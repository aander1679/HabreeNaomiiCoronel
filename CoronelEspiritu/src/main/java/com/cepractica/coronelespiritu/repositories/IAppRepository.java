package com.cepractica.coronelespiritu.repositories;

import com.cepractica.coronelespiritu.entities.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRepository extends JpaRepository<App, Integer> {


}
