package fullAnnationAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @FileName:ProxyConfig.class
 * @Author:ly
 * @Date:2022/5/19
 * @Description:
 */

@Configuration
@ComponentScan(basePackages = "fullAnnationAop")
//开启aop自动代理
@EnableAspectJAutoProxy
public class ProxyConfig {
}
