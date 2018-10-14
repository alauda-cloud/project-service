package io.alauda.project.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Card implements Serializable {

    private Long id;

    private Long projectId;

    private String title;
}
