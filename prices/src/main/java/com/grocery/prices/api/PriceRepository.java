package com.grocery.prices.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price, Long> {
}
