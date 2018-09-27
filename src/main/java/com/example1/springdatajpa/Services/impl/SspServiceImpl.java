package com.example1.springdatajpa.Services.impl;

import com.example1.springdatajpa.Services.SspService;
import com.example1.springdatajpa.dao.SspRepository;
import com.example1.springdatajpa.entity.Ssp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SspServiceImpl implements SspService {

    @Resource
    private SspRepository sspRepository;

    @Override
    public Ssp save(Ssp ssp) {
        return sspRepository.save(ssp);
    }

    @Override
    public List<Ssp> getAll() {
        return sspRepository.findAll();
    }

    @Override
    public Ssp get(int id) {
        return sspRepository.findById(id).get();
    }
}
