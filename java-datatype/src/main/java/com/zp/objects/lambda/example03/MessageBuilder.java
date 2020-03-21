package com.zp.objects.lambda.example03;


/**
 * @author zhoupeng
 */
@FunctionalInterface
public interface MessageBuilder {

    /**
     * 日志信息拼接
     *
     * @return String
     */
    String builderMessage();
}
