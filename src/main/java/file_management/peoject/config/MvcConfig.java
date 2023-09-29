package file_management.peoject.config;


import file_management.peoject.common.Consts;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 *
 * mvc文件获取配置
 */


@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    Consts consts;

    @Bean
    ModelMapper modelMapper(){
        return new ModelMapper();
    }

    //使mvc可知晓图片保存路径
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
                                        //要注入的文件
        registry.addResourceHandler("/upload/avatar/**")
                                        //文件存放位置
                .addResourceLocations("file:///" + consts.getUploadDir() + "/avatar/");
    }

}