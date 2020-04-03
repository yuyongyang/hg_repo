package com.hg.systemGd.issm.controller;

import com.hg.systemGd.issm.controller.ApiParam.WeChatApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;

@RestController
@RequestMapping(value = "/weChat")
public class WeChatLogin {
//后期接入api管理swaggerUi
private static  final String token="hangaokeji20200401";

    @RequestMapping(value = "/weChatLogin")
    public String Login(WeChatApiParam weChatApiParam){
       return CheckSignature(weChatApiParam);
    }


  
    /**
     * 微信所带参数解密
     */
    public  String CheckSignature(WeChatApiParam weChatApiParam){
        String signature=weChatApiParam.getSignature();
        String timestamp=weChatApiParam.getTimestamp();
        String nonce=weChatApiParam.getNonce();
        String echostr=weChatApiParam.getEchostr();
        //第一步中填写的token一致
        ArrayList<String> list=new ArrayList<String>();
        list.add(nonce);
        list.add(timestamp);
        list.add(token);

        //字典序排序
        Collections.sort(list);
        //SHA1加密
        String checksignature= SHA1(list.get(0)+list.get(1)+list.get(2));
        System.out.println(signature);
        System.out.println(checksignature);

        if(checksignature.equals(signature)){
            return echostr;
        }
        return null;
    }

    /**
     * sha1加密
     * @param str
     * @return
     */
    private  String SHA1(String str){
        if(str == null || str.length()==0){
            return null;
        }
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};

        try {
            MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
            mdTemp.update(str.getBytes("UTF-8"));

            byte[] md = mdTemp.digest();
            int j = md.length;
            char buf[] = new char[j*2];
            int k = 0;
            for(int i=0;i<j;i++){
                byte byte0 = md[i];
                buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
                buf[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(buf);
        } catch (Exception e) {
            return null;
        }
    }



}
