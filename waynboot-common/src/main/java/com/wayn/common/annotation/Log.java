package com.wayn.common.annotation;

import com.wayn.util.enums.ModuleEnum;
import com.wayn.util.enums.OperatorEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    /**
     * 模块名称
     *
     * @return
     */
    ModuleEnum value() default ModuleEnum.DEFAULT;

    /**
     * 操作类型
     *
     * @return
     */
    OperatorEnum operator() default OperatorEnum.SELECT;

    /**
     * 是否记录请求参数
     *
     * @return
     */
    boolean isNeedParam() default true;
}
