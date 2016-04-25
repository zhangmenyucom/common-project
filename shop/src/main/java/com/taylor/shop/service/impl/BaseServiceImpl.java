package com.taylor.shop.service.impl;



import org.springframework.beans.factory.annotation.Autowired;

import com.taylor.shop.dao.BaseDao;
import com.taylor.shop.service.BaseService;

/**
 * @notes:业务公共类Service类接口
 *
 * @author fei
 *
 *         2015-4-21 下午9:19:05
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {

  @Autowired
  protected BaseDao<T> thisDao = getThisDao();

  /**
   * @notes:根据主键删除表对象记录
   *
   * @param id
   * @author fei 2015-4-21 下午9:34:48
   */
  @Override
  public int deleteByPrimaryKey(Integer id) {
    return thisDao.deleteByPrimaryKey(id);
  }

  /**
   * @notes:根据表对象插入对应记录
   *
   * @param t
   * @author fei 2015-4-21 下午9:35:14
   */
  @Override
  public int insert(T t) {
    return thisDao.insert(t);
  }

  /**
   * @notes:根据表对象插入记录的非空值
   *
   * @param t
   * @author fei 2015-4-21 下午9:35:37
   */
  @Override
  public int insertSelective(T t) {
    return thisDao.insertSelective(t);
  }

  /**
   * @notes:根据表主键查询对应的表对象
   *
   * @param id
   * @author fei 2015-4-21 下午9:36:04
   */
  @Override
  public T selectByPrimaryKey(Integer id) {
    return thisDao.selectByPrimaryKey(id);
  }

  /**
   * @notes:根据主键有选择的更新表对象非空字段
   *
   * @param t
   * @author fei 2015-4-21 下午9:36:27
   */
  @Override
  public int updateByPrimaryKeySelective(T t) {
    return thisDao.updateByPrimaryKeySelective(t);
  }

  /**
   * @notes:根据主键更新表对象表记录所有字段
   *
   * @param t
   * @author fei 2015-4-21 下午9:37:13
   */
  @Override
  public int updateByPrimaryKey(T t) {
    return thisDao.updateByPrimaryKey(t);
  }

}
