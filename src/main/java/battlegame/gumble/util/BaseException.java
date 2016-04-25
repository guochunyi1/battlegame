package battlegame.gumble.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: BaseException
 * @Description: cube自定义基础检查性异常
 * @author linyl linyuliang.85@gmail.com
 */
public class BaseException extends Exception {

    /**
     * @Fields serialVersionUID : 默认序列化版本id
     */

    private static final long serialVersionUID = 1L;
    /**
     * @Fields LOGGER : 日志操作类
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseException.class);

    /**
     * @Fields errorCode : 错误码
     */
    private final String errorCode;

    private final String message;

    /**
     * @Fields args : 错误信息参数
     */
    private Object[] args;

    /**
     * <p>
     * Title: 构造函数
     * </p>
     * <p>
     * Description: 只有异常码，没有消息参数
     * </p>
     * @param errorCode 错误码
     */
    public BaseException(final int errorCode) {
        super();
        this.errorCode = String.valueOf(errorCode);
        this.message = SpringContextHolder.getBeanByType(MessageService.class).getMessage(this.errorCode);
        LOGGER.error("系统内部自定义异常，错误码[{}]消息[{}]", errorCode, this.message);
    }

    /**
     * @param errorCode 错误码
     * @param args @see {@link java.text.MessageFormat#format(Object)}
     */
    public BaseException(final int errorCode, final Object[] args) {
        super();
        this.errorCode = String.valueOf(errorCode);
        this.args = args.clone();
        this.message = SpringContextHolder.getBeanByType(MessageService.class).getMessageDef(this.errorCode, args, "");
        LOGGER.error("系统内部自定义异常，错误码[{}]消息[{}]", errorCode, this.message);
    }

    /**
     * @param errorCode 错误码
     * @param cause 源异常
     */
    public BaseException(final int errorCode, final Throwable cause) {
        super(cause);
        this.errorCode = String.valueOf(errorCode);
        this.message = SpringContextHolder.getBeanByType(MessageService.class).getMessage(this.errorCode);
        LOGGER.error("系统内部异常，错误码[{}]原异常信息[{}]", new Object[] { errorCode, cause.getMessage() });
    }

    /**
     * @param errorCode 错误码
     * @param cause 源异常
     * @param args @see {@link java.text.MessageFormat#format(Object)}
     */
    public BaseException(final int errorCode, final Throwable cause, final Object[] args) {
        super(cause);
        this.errorCode = String.valueOf(errorCode);
        this.args = args.clone();
        this.message = SpringContextHolder.getBeanByType(MessageService.class).getMessageDef(this.errorCode, args, "");
        LOGGER.error("系统内部异常，错误码[{}]消息[{}]原异常信息[{}]", new Object[] { errorCode, this.message, cause.getMessage(), });
    }

    public BaseException(final String message) {
        super();
        this.errorCode = "";
        this.message = message;
        LOGGER.error("系统内部异常，消息[{}]", this.message);
    }

    public BaseException(final String message, final Throwable cause) {
        super(cause);
        this.errorCode = "";
        this.message = message;
        LOGGER.error("系统内部异常，消息[{}]", this.message);
    }

    public BaseException(final Throwable cause) {
        super(cause);
        this.errorCode = "";
        if (super.getMessage() != null) {
            message = super.getMessage();
        } else if (cause != null) {
            message = cause.toString();
        } else {
            message = "";
        }
        LOGGER.error("系统内部异常，消息[{}]", this.message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * @return the errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * @return the args
     */
    public Object[] getArgs() {
        return args.clone();
    }
}
