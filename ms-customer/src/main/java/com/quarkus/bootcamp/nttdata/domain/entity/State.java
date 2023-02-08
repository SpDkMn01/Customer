package com.quarkus.bootcamp.nttdata.domain.entity;

import jakarta.persistence.*;

@Entity
@Cacheable
@Table(name = "States")
public class State {
  @Id
  @SequenceGenerator(
        name = "stateSequence",
        sequenceName = "state_id_seq",
        allocationSize = 1,
        initialValue = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stateSequence")
  private Long id;
  @Column(length = 40, unique = true)
  private String name;
}
