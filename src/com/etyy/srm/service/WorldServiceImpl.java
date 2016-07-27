package com.etyy.srm.service;

import com.etyy.srm.repository.WorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenmingjiang on 2016/7/27.
 */
@Service
public class WorldServiceImpl implements WorldService {

    @Autowired
    WorldRepository worldRepository;

    @Override
    public void updateWorld() {
        worldRepository.updateWorld();
    }
}
