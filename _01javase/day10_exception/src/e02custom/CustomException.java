package e02custom;

/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/18 18:10
 * @Description 自定义异常
 */
public class CustomException extends Exception{
    public CustomException(String message) {
        super(message); //这里我们选择使用父类的带参构造，这个参数就是异常的原因
    }
}
