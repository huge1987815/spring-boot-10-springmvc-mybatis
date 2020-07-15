package com.huge.springboot;

        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "com.huge.springboot")//扫描注解元素
@MapperScan(value={"com.huge.springboot.dao"})//扫描dao注解元素
@EnableTransactionManagement//启动事务管理
public class SpringBoot10SpringmvcMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot10SpringmvcMybatisApplication.class, args);
    }

}
