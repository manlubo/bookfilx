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
                <div class="form-floating mb-4">
                    <input type="text" class="form-control px-3" id="name" name="name" placeholder="Name">
                    <label for="name" class="text-muted px-3">이름</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="email" class="form-control px-3" id="email" name="email" placeholder="name@example.com">
                    <label for="email" class="text-muted px-3">이메일</label>
                </div>
                <div class="form-floating mb-4">
                    <input type="text" class="form-control px-3" id="tel" name="tel" placeholder="Tel">
                    <label for="tel" class="text-muted px-3">전화번호</label>
                </div>
                <button type="submit" class="btn btn-dark mt-4">회원가입</button>
            </form>            
        </main>
    </div>
<%@include file="../common/footer.jsp" %>
</body>

</html>