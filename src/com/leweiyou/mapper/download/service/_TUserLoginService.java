package com.leweiyou.mapper.download.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


import com.leweiyou.mapper.download.mybatis.dao.*;
import com.leweiyou.mapper.download.mybatis.entry.*;
import com.leweiyou.service.util.Commons;

import java.util.List;
import java.util.Set;

/**
 * 凡是以_开头的Service类，都属于自动生成的类，不提倡在这里添加service方法，请在XXXXService类里加自定义方法。
 * @author Zhangweican
 *
 */
public abstract class _TUserLoginService{

	@Autowired
	protected TUserLoginMapper tUserLoginMapper;


	//================方法自动生成区================
    /**
     * 支持分页查询
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public PageInfo<TUserLogin> selectByExample(TUserLoginExample e,int offer, int limit) throws RuntimeException{
		PageHelper.startPage(offer, limit);
		PageInfo<TUserLogin> page = new PageInfo<TUserLogin>(tUserLoginMapper.selectByExample(e));
		return page;
	}
	
    /**
     * 查询唯一对象，如果没有记录返回Null
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
 	public TUserLogin selectOne(TUserLoginExample example) throws RuntimeException{
	 	List<TUserLogin> list = tUserLoginMapper.selectByExample(example);
     	return (list == null || list.size() == 0) ? null : list.get(0);
 	}


    /**
     * 查询记录条数
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public int countByExample(TUserLoginExample example) throws RuntimeException{
        return tUserLoginMapper.countByExample(example);
    }

    /**
     * 删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByExample(TUserLoginExample example) throws RuntimeException{
        return tUserLoginMapper.deleteByExample(example);
    }

    /**
     * 通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByPrimaryKey(Long id) throws RuntimeException{
        return tUserLoginMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByExample(Set<TUserLoginExample> examples) throws RuntimeException{
		for(TUserLoginExample example : examples){
			tUserLoginMapper.deleteByExample(example);
		}
    }

    /**
     * 批量通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByPrimaryKey(Set<Long> ids) throws RuntimeException{
		for(Long id : ids){
			tUserLoginMapper.deleteByPrimaryKey(id);
		}
    }

    /**
     * 插入记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insert(TUserLogin record) throws RuntimeException{
        return tUserLoginMapper.insert(record);
    }

    /**
     * 可选择性插入记录信息，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insertSelective(TUserLogin record) throws RuntimeException{
        return tUserLoginMapper.insertSelective(record);
    }
    
	/**
	 * 批量插入记录
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsert(Set<TUserLogin> records) throws RuntimeException{
		for(TUserLogin record : records){
			tUserLoginMapper.insert(record);
		}
	}
	
	/**
	 * 批量可选择性插入记录信息，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsertSelective(Set<TUserLogin> records) throws RuntimeException{
		for(TUserLogin record : records){
			tUserLoginMapper.insertSelective(record);
		}
	}

	/**
	 * 批量根据主键更新记录，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKeySelective(Set<TUserLogin> records) throws RuntimeException{
		for(TUserLogin record : records){
			tUserLoginMapper.updateByPrimaryKeySelective(record);
		}
	}
    /**
     * 批量通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKey(Set<TUserLogin> records) throws RuntimeException{
		for(TUserLogin record : records){
			tUserLoginMapper.updateByPrimaryKey(record);
		}
    }

    /**
     * 查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public List<TUserLogin> selectByExample(TUserLoginExample example) throws RuntimeException{
        return tUserLoginMapper.selectByExample(example);
    }

    /**
     * 通过主键查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public TUserLogin selectByPrimaryKey(Long id) throws RuntimeException{
        return tUserLoginMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据条件更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExampleSelective(TUserLogin record, TUserLoginExample example) throws RuntimeException{
         return tUserLoginMapper.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExample(TUserLogin record, TUserLoginExample example) throws RuntimeException{
         return tUserLoginMapper.updateByExample(record, example);
    }

    /**
     * 根据主键更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKeySelective(TUserLogin record) throws RuntimeException{
        return tUserLoginMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKey(TUserLogin record) throws RuntimeException{
        return tUserLoginMapper.updateByPrimaryKey(record);
    }
    
}
