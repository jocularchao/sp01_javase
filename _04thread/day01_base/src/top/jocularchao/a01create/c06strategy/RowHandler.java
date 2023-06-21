package top.jocularchao.a01create.c06strategy;

import java.sql.ResultSet;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 9:51
 * @description:
 */
public interface RowHandler<T> {
    T handle(ResultSet resultSet);
}
