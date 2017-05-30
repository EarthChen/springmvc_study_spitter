package spitter.test;
import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import spitter.web.HomeController;


/**
 * Created by earthchen on 17-5-30.
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception{
        HomeController controller=new HomeController();
        MockMvc mockMvc= MockMvcBuilders.standaloneSetup(controller).build(); //搭建mockmvc

        mockMvc.perform(get("/homepage"))      //对"/"执行get请求
                .andExpect(view().name("home")); //预期得到home视图

    }

}
