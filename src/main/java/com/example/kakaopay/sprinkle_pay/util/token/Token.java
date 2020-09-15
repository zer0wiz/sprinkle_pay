package com.example.kakaopay.sprinkle_pay.util.token;

import java.io.Serializable;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.example.kakaopay.sprinkle_pay.exception.token.InvalidTokenExcetion;

import lombok.*;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "token")
@ToString
public class Token implements Serializable {

    public final static int LENGTH = 3;
    public final static int expireTerm = 7 * 24 * 60 * 60;

    @Column(name = "token", nullable = false)
    private String token;

    public Token(final String token) {
        this.token = token;
    }


}
