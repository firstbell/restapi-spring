package com.jonny.restapi.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class BoardVO {
    private Integer id;
    private String title;
    private String content;
    private String created;
    private String updated;
}
