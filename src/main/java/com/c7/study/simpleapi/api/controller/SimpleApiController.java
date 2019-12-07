package com.c7.study.simpleapi.api.controller;

import com.c7.study.simpleapi.model.VariableRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleApiController {

    @PostMapping(value = "/data", consumes= {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public VariableRequest post(@RequestBody VariableRequest request) {
        return request;
    }
}
