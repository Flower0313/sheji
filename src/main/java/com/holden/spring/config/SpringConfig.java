package com.holden.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName sheji-SpringConfig
 * @Athor Holden_-__--___Xiao
 * @Create 2022年6月21日00:23 - 周二
 * @Describe
 */

@Configuration //将类转为配置类，用于替代xml文件
@ComponentScan(basePackages = {"com.holden.spring"}) //组件扫描,相当于<context:component-scan base-package="com.holden.spring">
public class SpringConfig {


}
