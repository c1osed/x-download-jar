package com.leweiyou.service.valid;

import java.io.IOException;
import java.util.Set;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.lang.StringUtils;

import com.leweiyou.service.entity.ValidErrorEntity;
import com.leweiyou.service.util.CXT;

/**
 * 定义前台校验的错误日志输出
 * @author Zhangweican
 *
 */
public class ValidErrorTag extends TagSupport {

	private PageContext pageContext;
	private String key;
	
	@Override
	public int doStartTag() throws JspException {
		ValidErrorEntity e = null ;
		try {
			e = CXT.getValidErrorMap();
		} catch (Exception e2) {
			//对这里的错误不处理
		}
		
		if(e != null && e.isHaveError()){
			JspWriter out = pageContext.getOut();
			StringBuffer sb = new StringBuffer();
			if(StringUtils.isNotEmpty(key)){
				Set<String> vals = e.get(key);
				if(vals != null){
					for(String value : vals){
						sb.append(value).append("<br>");
					}
				}
			}else{
				for(Set<String> sets : e.values()){
					for(String value : sets){
						sb.append(value).append("<br>");
					}
				}
			}
			try {
				out.write(sb.toString());
			} catch (IOException e1) {
			}
		}
		
		return super.doStartTag();
	}

	public void setPageContext(PageContext arg0) {
        this.pageContext = arg0;//PageContext获取用户request out 等对象
    }

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
