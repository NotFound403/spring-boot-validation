package cn.felord.validation.domain;

import cn.felord.validation.advice.Color;
import lombok.Data;

@Data
public class Param {
    @Color({Colors.BLUE,Colors.YELLOW})
   private String color;
}
