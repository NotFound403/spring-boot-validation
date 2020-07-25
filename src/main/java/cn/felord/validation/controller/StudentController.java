package cn.felord.validation.controller;

import cn.felord.validation.advice.Color;
import cn.felord.validation.domain.Student;
import cn.felord.validation.record.Rest;
import cn.felord.validation.record.RestBody;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;

/**
 * The type Student controller.
 *
 * @author a
 * @since 13 :50
 */
@Validated
@RestController
@RequestMapping("/student")
public class StudentController {


    /**
     * 测试POST.
     *
     * @param student the student
     * @return the rest
     */
    @PostMapping("/add")
    public Rest<?> addStudent(@Valid @RequestBody Student student) {
        return RestBody.okData(student);
    }


    /**
     * 集合类型参数中的元素校验 需要在方法所在的类上添加 {@link Validated}注解.
     *
     * @param student the student
     * @return the rest
     */
    @PostMapping("/batchadd")
    public Rest<?> batchAddStudent(@Valid @NotEmpty(message = "集合入参不能为空") @RequestBody List<Student> student) {
        return RestBody.okData(student);
    }

    /**
     * 测试GET请求验证.
     *
     * @param student the student
     * @return the student
     */
    @GetMapping("/get")
    public Rest<?> getStudent(@Valid Student student) {
        return RestBody.okData(student);
    }


    /**
     * 测试自定义约束注解{@link Color}.
     * <p>
     * 这里使用了包装类，不使用包装类的话参考 {@link GradeController#color(String)}使用{@link Validated}
     *
     * @param param the param
     * @return the rest
     */
    @GetMapping("/color")
    public Rest<?> color(@Valid String param) {
        return RestBody.okData(param);
    }

}
