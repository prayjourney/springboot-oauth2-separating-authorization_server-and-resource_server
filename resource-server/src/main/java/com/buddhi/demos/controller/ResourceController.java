package com.buddhi.demos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: pray-journey.io
 * @description:
 * @date: created in 2022/3/6
 * @modified:
 */
@RestController
public class ResourceController {
    @GetMapping("/account")
    public String getAccount() {
        return "account 1";
    }

}
