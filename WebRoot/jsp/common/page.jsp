<<<<<<< HEAD
﻿<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%--


param.mark      --  一个标记 
param.formId    -- form id  ( 未实现 )
param.pageName  --  requestScope  page name   
 
eg. : 

<jsp:include page="/common/page.jspp">
 <jsp:param name="formId"  value="attendentPageForm"/>
 <jsp:param name="pageName"  value="attendentPage"/>
 <jsp:param name="mark"  value="attendentPage"/>
</jsp:include>
 
eg.  2:
页面：
/oel/WebRoot/zone/oelroom/room-addmember.jspp
链接:
http://localhost:8080/oel/zone/user/index.jspp  然后 点击”找人“ 

 
--%>
<c:set var="_commonPage" value="${requestScope.page}" />
<c:if test="${not empty param.pageName}">
 <c:set var="_commonPageName" value="${param.pageName}" />
 <c:set var="_commonPage" value="${requestScope[_commonPageName]}" />
</c:if>

<c:set var="_commonFormId" value="${param.formId}" />

<c:if test="${fn:length(_commonPage.result) > 0}">
<c:set var="_commonPageMark"  >${param.mark}</c:set>
<div class="pageToolBar" style="padding-left:15px;line-height: 26px;">
	每页
	<a href="javascript:void( jumpPage(1,100,'${_commonPageMark}','${_commonFormId }') ); ">100</a>
	<a href="javascript:void( jumpPage(1,20,'${_commonPageMark}','${_commonFormId }') ); ">20</a>
	<a href="javascript:void( jumpPage(1,10,'${_commonPageMark}','${_commonFormId }') ); ">10</a>
	<a href="javascript:void( jumpPage(1,5,'${_commonPageMark}','${_commonFormId }') ); ">5</a>
	<a href="javascript:void( jumpPage(1,2,'${_commonPageMark}','${_commonFormId }') ); ">2</a>
	条，
	共${_commonPage.totalCount}条，每页${_commonPage.pageSize}条，第${_commonPage.pageNo}页/共${_commonPage.totalPages}页 
	<a href="javascript:void( jumpPage(1,${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') );">首页</a>
	<c:if test="${_commonPage.hasPre}">
		<a href="javascript:void( jumpPage(${_commonPage.prePage},${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') ); ">上一页</a>
	</c:if>
	<c:if test="${!_commonPage.hasPre}">
		上一页
	</c:if>
	<c:if test="${_commonPage.hasNext}">
		<a href="javascript:void( jumpPage(${_commonPage.nextPage},${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') ); ">下一页</a>
	</c:if>
	<c:if test="${!_commonPage.hasNext}">
		下一页
	</c:if>
	<c:if test="${_commonPage.totalCount>_commonPage.pageSize}">
		<a href="javascript:void( jumpPage(${_commonPage.totalPages},null,'${_commonPageMark}','${_commonFormId }') ); ">末页</a>
	</c:if>
</div>
=======
﻿<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib  prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%--


param.mark      --  一个标记 
param.formId    -- form id  ( 未实现 )
param.pageName  --  requestScope  page name   
 
eg. : 

<jsp:include page="/common/page.jspp">
 <jsp:param name="formId"  value="attendentPageForm"/>
 <jsp:param name="pageName"  value="attendentPage"/>
 <jsp:param name="mark"  value="attendentPage"/>
</jsp:include>
 
eg.  2:
页面：
/oel/WebRoot/zone/oelroom/room-addmember.jspp
链接:
http://localhost:8080/oel/zone/user/index.jspp  然后 点击”找人“ 

 
--%>
<c:set var="_commonPage" value="${requestScope.page}" />
<c:if test="${not empty param.pageName}">
 <c:set var="_commonPageName" value="${param.pageName}" />
 <c:set var="_commonPage" value="${requestScope[_commonPageName]}" />
</c:if>

<c:set var="_commonFormId" value="${param.formId}" />

<c:if test="${fn:length(_commonPage.result) > 0}">
<c:set var="_commonPageMark"  >${param.mark}</c:set>
<div class="pageToolBar" style="padding-left:15px;line-height: 26px;">
	每页
	<a href="javascript:void( jumpPage(1,100,'${_commonPageMark}','${_commonFormId }') ); ">100</a>
	<a href="javascript:void( jumpPage(1,20,'${_commonPageMark}','${_commonFormId }') ); ">20</a>
	<a href="javascript:void( jumpPage(1,10,'${_commonPageMark}','${_commonFormId }') ); ">10</a>
	<a href="javascript:void( jumpPage(1,5,'${_commonPageMark}','${_commonFormId }') ); ">5</a>
	<a href="javascript:void( jumpPage(1,2,'${_commonPageMark}','${_commonFormId }') ); ">2</a>
	条，
	共${_commonPage.totalCount}条，每页${_commonPage.pageSize}条，第${_commonPage.pageNo}页/共${_commonPage.totalPages}页 
	<a href="javascript:void( jumpPage(1,${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') );">首页</a>
	<c:if test="${_commonPage.hasPre}">
		<a href="javascript:void( jumpPage(${_commonPage.prePage},${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') ); ">上一页</a>
	</c:if>
	<c:if test="${!_commonPage.hasPre}">
		上一页
	</c:if>
	<c:if test="${_commonPage.hasNext}">
		<a href="javascript:void( jumpPage(${_commonPage.nextPage},${_commonPage.pageSize},'${_commonPageMark}','${_commonFormId }') ); ">下一页</a>
	</c:if>
	<c:if test="${!_commonPage.hasNext}">
		下一页
	</c:if>
	<c:if test="${_commonPage.totalCount>_commonPage.pageSize}">
		<a href="javascript:void( jumpPage(${_commonPage.totalPages},null,'${_commonPageMark}','${_commonFormId }') ); ">末页</a>
	</c:if>
</div>
>>>>>>> origin/master
</c:if>