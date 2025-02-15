package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ConfigurationClassUtils;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        // 컴포넌트 스캔에서 뺄거를 필터링 (기존 예제 코드를 유지하기 위해, (실제론 안해도 됨))
        excludeFilters = @ComponentScan.Filter (type = FilterType.ANNOTATION, classes = {Configuration.class})
)
public class AutoAppConfig {


}
