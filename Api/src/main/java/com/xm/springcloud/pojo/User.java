package com.xm.springcloud.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author xm
 * @since 2018-07-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 账号
     */
    @TableField("userName")
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 昵称
     */
    @TableField("nickName")
    private String nickName;
    /**
     * 性别：0：男，1：女
     */
    private Boolean sex;
    /**
     * 生日
     */
    private Date birth;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
