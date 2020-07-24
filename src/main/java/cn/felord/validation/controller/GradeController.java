package cn.felord.validation.controller;

import cn.felord.validation.domain.Grade;
import cn.felord.validation.record.Rest;
import cn.felord.validation.record.RestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author a
 * @since 14:31
 **/
@RestController
@RequestMapping("/grade")
public class GradeController {

    @PostMapping("/add")
    public Rest<?> addGrade(@Valid @RequestBody Grade grade) {
        return RestBody.okData(grade);
    }
}

