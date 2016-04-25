/**
 * @Title: Messages.java
 * @Package com.starmagic.core.service
 * @Description: 消息国际化使用类
 * @author linyl linyuliang.85@gmail.com
 * @version V1.0
 */
package battlegame.gumble.util;

import java.util.Locale;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.MessageSource;
import org.springframework.util.Assert;

/**
 * @ClassName: MessageService
 * @Description: 提供Spring的国际化消息输出功能，需要配置MessageSource的bean
 * @author linyl linyuliang.85@gmail.com
 */
public class MessageService implements InitializingBean {
    /**
     * @Fields messageSource : 由Spring注入的Message的Bean
     */
    private MessageSource messageSource;

    /**
     * @Fields currentLocale : 当前语言环境
     */
    private Locale currentLocale = Locale.getDefault();

    /**
     * @Title: getMessageSource
     * @Description: 获取Spring的消息源
     * @return Spring信息源
     */
    public MessageSource getMessageSource() {
        return messageSource;
    }

    /**
     * @Title: setMessageSource
     * @Description: 设置消息源
     * @param messageSource Spring注入的信息源
     */
    public void setMessageSource(final MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(messageSource, "configuration property must be not null");
    }

    /**
     * @Title: getCurrentLocale
     * @Description: 获取当前语言环境
     * @return 当前语言环境
     */
    public Locale getCurrentLocale() {
        return currentLocale;
    }

    /**
     * @Title: setCurrentLocale
     * @Description: 设置当前语言环境
     * @param locale 语言环境
     */
    public void setCurrentLocale(final Locale locale) {
        currentLocale = locale;
    }

    /**
     * @Title: getMessage
     * @Description: 格式化消息输出
     * @param code 消息编码
     * @return String 字符串
     */
    public String getMessage(final String code) {
        return messageSource.getMessage(code, null, currentLocale);
    }

    /**
     * @Title: getMessage
     * @Description: 格式化消息输出
     * @param code 消息编码
     * @param args 格式化参数：Object[] arg = new Object[] {"Erica", Calendar.getInstance().getTime()};
     * @return String 字符串
     */
    public String getMessage(final String code, final Object[] args) {
        return messageSource.getMessage(code, args, currentLocale);
    }

    /**
     * @Title: getMessageDef
     * @Description: 格式化消息输出,如果没有，则输出默认消息
     * @param code 消息编码
     * @param args 格式化参数：Object[] arg = new Object[] {"Erica", Calendar.getInstance().getTime()};
     * @param defaultMessage 默认消息
     * @return String 字符串
     */
    public String getMessageDef(final String code, final Object[] args, final String defaultMessage) {
        return messageSource.getMessage(code, args, defaultMessage, currentLocale);
    }
}
