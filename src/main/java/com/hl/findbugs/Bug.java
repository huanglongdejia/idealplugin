package com.hl.findbugs;

import com.hl.lombok.User;

/**
 * @author huanglong
 * @Description: findBugs 插件使用
 * @date 2018/11/2314:17
 */
public class Bug {

    public void test(){
        User u = null;

        System.out.println(u.getName());
    }

}
