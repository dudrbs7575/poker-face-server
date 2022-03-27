package com.fourtrashes.pokerface.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

// docs 참고 ::  https://docs.swagger.io/swagger-core/current/apidocs/

@Api(tags = {"1.0 스웨거 테스트"})
@RestController
@RequestMapping("/example")
public class SwaggerExampleController {

    @PostMapping(path = "/getZero")
    @ApiOperation(value = "0 조회", notes = "스웨거 Example 을 위한 API 0을 리턴한다.")
        //각 API별 기능을 명세한다. tags를 이용하면 각기 다른 컨트롤러에 있으나 논리적으로 연결되는 api를 그룹핑 할 수 있다.
    Integer swaggerExample(@RequestBody ExampleDTO req) {
        return 0;
    }

    @PostMapping(path = "/getZero2")
    @ApiOperation(value = "0 조회", notes = "스웨거 Example 을 위한 API 0을 리턴한다.")
    Integer swaggerExample2(@ModelAttribute ExampleDTO req) {
        return 0;
    }


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ApiModel(value = "ExampleDTO", description = "0을 조회하기 위한 DTO")
    static class ExampleDTO {
        @ApiModelProperty(value = "각 property 대한 description :: 숫자임")
        Integer i;

        @ApiModelProperty(value = "각 property 대한 description", required = true)
        String value;
    }
}
