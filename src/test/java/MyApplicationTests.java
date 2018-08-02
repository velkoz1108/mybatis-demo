import com.MyApplication;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.mapper.test.ext.MyAnnotationMapper;
import com.mapper.test.ext.MyUsersMapperExt;
import com.model.test.MyUsers;
import com.model.test.ext.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

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

        List<ObjJsonData> moreList = myUsersExt.getObjArrList();
        System.out.println("moreList = " + JSON.toJSONString(moreList));
    }


    @Test
    public void testEnum() {
        List<MyUserStatus> userStatus = myMappper.selectEnum();
        System.out.println("userStatus = " + JSON.toJSONString(userStatus));
    }

    @Test
    public void testEnum2() {
        List<MyUserStatus> userStatus = myMappper.selectEnum2();
        System.out.println("userStatus = " + JSON.toJSONString(userStatus));
        System.out.println(userStatus.get(0).getEnumStatus().toString());
    }

    @Test
    public void testEnum3() {
        List<MyCity> userStatus = myMappper.selectEnum3();
        SerializeConfig config = new SerializeConfig();
        config.configEnumAsJavaBean(EnumCity.class);
        System.out.println("userStatus = " + JSON.toJSONString(userStatus, config));
    }

    @Autowired
    MyAnnotationMapper myAnnotationMapper;

    @Test
    public void testAnnotation() {
        MyUsers byId = myAnnotationMapper.getById();
        System.out.println("byId = " + JSON.toJSONString(byId));
    }
}
