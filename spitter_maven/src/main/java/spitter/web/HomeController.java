package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by earthchen on 17-5-30.
 */
@Controller  //声明为一个控制器
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET) //处理对get的请求
    public String home() {
        return "home";      //视图名为home
    }
}
