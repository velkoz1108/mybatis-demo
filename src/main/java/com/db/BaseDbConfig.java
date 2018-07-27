package com.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @Author Cavill
 * @Team Atplan
 * @Date 2018/5/7
 */
@Configuration
@MapperScan(basePackages = BaseDbConfig.PACKAGE, sqlSessionFactoryRef = "baseSqlSessionFactory")
public class BaseDbConfig {
    static final String PACKAGE = "com.mapper.test";

    static final String MAPPER_LOCATION = "classpath:/mybatis/test/**/*.xml";

    @Value("${test.datasource.url}")
    private String url;

    @Value("${test.datasource.username}")
    private String username;

    @Value("${test.datasource.password}")
    private String password;

    @Value("${test.datasource.driverClassName}")
    private String driverClassName;


    @Value("${spring.datasource.initialSize}")
    private int initialSize;

    @Value("${spring.datasource.initialSize}")
    private int minIdle;

    @Value("${spring.datasource.initialSize}")
    private int maxActive;
    @Value("${spring.datasource.maxWait}")
    private int maxWait;
    @Value("${spring.datasource.timeBetweenEvictionRunsMillis}")
    private long timeBetweenEvictionRunsMillis;
    @Value("${spring.datasource.minEvictableIdleTimeMillis}")
    private long minEvictableIdleTimeMillis;
    @Value("${spring.datasource.validationQuery}")
    private String validationQuery;
    @Value("${spring.datasource.testWhileIdle}")
    private boolean testWhileIdle;
    @Value("${spring.datasource.testOnBorrow}")
    private boolean testOnBorrow;
    @Value("${spring.datasource.testOnReturn}")
    private boolean testOnReturn;
    @Value("${spring.datasource.poolPreparedStatements}")
    private boolean poolPreparedStatements;
    @Value("${spring.datasource.maxPoolPreparedStatementPerConnectionSize}")
    private int maxPoolPreparedStatementPerConnectionSize;
    @Value("${spring.datasource.filters}")
    private String filters;
    @Value("${spring.datasource.connectionProperties}")
    private String connectionProperties;

    @Bean(name = "baseDataSource")
    public DataSource masterDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setDriverClassName(driverClassName);
        //具体配置
        dataSource.setInitialSize(initialSize);
        dataSource.setMinIdle(minIdle);
        dataSource.setMaxActive(maxActive);
        dataSource.setMaxWait(maxWait);
        dataSource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        dataSource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        dataSource.setValidationQuery(validationQuery);
        dataSource.setTestWhileIdle(testWhileIdle);
        dataSource.setTestOnBorrow(testOnBorrow);
        dataSource.setTestOnReturn(testOnReturn);
        dataSource.setPoolPreparedStatements(poolPreparedStatements);
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(maxPoolPreparedStatementPerConnectionSize);
        try {
            dataSource.setFilters(filters);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dataSource.setConnectionProperties(connectionProperties);
        return dataSource;
    }

    @Bean(name = "baseSqlSessionFactory")
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("baseDataSource") DataSource baseDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(baseDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(BaseDbConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
