package com.huboot.business.base_model.weixin_service.dto.business_manage_web;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Administrator on 2018/8/7 0007.
 */
@Data
public class WeixinUserStatisticDTO {

    @ApiModelProperty("日期")
    private String date;

    @ApiModelProperty("新增的用户数量")
    private Integer newUser;

    @ApiModelProperty("取消关注的用户数量")
    private Integer cancelUser;

    @ApiModelProperty("净增用户数量=new_user减去cancel_user")
    private Integer addUser;

    @ApiModelProperty("总用户量")
    private Integer cumulateUser;

}
