package com.example.kakaopay.sprinkle_pay.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.kakaopay.sprinkle_pay.domain.RoomToken;

@Repository
public interface RoomTokenRepository extends JpaRepository<RoomToken, Long> {
}
