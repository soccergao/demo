package com.example.demo.config;//package com.qhsl.loan.partner.config;
//
//import com.qhsl.loan.partner.controller.PartnerController;
//import com.qhsl.loan.partner.controller.PartnerWebController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
//import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
//import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
//import static org.springframework.web.reactive.function.server.RouterFunctions.route;
//
//@Configuration
//public class RouterConfig {
//
//    public static final String PARTNER_CODE = "partnerCode";
//
//    @Autowired
//    PartnerWebController partnerWebController;
//
//    @Autowired
//    PartnerController partnerController;
//
//    @Bean
//    public RouterFunction<ServerResponse> router() {
//        return route(POST(String.format("/web/{%s}/acceptance", PARTNER_CODE)), partnerWebController::acceptance)
//                .andRoute(GET(String.format("/partner_connect_info/{%s}", PARTNER_CODE)), partnerController::findByPartnerCode);
//    }
//
//}
