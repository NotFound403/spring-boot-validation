package cn.felord.validation.domain;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author felord.cn
 * @since 13:18
 **/
@Data
public class Grade {
    @NotBlank(message = "名称不能为空")
    private String name;
    @Valid
    @NotNull(message = "单位学校不能空")
    private School school;
    @Min(value = 1,message = "最小值为1")
    private Integer studentCount;
    @Valid
    @NotEmpty(message = "学生不能为空")
    private List<Student> students;
}
