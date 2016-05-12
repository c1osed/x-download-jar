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
public abstract class _TUserCopyService{

	@Autowired
	protected TUserCopyMapper tUserCopyMapper;


	//================方法自动生成区================
    /**
     * 支持分页查询
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public PageInfo<TUserCopy> selectByExample(TUserCopyExample e,int offer, int limit) throws RuntimeException{
		PageHelper.startPage(offer, limit);
		PageInfo<TUserCopy> page = new PageInfo<TUserCopy>(tUserCopyMapper.selectByExample(e));
		return page;
	}
	
    /**
     * 查询唯一对象，如果没有记录返回Null
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
 	public TUserCopy selectOne(TUserCopyExample example) throws RuntimeException{
	 	List<TUserCopy> list = tUserCopyMapper.selectByExample(example);
     	return (list == null || list.size() == 0) ? null : list.get(0);
 	}


    /**
     * 查询记录条数
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public int countByExample(TUserCopyExample example) throws RuntimeException{
        return tUserCopyMapper.countByExample(example);
    }

    /**
     * 删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByExample(TUserCopyExample example) throws RuntimeException{
        return tUserCopyMapper.deleteByExample(example);
    }

    /**
     * 通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public int deleteByPrimaryKey(TUserCopyKey id) throws RuntimeException{
        return tUserCopyMapper.deleteByPrimaryKey(id);
    }

    /**
     * 批量删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByExample(Set<TUserCopyExample> examples) throws RuntimeException{
		for(TUserCopyExample example : examples){
			tUserCopyMapper.deleteByExample(example);
		}
    }

    /**
     * 批量通过主键删除记录
     */
    @CacheEvict(value = Commons.ID_Ehcache_Default,allEntries = true)
	public void batchDeleteByPrimaryKey(Set<TUserCopyKey> ids) throws RuntimeException{
		for(TUserCopyKey id : ids){
			tUserCopyMapper.deleteByPrimaryKey(id);
		}
    }

    /**
     * 插入记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insert(TUserCopy record) throws RuntimeException{
        return tUserCopyMapper.insert(record);
    }

    /**
     * 可选择性插入记录信息，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int insertSelective(TUserCopy record) throws RuntimeException{
        return tUserCopyMapper.insertSelective(record);
    }
    
	/**
	 * 批量插入记录
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsert(Set<TUserCopy> records) throws RuntimeException{
		for(TUserCopy record : records){
			tUserCopyMapper.insert(record);
		}
	}
	
	/**
	 * 批量可选择性插入记录信息，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchInsertSelective(Set<TUserCopy> records) throws RuntimeException{
		for(TUserCopy record : records){
			tUserCopyMapper.insertSelective(record);
		}
	}

	/**
	 * 批量根据主键更新记录，对部分空值字段不插入
	 */
	@CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKeySelective(Set<TUserCopy> records) throws RuntimeException{
		for(TUserCopy record : records){
			tUserCopyMapper.updateByPrimaryKeySelective(record);
		}
	}
    /**
     * 批量通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public void batchUpdateByPrimaryKey(Set<TUserCopy> records) throws RuntimeException{
		for(TUserCopy record : records){
			tUserCopyMapper.updateByPrimaryKey(record);
		}
    }

    /**
     * 查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public List<TUserCopy> selectByExample(TUserCopyExample example) throws RuntimeException{
        return tUserCopyMapper.selectByExample(example);
    }

    /**
     * 通过主键查询记录
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public TUserCopy selectByPrimaryKey(TUserCopyKey id) throws RuntimeException{
        return tUserCopyMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据条件更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExampleSelective(TUserCopy record, TUserCopyExample example) throws RuntimeException{
         return tUserCopyMapper.updateByExampleSelective(record, example);
    }

    /**
     * 根据条件更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExample(TUserCopy record, TUserCopyExample example) throws RuntimeException{
         return tUserCopyMapper.updateByExample(record, example);
    }

    /**
     * 根据主键更新记录，对部分空值字段不插入
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKeySelective(TUserCopy record) throws RuntimeException{
        return tUserCopyMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 通过主键更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKey(TUserCopy record) throws RuntimeException{
        return tUserCopyMapper.updateByPrimaryKey(record);
    }
    
	/**
     * 支持大字段的查询
     */
    @Cacheable(value = Commons.ID_Ehcache_Default)
	public List<TUserCopy> selectByExampleWithBLOBs(TUserCopyExample example) throws RuntimeException{
        return tUserCopyMapper.selectByExampleWithBLOBs(example);
    }
    
    /**
     * 根据主键更新记录，包括大字段
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByPrimaryKeyWithBLOBs(TUserCopy record) throws RuntimeException{
        return tUserCopyMapper.updateByPrimaryKeyWithBLOBs(record);
    }
    /**
     * 根据条件更新记录
     */
    @CachePut(value = Commons.ID_Ehcache_Default)
	public int updateByExampleWithBLOBs(TUserCopy record, TUserCopyExample example) throws RuntimeException{
         return tUserCopyMapper.updateByExampleWithBLOBs(record, example);
    }
}
