package com.swagger.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@ApiModel("查询入参类")
@Data
public class CesDTO {

        @ApiModelProperty(value = "用户id",name = "id",example = "1",required = true)
        private String id;

        private String name;

        private Integer age;
}
