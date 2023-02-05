package study.ComposMethod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListTest {
    private final static int GROWTH_INCREMENT = 5;

    @Test
    @DisplayName("default 사이즈는 5이다.")
    void defaultListSize(){
        List list = new List();
        for(int i=0;i<GROWTH_INCREMENT;i++){
            list.add(i);
        }
        Assertions.assertEquals(5,list.getSize());
    }

    @Test
    @DisplayName("리스트 사이즈가 5를 넘으면, 새로운 5만큼의 사이즈를 추가한다.")
    void listClassTest(){
        List list = new List();
        for(int i=0;i<GROWTH_INCREMENT + 2 ;i++){
            list.add(i);
        }

        Assertions.assertEquals(10,list.getSize());
    }
}
