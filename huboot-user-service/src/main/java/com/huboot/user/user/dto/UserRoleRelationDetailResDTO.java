package com.huboot.user.user.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *用户服务-用户角色关系表
 */
@Data
public class UserRoleRelationDetailResDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@ApiModelProperty("唯一标识")
	private Long id ;
	@ApiModelProperty("创建时间")
	private LocalDateTime createTime ;
	@ApiModelProperty("更新时间")
	private LocalDateTime modifyTime ;
	@ApiModelProperty("用户ID")
	private Long userId ;
	@ApiModelProperty("角色ID")
	private Long roleId ;

}

