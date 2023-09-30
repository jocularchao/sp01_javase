/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 21:30
 * @Description
 */
open module module.a {
     exports com.test to module.b;

     uses com.test.Test;
}