package com.quarkus.bootcamp.nttdata.domain.services;

import com.quarkus.bootcamp.nttdata.domain.StateRepository;
import com.quarkus.bootcamp.nttdata.domain.entity.State;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class StateService {
  @Inject
  StateRepository repository;

  public List<State> getAll() {
    return repository.listAll();
  }
}
