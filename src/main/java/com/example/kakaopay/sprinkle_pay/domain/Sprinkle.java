package com.example.kakaopay.sprinkle_pay.domain;

import javax.persistence.*;

import com.example.kakaopay.sprinkle_pay.util.token.Token;

import lombok.*;

@Entity
@Table(name = "sprinkle")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Sprinkle {
    public static final int PICK_EXPIRE_MINUTES = 10;
    public static final int READ_EXPIRE_DAYS = 7;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long chatroomId;

    @Column(name = "token", nullable = false)
    private Token token;

    @Column(name = "user_id", nullable = false)
    private String userId;
//    @Min(3)
    private long recipientsCnt;

    private long amountMoney;

    private long sprinkledTime;

    private long viewExpireTime;
}
