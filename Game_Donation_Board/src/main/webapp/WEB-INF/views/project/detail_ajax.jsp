<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:choose>
	<c:when test="${wanted eq 0 }">
		<p>${content }</p>
	</c:when>
	<c:when test="${wanted eq 1 }">
	<div id="main_box">
		<form>
           <input type="hidden" value="${user_email.user_idx}" id="user_idx" name="user_idx">
           <input type="hidden" value="${project_idx}" id="project_idx" name="project_idx">
		<table align="left">
			<caption>::리뷰::</caption>
			<tr>
			
				<th>내용</th>
				<td>		
					<textarea row="5" cols="50" name="review_content" id="review_content" style="resize:none;"wrap="on"></textarea>
				</td>
				<td>	
				<input type="button" value="등록하기" onclick="send(this.form);">
				</td>
			</tr>
		</table>
		</form>
	</div>
	<br><br><br><br>
	<c:forEach var="dto" items="${list}">
	<form action="f">
		<div class="review_box" border="1" align="left">
		<div class="user_img">
			<img src="${dto.user_img}" alt="image"/>
		</div>
		<div class="user_info">
		<span>&nbsp;&nbsp;${dto.user_name}</span>
		<span>&nbsp;&nbsp;${dto.regdate}</span>
		<c:if test="${dto.user_idx eq user_email.user_idx}">
           <input type="hidden" value="${user_email.user_idx}" id="user_idx" name="user_idx">
			<input type="hidden" value="${dto.user_idx}" name="idx" id="review_user_idx" >
			<input type="hidden" value="${dto.review_idx}" name="idx" id="review_idx">
			<input type="button" value="삭제" onclick="del(this.form)">
		</c:if>
		<br><br>
		</div>
		<div class="type_content">${dto.review_content}</div>
		<div>
		<p>-------------------------------------------------------------------------</p>
		</div>
		</div>
	</form>
	</c:forEach>
	</c:when>
</c:choose>