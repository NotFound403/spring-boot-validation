package cn.felord.validation.domain;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author a
 * @since 13:19
 **/
@Data
public class School {
    @NotBlank(message = "学校名称不能为空")
    private String name;
    @Min(value = 0,message ="校龄大于0" )
    private Integer age;
}
