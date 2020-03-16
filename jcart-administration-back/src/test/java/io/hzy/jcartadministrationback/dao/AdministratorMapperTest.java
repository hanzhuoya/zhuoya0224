package io.hzy.jcartadministrationback.dao;

import io.hzy.jcartadministrationback.po.Administrator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AdministratorMapperTest {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Test
    void selectByUsername() {
        String username = "admin";
        Administrator administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);
        username = "admin110";
        administrator = administratorMapper.selectByUsername(username);
        assertNull(administrator);
    }
}