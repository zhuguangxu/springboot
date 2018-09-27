package com.example1.springdatajpa.Services;

import com.example1.springdatajpa.entity.Ssp;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

public interface SspService {
    Ssp save(Ssp ssp);

    List<Ssp> getAll();

    Ssp get(int id);
}
