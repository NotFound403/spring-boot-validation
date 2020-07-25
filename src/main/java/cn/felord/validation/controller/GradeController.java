package cn.felord.validation.controller;

import cn.felord.validation.advice.Color;
import cn.felord.validation.domain.Colors;
import cn.felord.validation.domain.Grade;
import cn.felord.validation.record.Rest;
import cn.felord.validation.record.RestBody;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * The type Grade controller.
 *
 * @author a
 * @since 14 :31
 */
//@Validated
@RestController
@RequestMapping("/grade")
public class GradeController {

    /**
     * 字符串类型参数.
     *
     * @param color the color
     * @return the rest
     */
    @Validated
    @GetMapping("/color")
    public Rest<?> color(@Valid @Color({Colors.BLUE, Colors.YELLOW}) String color) {
        return RestBody.okData(color);
    }


    /**
     * 路径变量 .
     *
     * @param color the color
     * @return the rest
     */
    @GetMapping("/rest/{color}")
    public Rest<?> rest(@Valid @Color({Colors.BLUE, Colors.YELLOW}) @PathVariable String color) {
        return RestBody.okData(color);
    }

    @PostMapping("/add")
    public Rest<?> add(@Valid @RequestBody Grade grade) {
        return RestBody.okData(grade);
    }


}

