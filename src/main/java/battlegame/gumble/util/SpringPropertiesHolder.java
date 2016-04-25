package battlegame.gumble.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * 自定义PropertyPlaceholderConfigurer返回properties内容 用于静态持有spring的PropertyPlaceholderConfigurer, 获取properties属性文件中的内容 <br />
 * 
 * <pre>
 * 使用方法:
 * &lt;bean id="propertyConfigurer" class="com.lyl.cube.common.spring.config.CustomizedPropertyPlaceholderConfigurer">
 * <property name="location" value="classpath:dataSource.properties" />
 * &lt;/bean>
 * 
 * 在java代码中则可以如此使用:
 *  CustomizedPropertyPlaceholderConfigurer.getContextProperty("xxx");
 * </pre>
 */
public class SpringPropertiesHolder extends PropertyPlaceholderConfigurer {

    /**
     * @Fields ctxPropertiesMap : 属性存放
     */
    private static Map<String, String> ctxPropertiesMap;

    @Override
    protected void processProperties(final ConfigurableListableBeanFactory beanFactoryToProcess, final Properties props) {
        super.processProperties(beanFactoryToProcess, props);

        // load properties to ctxPropertiesMap
        ctxPropertiesMap = new HashMap<String, String>();
        for (final Object key : props.keySet()) {
            final String keyStr = key.toString();
            final String value = props.getProperty(keyStr);
            ctxPropertiesMap.put(keyStr, value);
        }
    }

    /**
     * @Title: getContextProperty
     * @Description: 根据属性名称，获取属性值
     * @param name 属性名称
     * @return 属性值
     */
    public static Object getContextProperty(final String name) {
        return ctxPropertiesMap.get(name);
    }

    /**
     * @Title: setContextProperty
     * @Description: 设置Spring从上下文中的properties文件中获取到的属性
     * @param key 属性名称
     * @param value 值
     */
    public static void setContextProperty(final String key, final String value) {
        ctxPropertiesMap.put(key, value);
    }
}
