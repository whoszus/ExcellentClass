1.hello.今天开始写后台项目
2.项目的原始架构是@author phn
--20151027


[10.29]
    1.hibernate  org.hibernate.AnnotationException: No identifier specified for entity
            -- entity 添加 @Id注解

    2.org.hibernate.HibernateException: No Session found for current thread
            a.  <aop:pointcut id="transactionPointcut" expression="execution(* com.*.service..*Impl.*(..))" />
            事务路径不正确;没有扫描到..
            b. Spring切入点表达式常用写法;
            c.stackoverflow: 可能是声明事务的service method 已 protected修饰; 权限问题?
                I'll just add something that took me some time to debug : don't forget that a @Transactional annotation will only work on "public" methods.
                I put some @Transactional on "protected" ones and got this error.
            d.stackoverflow:
                <tx:annotation-driven/>
                <bean id="transactionManager"
                 class="org.springframework.orm.hibernate4.HibernateTransactionManager">
                <property name="sessionFactory" ref="sessionFactory"></property>
                </bean>


    3. Table 'enrollbackend.classcatcher' doesn't exist
        a. hibernate 配置了自动创建表 ,但是没有创建成功;   <prop key="hibernate.hbm2ddl.auto">update</prop>
        b. 原因可能为?


    4.The database returned no natively generated identity value
        a.@GeneratedValue(strategy = GenerationType.IDENTITY) 本地生成策略
    

