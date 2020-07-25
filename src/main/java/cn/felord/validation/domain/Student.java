package cn.felord.validation.domain;

import cn.felord.validation.advice.Age;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author felord.cn
 * @since 13:17
 **/
@Data
public class Student {

    @NotBlank(message = "姓名必须填")
    private String name;
    //    @NotNull(message = "年龄必须填写")
//    @Range(min = 1,max =50, message = "取值范围1-50")
    @Age
    private Integer age;
    @NotEmpty(message = "成绩必填")
    private List<Double> scores;
    @Valid
    @NotNull(message = "学校不能为空")
    private School school;
}
