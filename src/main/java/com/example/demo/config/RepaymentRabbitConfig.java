package com.example.demo.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepaymentRabbitConfig {

    @Bean
    public FanoutExchange repayExchange() {
        return new FanoutExchange(Constants.REPAYMENT_EXCHANGE);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Bean
    public Queue jzRepayQueue() {
        return QueueBuilder
                .durable(Constants.JZ_REPAYMENT_PUSH_QUEUE)
                .withArgument(Constants.X_DEAD_LETTER_EXCHANGE, Constants.JZ_REPAYMENT_PUSH_EXCHANGE_DXL)
                .withArgument(Constants.X_DEAD_LETTER_ROUTING_KEY, Constants.JZ_REPAYMENT_PUSH_ROUTING_KEY_DXL)
                .build();
    }

    @Bean
    public Binding jzRepayBinding() {
        return BindingBuilder
                .bind(jzRepayQueue())
                .to(repayExchange());
    }

    @Bean
    public Exchange jzRepayDxlExchange() {
        return ExchangeBuilder
                .directExchange(Constants.JZ_REPAYMENT_PUSH_EXCHANGE_DXL)
                .build();
    }

    @Bean
    public Queue jzRepayDxlQueue() {
        return QueueBuilder
                .durable(Constants.JZ_REPAYMENT_PUSH_QUEUE_DXL)
                .build();
    }

    @Bean
    public Binding jzRepayDxlBinging() {
        return BindingBuilder
                .bind(jzRepayDxlQueue())
                .to(jzRepayDxlExchange())
                .with(Constants.JZ_REPAYMENT_PUSH_ROUTING_KEY_DXL)
                .noargs();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
//    @Bean
//    public Queue htRepayQueue() {
//        return QueueBuilder
//                .durable(Constants.JZ_REPAYMENT_PUSH_QUEUE)
//                .withArgument(Constants.X_DEAD_LETTER_EXCHANGE, Constants.JZ_REPAYMENT_PUSH_EXCHANGE_DXL)
//                .withArgument(Constants.X_DEAD_LETTER_ROUTING_KEY, Constants.JZ_REPAYMENT_PUSH_ROUTING_KEY_DXL)
//                .build();
//    }
//
//    @Bean
//    public Binding htRepayBinding() {
//        return BindingBuilder
//                .bind(htRepayQueue())
//                .to(repayExchange());
//    }
//
//    @Bean
//    public Exchange htRepayDxlExchange() {
//        return ExchangeBuilder
//                .directExchange(Constants.HT_REPAYMENT_PUSH_EXCHANGE_DXL)
//                .build();
//    }
//
//    @Bean
//    public Queue htRepayDxlQueue() {
//        return QueueBuilder
//                .durable(Constants.HT_REPAYMENT_PUSH_QUEUE_DXL)
//                .build();
//    }
//
//    @Bean
//    public Binding htRepayDxlBinging() {
//        return BindingBuilder
//                .bind(htRepayDxlQueue())
//                .to(htRepayDxlExchange())
//                .with(Constants.HT_REPAYMENT_PUSH_ROUTING_KEY_DXL)
//                .noargs();
//    }

//    @Bean
//    public MessageConverter messageConverter() {
//        return new Jackson2JsonMessageConverter();
//    }
}
