package com.sprinter.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@Entity
public class Client extends GenericEntity<Client> {

    private String name;

    private String surname;


}
