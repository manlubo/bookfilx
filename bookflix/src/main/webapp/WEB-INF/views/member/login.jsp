<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../common/head.jsp" %>
</head>
<body>
<%@include file="../common/header.jsp" %>
<div class="container">
        <main>
            <form method="post">
                <div class="form-floating mb-4">
                    <input type="text" class="form-control px-3" id="id" name="id" placeholder="ID">
                    <label for="id" class="text-muted px-3">아이디</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="password" class="form-control px-3" id="pw" name="pw" placeholder="Password">
                    <label for="pw" class="text-muted px-3">비밀번호</label>
                </div>
                <button type="submit" class="btn btn-dark mt-4">로그인</button>
            </form>            
        </main>
    </div>
<%@include file="../common/footer.jsp" %>
</body>

</html>