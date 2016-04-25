package com.taylor.shop.service;

import com.taylor.shop.dao.BaseDao;

/**
 * @notes：业务公共类Service类接口
 * 
 * @author fei
 *
 *         2014-4-3 下午1:38:58
 */
public interface BaseService<T> {

  public BaseDao<T> getThisDao();

  /**
   * @notes:根据主键删除表对象记录
   *
   * @param id
   * @author fei 2015-4-21 下午9:34:48
   */
  public int deleteByPrimaryKey(Integer id);

  /**
   * @notes:根据表对象插入对应记录
   *
   * @param t
   * @author fei 2015-4-21 下午9:35:14
   */
  public int insert(T t);

  /**
   * @notes:根据表对象插入记录的非空值
   *
   * @param t
   * @author fei 2015-4-21 下午9:35:37
   */
  public int insertSelective(T t);

  /**
   * @notes:根据表主键查询对应的表对象
   *
   * @param id
   * @author fei 2015-4-21 下午9:36:04
   */
  public T selectByPrimaryKey(Integer id);

  /**
   * @notes:根据主键有选择的更新表对象非空字段
   *
   * @param t
   * @author fei 2015-4-21 下午9:36:27
   */
  public int updateByPrimaryKeySelective(T t);

  /**
   * @notes:根据主键更新表对象表记录所有字段
   *
   * @param t
   * @author fei 2015-4-21 下午9:37:13
   */
  public int updateByPrimaryKey(T t);

}
