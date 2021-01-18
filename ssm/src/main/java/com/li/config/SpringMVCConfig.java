package com.li.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @DESCRIPTION:
 * @USER: li
 * @DATE: 2021/01/05 23:04
 */
@Configuration
@ComponentScan(basePackages = "com.li",useDefaultFilters =false,
includeFilters ={@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)} )
public class SpringMVCConfig {
}
