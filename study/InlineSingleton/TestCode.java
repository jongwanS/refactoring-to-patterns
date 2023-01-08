package study.InlineSingleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.CharArrayReader;

public class TestCode {

    @Test
    @DisplayName("inline 싱글턴")
    void inlineSingleTon(){
        Blackjack blackjack = new Blackjack();
        HitStayResponse inline = blackjack.play();
        HitStayResponse singleton = Console.obtainHitStayResponse(new BufferedReader(new CharArrayReader(new char[]{})));
        Assertions.assertEquals(singleton,inline);
    }
}
