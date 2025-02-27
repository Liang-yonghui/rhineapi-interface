package com.liangyonghui.rhineapiinterface.controller;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.server.HttpServerRequest;
import com.liangyonghui.rhineapiclientsdk.model.User;
import com.liangyonghui.rhineapiclientsdk.utils.SignUtils;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import static com.liangyonghui.rhineapiinterface.utils.RequestUtils.buildUrl;
import static com.liangyonghui.rhineapiinterface.utils.RequestUtils.get;

/**
 * 名称 API
 *
 * @author yupi
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/")
    public String getNameByGet(String name, HttpServletRequest request) {
        return "GET 你的名字是" + name;
    }

    @PostMapping("/getNameByPost")
    public String getNameByPost(@RequestParam String name, HttpServletRequest request) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody User user, HttpServletRequest request) {
        // 从请求头中获取参数
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//
//        // todo 实际情况应该是去数据库中查是否已分配给用户
//        if (!accessKey.equals("rhine")){
//            throw new RuntimeException("无权限");
//        }
//        // 校验随机数，模拟一下，直接判断nonce是否大于10000
//        if (Long.parseLong(nonce) > 10000) {
//            throw new RuntimeException("无权限");
//        }
//
//        // todo 时间和当前时间不能超过5分钟
////        if (timestamp) {}
//        String serverSign = SignUtils.genSign(body, "abcdefgh");
//
//        if (!sign.equals(serverSign)){
//            throw new RuntimeException("无权限");
//        }
        String result = "POST 用户名字是" + user.getUsername();
        return result;
    }

    /**
     *
     * @return
     */
    public String getPoisonousChickenSoup(){
        return get("https://api.btstu.cn/yan/api.php?charset=utf-8&encode=json");
    }
}