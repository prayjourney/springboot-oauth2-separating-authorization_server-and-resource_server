package com.buddhi.demos.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.RemoteTokenServices;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: pray-journey.io
 * @description:
 * @date: created in 2022/3/6
 * @modified:
 */
public class ResourceController {
    @GetMapping("/account")
    public String getAccount() {
        return "account 1";
    }

}
