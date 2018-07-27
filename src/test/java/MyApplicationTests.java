import com.MyApplication;
import com.alibaba.fastjson.JSON;
import com.mapper.test.ext.MyUsersMapperExt;
import com.model.test.ext.MyUsersExt;
import com.model.test.ext.ObjJsonData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MyApplicationTests {
    @Autowired
    private MyUsersMapperExt myMappper;

    @Test
    public void contextLoads() {
        MyUsersExt myUsersExt = myMappper.selectJson();
        System.out.println("myUsersExt = " + JSON.toJSONString(myUsersExt));
        List<String> otherList = myUsersExt.getStrArrList();
        System.out.println("otherList = " + JSON.toJSONString(otherList));

        ObjJsonData myInfo = myUsersExt.getObjJsonData();
        System.out.println("myInfo = " + JSON.toJSONString(myInfo));

        List<Map<String, Object>> moreList = myUsersExt.getObjArrList();
        System.out.println("moreList = " + JSON.toJSONString(moreList));
    }

}
