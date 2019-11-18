package com.FordDemo.Car.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FordDemo.Car.model.CAR;

public interface CarRepository extends JpaRepository<CAR, Long> {

}
