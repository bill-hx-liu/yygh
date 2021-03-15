package com.atguigu.yygh.hosp.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author:lhx
 * @date 2021/3/15 16:32
 * @function:
 */
@Configuration
@MapperScan("package com.atguigu.yygh.hosp.mapper")
public class HospConfig {
}
