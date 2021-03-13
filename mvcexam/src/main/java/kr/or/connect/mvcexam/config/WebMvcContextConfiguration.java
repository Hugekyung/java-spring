package kr.or.connect.mvcexam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "kr.or.connect.mvcexam.controller" }) // basePackages는 항상 설정해줘야 한다.
public class WebMvcContextConfiguration extends WebMvcConfigurerAdapter {
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// css, img, javascript 등 url뿐 아니라 다른 파일들도 들어오기 때문에 이들에 대한 처리를 해줘야 한다.
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/META-INF/resources/webjars/").setCachePeriod(31556926); // assets에 대한 요청은 "classpath:/META-INF/resources/webjars/"에서 찾는다.
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926); // css로 들어오는 요청은 /css/에서 찾는다.
        registry.addResourceHandler("/img/**").addResourceLocations("/img/").setCachePeriod(31556926);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
    }
 
    // default servlet handler를 사용하게 합니다.
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
   
    @Override
    public void addViewControllers(final ViewControllerRegistry registry) {
    		System.out.println("addViewControllers가 호출됩니다. ");
        registry.addViewController("/").setViewName("main");
    }
    
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver(); // main에 해당하는 view를 찾는 일을 resolver가 수행한다.
        resolver.setPrefix("/WEB-INF/views/"); // setPrefix는 뷰네임 앞에 붙는다. "/WEB-INF/views/main"
        resolver.setSuffix(".jsp"); // setSuffix는 뷰네임의 뒤에 붙는다. "/WEB-INF/views/main.jsp"
        return resolver; // "/WEB-INF/views/main.jsp"에 있는 뷰를 보여줘라
    }
}
