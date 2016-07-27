package com.etyy.srm.repository;

import com.etyy.srm.model.CityEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

/**
 * Created by chenmingjiang on 2016/7/27.
 */
@Repository
public class WorldRepositoryImpl implements WorldRepository {

    @PersistenceContext
    EntityManagerFactory entityManagerFactory;


    @Override
    public void updateWorld() {
        entityManagerFactory.createEntityManager().find(CityEntity.class,1);
    }

}
