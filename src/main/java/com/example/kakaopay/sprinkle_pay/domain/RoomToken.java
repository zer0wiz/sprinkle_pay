package com.example.kakaopay.sprinkle_pay.domain;

import javax.persistence.*;

import com.example.kakaopay.sprinkle_pay.util.token.Token;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class RoomToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "room_id", nullable = false)
    private Long roomId;

    @Column(name = "token", nullable = false)
    private Token token;

    @Column(name = "expire_time", nullable = false)
    private Long expireTime;




}
