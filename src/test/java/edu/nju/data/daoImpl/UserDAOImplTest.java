package edu.nju.data.daoImpl;

import edu.nju.RuanHuApplication;
import edu.nju.data.dao.UserDAO;
import edu.nju.data.util.VerifyResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by ss14 on 2016/7/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RuanHuApplication.class)
@WebAppConfiguration
public class UserDAOImplTest {

    @Autowired
    UserDAO userDAO;

    @Test
    public void exists() throws Exception {
        String username = "ch";
        if(!userDAO.exists(username)){
            fail("exists()--------");
        }

    }

    @Test
    public void verify() throws Exception {

        String name = "ch";
        String pw = "123456";
        if(!userDAO.verify(name,pw)){
            fail("verify()-------");
        }else{
            System.out.println("name : "+name);
            System.out.println("pw : "+pw);
        }

    }

    @Test
    public void login() throws Exception {
        String name = "ch";
        String pw = "123456";
        String name1 = "ch1";
        String pw1 = "1234567";
        VerifyResult success = userDAO.login(name,pw);
        VerifyResult inexist =userDAO.login(name1,pw);
        VerifyResult incorrect = userDAO.login(name,pw1);
        if(success!=VerifyResult.SUCCESS  ||
                inexist !=VerifyResult.INEXISTENCE  ||
                   incorrect !=VerifyResult.INCORRECT){
            fail("login()-----------");
        }


    }

    @Test
    public void getUserByName() throws Exception {

    }

}