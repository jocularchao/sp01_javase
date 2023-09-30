/**
 * Create with IntelliJ IDEA.
 *
 * @author JocularChao
 * @date 2023/9/30 17:52
 * @Description
 */
open module module.a {
     exports com.test to module.b;

     //transitive 传递给依赖本模块的模块
     requires transitive java.logging;

     //opens com.test;
     uses com.test.Test;
}