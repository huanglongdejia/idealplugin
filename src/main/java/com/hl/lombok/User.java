package com.hl.lombok;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;


/**
 * @author huanglong
 * @Description: lombok 插件使用
 * @date 2018/11/2311:44
 */
@Slf4j
@Data
public class User {
    private String name;
    private Integer age;



    public void showLog(){
        try {
            log.info(this.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
