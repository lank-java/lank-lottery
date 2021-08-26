package com.lank.lottery.dao;


import com.lank.lottery.po.Activity;

/**
 * @author  LanceLan
 * @since  2021-08-26 16:27
 */
public interface ActivityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Activity record);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity record);
}