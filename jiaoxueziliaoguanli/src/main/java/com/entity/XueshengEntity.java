package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 学生
 *
 * @author 
 * @email
 */
@TableName("xuesheng")
public class XueshengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengEntity() {

	}

	public XueshengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 老师
     */
    @TableField(value = "laoshi_id")

    private Integer laoshiId;


    /**
     * 班级
     */
    @TableField(value = "banji_id")

    private Integer banjiId;


    /**
     * 学生姓名
     */
    @TableField(value = "xuesheng_name")

    private String xueshengName;


    /**
     * 学生手机号
     */
    @TableField(value = "xuesheng_phone")

    private String xueshengPhone;


    /**
     * 学生身份证号
     */
    @TableField(value = "xuesheng_id_number")

    private String xueshengIdNumber;


    /**
     * 学生头像
     */
    @TableField(value = "xuesheng_photo")

    private String xueshengPhoto;


    /**
     * 电子邮箱
     */
    @TableField(value = "xuesheng_email")

    private String xueshengEmail;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 备注
     */
    @TableField(value = "xuesheng_content")

    private String xueshengContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：老师
	 */
    public Integer getLaoshiId() {
        return laoshiId;
    }


    /**
	 * 获取：老师
	 */

    public void setLaoshiId(Integer laoshiId) {
        this.laoshiId = laoshiId;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiId() {
        return banjiId;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiId(Integer banjiId) {
        this.banjiId = banjiId;
    }
    /**
	 * 设置：学生姓名
	 */
    public String getXueshengName() {
        return xueshengName;
    }


    /**
	 * 获取：学生姓名
	 */

    public void setXueshengName(String xueshengName) {
        this.xueshengName = xueshengName;
    }
    /**
	 * 设置：学生手机号
	 */
    public String getXueshengPhone() {
        return xueshengPhone;
    }


    /**
	 * 获取：学生手机号
	 */

    public void setXueshengPhone(String xueshengPhone) {
        this.xueshengPhone = xueshengPhone;
    }
    /**
	 * 设置：学生身份证号
	 */
    public String getXueshengIdNumber() {
        return xueshengIdNumber;
    }


    /**
	 * 获取：学生身份证号
	 */

    public void setXueshengIdNumber(String xueshengIdNumber) {
        this.xueshengIdNumber = xueshengIdNumber;
    }
    /**
	 * 设置：学生头像
	 */
    public String getXueshengPhoto() {
        return xueshengPhoto;
    }


    /**
	 * 获取：学生头像
	 */

    public void setXueshengPhoto(String xueshengPhoto) {
        this.xueshengPhoto = xueshengPhoto;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getXueshengEmail() {
        return xueshengEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setXueshengEmail(String xueshengEmail) {
        this.xueshengEmail = xueshengEmail;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getXueshengContent() {
        return xueshengContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXueshengContent(String xueshengContent) {
        this.xueshengContent = xueshengContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xuesheng{" +
            "id=" + id +
            ", laoshiId=" + laoshiId +
            ", banjiId=" + banjiId +
            ", xueshengName=" + xueshengName +
            ", xueshengPhone=" + xueshengPhone +
            ", xueshengIdNumber=" + xueshengIdNumber +
            ", xueshengPhoto=" + xueshengPhoto +
            ", xueshengEmail=" + xueshengEmail +
            ", sexTypes=" + sexTypes +
            ", xueshengContent=" + xueshengContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
