package com.swagger.controller;

import com.swagger.entity.Consumerrole;
import com.swagger.exception.ServiceException;
import com.swagger.mapper.ConsumerroleMapper;
import com.swagger.model.dto.CesDTO;
import com.swagger.model.vo.CesVO;
import com.swagger.utils.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletException;

@Api(tags = "测试类")
@RestController
@RequestMapping("/ces")
@Slf4j
public class SwaggerController {


    @Resource
    private ConsumerroleMapper consumerroleMapper;

    @PostMapping("/list")
    @ApiOperation("这是一个查询列表")
    public ResponseBean<CesVO> getList(@RequestBody CesDTO cesDTO){

        System.out.println(cesDTO.getId());
        Consumerrole consumerrole = consumerroleMapper.selectByPrimaryKey(1);
        System.out.println(System.currentTimeMillis());
        CesVO cesVO = new CesVO();
        cesVO.setXiao("我给我如果");
        cesVO.setDa("隔热隔热");
        cesVO.setSi(222);

        throw new ServiceException("操作失败",1,"ss");
    }

}
