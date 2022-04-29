package com.hanxiao.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/

@Scope("prototype")
@Component
public class PrototypeBean {
}
