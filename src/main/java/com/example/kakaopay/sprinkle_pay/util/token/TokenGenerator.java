package com.example.kakaopay.sprinkle_pay.util.token;

public interface TokenGenerator {

    Token generate();

    boolean validate(String token);
}
