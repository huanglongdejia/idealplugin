package com.hl.generateallsetter;

import lombok.Data;

/**
 * @author huanglong
 * @Description: ${todo}
 * @date 2018/11/2314:39
 */
@Data
public class AllSet {

    private String a;
    private String b;
    private Integer c;
    private Double d;
    private Float f;

    public static void test(){
        AllSet s = null;
        s.setA("");
        s.setB("");
        s.setC(0);
        s.setD(0.0D);
        s.setF(0.0F);


    }
}
