package com.example.hibernate;

import com.example.hibernate.pojo.User;
import com.example.hibernate.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootHibernateApplication.class)
public class JpaTest {

    @Autowired
    private UserRepository userRepository;

    @Test()
    public void t(){
        List<User> list = userRepository.findAll();
        System.out.println(list);

    }
}
