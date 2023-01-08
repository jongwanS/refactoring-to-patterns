package study.InlineSingleton;

import java.io.BufferedReader;
import java.io.CharArrayReader;

public class Blackjack {
    public HitStayResponse obtainHitStayResponse(BufferedReader input){
        //싱글턴 객체를 리턴한다.
        return Console.obtainHitStayResponse(input);
    }
    public void setPlayerResponse(HitStayResponse newHitStayResponse){
        Console.setPlayerResponse(newHitStayResponse);
    }

    public HitStayResponse play(){
        deal();
        HitStayResponse hitStayResponse;//싱글턴 객체를 옮길 객체
        do {
            //Console.obtainHitStayResponse <-- 싱글턴을 의존하지 않는다.
            hitStayResponse = obtainHitStayResponse(new BufferedReader(new CharArrayReader(new char[]{})));
        }while (canPlayerHit(hitStayResponse));
        return hitStayResponse;
    }

    private boolean canPlayerHit(HitStayResponse hitStayResponse) {
        return false;
    }

    private void deal() {
    }
}
