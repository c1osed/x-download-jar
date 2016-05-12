package com.leweiyou.service.entity;

import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.leweiyou.service.util.Utils;

/**
 * 存前台校验信息的实体
 * @author Zhangweican
 *
 */
public class ValidErrorEntity {
	/**
	 * 如果没有标示错误信息，默认标示
	 */
	private static final String NOT_KEY = "-";
	
	private boolean isHaveError = false;
	
	/**
	 * 存放错误信息
	 */
	private Map<String,Set<String>> map = new Hashtable<String, Set<String>>();
	
	
	/**
	 * 存入失败的map中,可以存入一个标志KEY中，再前台可以只取这个标志
	 * @param key
	 * @param value
	 */
	public synchronized void addValidError(String key,String value){
		addValidError(key,value,new String[]{});
	}
	/**
	 * 存入失败的map中,可以存入一个标志KEY中，再前台可以只取这个标志
	 * @param key
	 * @param value
	 */
	public synchronized void addValidError(String key,String value,String... params){
		isHaveError = true;
		Set<String> sets = map.get(key);
		if(sets == null){
			sets = new TreeSet<String>();
		}
		sets.add(Utils.i18n(value,params));
		map.put(key, sets);
	}
	/**
	 * 存入一个错误的map中，可以在前台取值
	 * @param key
	 * @param value
	 */
	public synchronized void addValidError(String value){
		addValidError(value,new String[]{});
	}
	/**
	 * 存入一个错误的map中，可以在前台取值
	 * @param key
	 * @param value
	 */
	public synchronized void addValidError(String value,String... params){
		isHaveError = true;
		Set<String> sets = map.get(NOT_KEY);
		if(sets == null){
			sets = new HashSet<String>();
		}
		sets.add(Utils.i18n(value,params));
		map.put(NOT_KEY, sets);
	}
	public boolean isHaveError() {
		return isHaveError;
	}
	public Map<String, Set<String>> getMap() {
		return map;
	}
	
	public Set<String> get(String key){
		return map.get(key);
	}
	public Collection<Set<String>> values(){
		return map.values();
	}
	public Map<String,Set<String>> all(){
		return map;
	}
	
	
}
