

package jfm.authentication.controller;

import jfm.common.response.ResponseEnum;
import jfm.common.response.ServerResponse;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @PostMapping("/token")
    public ServerResponse token(@RequestBody String token){
        if(StringUtils.equals(token,"123")){
            return ServerResponse.result(ResponseEnum.SUCCESS);
        }
        return ServerResponse.result(ResponseEnum.TOKEN_EXPIRE);
    }
}
