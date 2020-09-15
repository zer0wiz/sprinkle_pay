package com.example.kakaopay.sprinkle_pay.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.kakaopay.sprinkle_pay.ApplicationTest;
import com.example.kakaopay.sprinkle_pay.repository.RoomTokenRepository;
import com.example.kakaopay.sprinkle_pay.util.token.Token;
import com.example.kakaopay.sprinkle_pay.util.token.generators.AlphanumericTokenGenerator;

@DisplayName("TokenTest")
class TokenTest extends ApplicationTest {

    final AlphanumericTokenGenerator tokenGenerator = new AlphanumericTokenGenerator();

    @Autowired
    private RoomTokenRepository roomTokenRepository;

    @Nested
    @DisplayName("generate method")
    class generateMethod {

        @Test @DisplayName("returns Token instance normally")
        void returns_token_instance_normally() {
            final Token token = tokenGenerator.generate();
        }
    }

    @DisplayName("새로운 토큰을 저장한다.")
    @Test
    void saveTokenTest() {
        RoomToken roomToken = new RoomToken();
        roomToken.setRoomId(1L);
        roomToken.setExpireTime(10*60*1000L);
        roomToken.setToken(tokenGenerator.generate());
        roomTokenRepository.save(roomToken);
        assertThat(tokenGenerator.validate(roomToken.getToken().toString())).isTrue();
    }
}