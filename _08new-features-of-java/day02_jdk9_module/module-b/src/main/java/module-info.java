/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 21:30
 * @Description
 */
module module.b {
    requires module.a;

    provides com.test.Test with com.study.TestImpl;
}