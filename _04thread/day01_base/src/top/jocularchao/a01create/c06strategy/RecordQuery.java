package top.jocularchao.a01create.c06strategy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Create with IntelliJ IDEA.
 *
 * @author: JocularChao
 * @E-mail: jocularchao@163.com
 * @Date: 2023/6/4 10:33
 * @description: 可以用query方法应对任何数据库的查询，
 * 返回结果的不同只会因为你传入RowHandler的不同而不同，
 * 同样RecordQuery只负责数据的获取，而RowHandler则负责数据的加工，职责分明，每个类均功能单一
 *
 *
 * Thread类的run方法是不能共享的，
 * 也就是说A线程不能把B线程的run方法当作自己的执行单元，
 * 而使用Runnable接口则很容易就能实现这一点，
 * 使用同一个Runnable的实例构造不同的Thread实例
 */
public class RecordQuery {
    private final Connection connection;

    public RecordQuery(Connection connection) {
        this.connection = connection;
    }

    public <T> T query(RowHandler<T> handler,String sql,Object ...params){
        try(PreparedStatement stmt = connection.prepareStatement(sql);) {
            int index = 1;
            for (Object param:params){
                stmt.setObject(index++, param);
            }

            ResultSet resultSet = stmt.executeQuery();
            return handler.handle(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
