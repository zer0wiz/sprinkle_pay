package com.example.kakaopay.sprinkle_pay.util.token.generators;

import java.util.regex.Pattern;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

import com.example.kakaopay.sprinkle_pay.exception.token.InvalidTokenExcetion;
import com.example.kakaopay.sprinkle_pay.util.token.Token;
import com.example.kakaopay.sprinkle_pay.util.token.TokenGenerator;

@Component
public class AlphanumericTokenGenerator implements TokenGenerator {

    @Override
    public Token generate() {
        return new Token(RandomStringUtils.randomAlphanumeric(Token.LENGTH));
    }

    @Override
    public boolean validate(String token) {

        if(!patternCheck(token)){
            throw new InvalidTokenExcetion();
        }

        if (removeWhiteSpaces(token).length() != Token.LENGTH) {
            throw new InvalidTokenExcetion();
        }
        return true;
    }

    private static boolean patternCheck(String token){
        String regex = "^[a-zA-Z0-9]+$";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(token).matches();
    }

    private static String removeWhiteSpaces(final String tokenValue) {
        return tokenValue.replaceAll("\\s+", "");
    }
}
