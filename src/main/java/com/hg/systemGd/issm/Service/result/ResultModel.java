package com.hg.systemGd.issm.Service.result;

import lombok.Data;

@Data
public class ResultModel<T> {
    private String code;
    private  T data;
    private String httpStatus;
}
