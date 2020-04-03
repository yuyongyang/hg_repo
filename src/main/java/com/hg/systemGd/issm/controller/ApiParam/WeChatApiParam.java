package com.hg.systemGd.issm.controller.ApiParam;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class WeChatApiParam {
    private String signature;
    private String   echostr;
    private String  timestamp;
    private String   nonce;
}
