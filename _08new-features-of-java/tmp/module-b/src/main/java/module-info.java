/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 17:53
 * @Description
 */
module module.b {
     requires module.a;

    //声明接口的实现
     provides com.test.Test with com.study.TestImpl;
}