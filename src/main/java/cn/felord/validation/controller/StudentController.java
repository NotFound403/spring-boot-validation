package cn.felord.validation.controller;

import cn.felord.validation.advice.Color;
import cn.felord.validation.domain.Colors;
import cn.felord.validation.domain.Student;
import cn.felord.validation.record.Rest;
import cn.felord.validation.record.RestBody;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
     *
     *
     * @param student the student
     * @return the rest
     */
    @PostMapping("/add")
    public Rest<?> addStudent(@Valid @RequestBody Student student) {
        return RestBody.okData(student);
    }


    /**
     * Batch add student rest.
     *
     * @param student the student
     * @return the rest
     */
    @PostMapping("/batchadd")
    public Rest<?> batchAddStudent(@Valid @RequestBody List<Student> student) {
        return RestBody.okData(student);
    }

    /**
     * Gets student.
     *
     * @param student the student
     * @return the student
     */
    @GetMapping("/get")
    public Rest<?> getStudent(@Valid Student student) {
        return RestBody.okData(student);
    }


    @GetMapping("/color")
    public Rest<?> color(@Valid @Color({Colors.BLUE,Colors.YELLOW}) String  color) {
        return RestBody.okData(color);
    }

}
