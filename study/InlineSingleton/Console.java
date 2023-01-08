package study.InlineSingleton;

import java.io.BufferedReader;

public class Console {
    static private HitStayResponse hitStayResponse = new HitStayResponse();

    public static HitStayResponse obtainHitStayResponse(BufferedReader input){
        hitStayResponse.readForm(input);
        return hitStayResponse;
    }
    public static void setPlayerResponse(HitStayResponse newHitStayResponse){
        hitStayResponse = newHitStayResponse;
    }
}
