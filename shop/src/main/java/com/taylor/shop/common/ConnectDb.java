package com.taylor.shop.common;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

/**
 * @notes:数据库连接通用类
 * @author fei
 *
 *         2014-4-3 下午5:48:13
 */
public class ConnectDb {

  private static final Logger LOG = Logger.getLogger(ConnectDb.class);

  private static SqlSessionFactory sqlSessionFactory4Reader;

  private static SqlSessionFactory sqlSessionFactory4Write;

  private static ConnectDb connectDb = null;

  public static ConnectDb getInstance() {
    if (connectDb == null) {
      connectDb = new ConnectDb();
    }
    return connectDb;
  }

  private ConnectDb() {
    try {
      Reader reader1 = Resources.getResourceAsReader("config/sqlConfig.xml");
      sqlSessionFactory4Reader = new SqlSessionFactoryBuilder().build(reader1, "visaReader");
      reader1.close();

      Reader reader2 = Resources.getResourceAsReader("config/sqlConfig.xml");
      sqlSessionFactory4Write = new SqlSessionFactoryBuilder().build(reader2, "visaWrite");
      reader2.close();
    } catch (IOException e) {
      LOG.error("error", e);
    }
  }

  /**
   * @notes:获取读操作SqlSession对象
   * @author fei 2014-4-3 下午5:55:00
   */
  public SqlSession getReaderSqlSession() {
    return sqlSessionFactory4Reader.openSession();
  }

  /**
   * @notes:获取写操作SqlSession对象
   *
   * @author fei 2015-8-11 下午6:29:05
   */
  public SqlSession getWriteSqlSession() {
    return sqlSessionFactory4Write.openSession();
  }

}
