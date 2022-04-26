package com.swagger.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
@ApiModel("这是一个返回实体类")
@Data
public class CesVO {

    @ApiModelProperty(value = "小白",name = "xiao",example = "随便穿")
    private String xiao;
    @ApiModelProperty(value = "大白",name = "da",example = "随便穿11")
    private String da;
    @ApiModelProperty(value = "中白")
    private int si;
}
