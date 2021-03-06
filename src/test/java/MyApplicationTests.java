import com.MyApplication;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mapper.test.EmpMapper;
import com.mapper.test.ViewUsersMapper;
import com.mapper.test.ext.MyAnnotationMapper;
import com.mapper.test.ext.MyUsersMapperExt;
import com.model.test.Emp;
import com.model.test.MyUsers;
import com.model.test.UserStatus;
import com.model.test.ViewUsers;
import com.model.test.ext.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    public void testForEach() {
        List<UserStatus> statusList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            UserStatus a = new UserStatus();
            a.setStatus(i);
            a.setEnStatus("AAA" + i);
            a.setUserId(i);
            a.setCityCode(i);
            statusList.add(a);
        }

        int size = myMappper.insertUserStatus(statusList);
        for (UserStatus userStatus : statusList) {
            System.out.println("userStatus = " + userStatus.getId());
        }
    }

    @Test
    public void test() {
        Byte[] c = new Byte[]{1, 2};
        System.out.println(c);
        byte[] d = {0x1, 3};
        System.out.println(d);
        int[] a = {1, 3, 4};
        System.out.println(a);
        long[] e = {1l, 3l};
        System.out.println(e);
        double[] f = {1d, 3d};
        System.out.println(f);
        String[] g = {"aa", "bb"};
        System.out.println(g);
        float[] aaa = {3f, 5f};
        System.out.println(aaa);
    }

    @Autowired
    private ViewUsersMapper viewUsersMapper;

    @Test
    public void testView() {
        List<ViewUsers> viewUsers = viewUsersMapper.selectByExample(null);
        for (ViewUsers viewUser : viewUsers) {
            System.out.println("viewUser = " + viewUser.getUsername());
        }
        ViewUsers aa = new ViewUsers();
        aa.setUserId(100L);
        aa.setUsername("aAA");

        int insert = viewUsersMapper.insert(aa);
        System.out.println("insert = " + insert);
    }

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testInsert() {
        for (int i = 10; i < 100; i++) {
            Emp emp = new Emp();
            emp.setId(i);
            emp.setName("emp-" + i);
            emp.setDate(new Date());
            emp.setSingin((byte) 0);
            empMapper.insert(emp);
        }
    }

    @Test
    public void testPage() {
        PageHelper.startPage(3, 15);
        List<Emp> emps = empMapper.selectByExample(null);
        System.out.println(emps.size());

        PageInfo page = new PageInfo(emps);
        System.out.println("getPageNum "+page.getPageNum());
        System.out.println("getPageSize "+page.getPageSize());
        System.out.println("getTotal "+page.getTotal());
        System.out.println("getPages "+page.getPages());
        emps.forEach(emp -> System.out.println(emp.getId()));

        List<Emp> emps2 = empMapper.selectByExample(null);
        System.out.println(emps2.size());
    }
}
