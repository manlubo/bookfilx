<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <header class="">
        <div class="container p-0 py-3 d-flex justify-content-between align-items-center">
            <div class="">
                <a href="/bookflix/index" class="text-black text-decoration-none"><h1 class="fs-3 m-0 fw-semibold">Bookfilx</h1></a>
            </div>
            <div class="dropdown">
				<c:if test="${empty member}">
                <a class="btn btn-dark rounded-3 dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                    User
                </a>
                <ul class="dropdown-menu dropdown-menu-dark dropdown-menu-end" aria-labelledby="dropdownMenuLink">
                    <li><a class="dropdown-item py-2" href="/bookflix/member/login">Login</a></li>
                    <li><a class="dropdown-item py-2" href="/bookflix/member/register">Sign in</a></li>
                </ul>
                </c:if>
				<c:if test="${not empty member}">
                <a class="btn btn-dark rounded-3 dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown" aria-expanded="false">
                    <span class="fw-bold">${member.name}</span> 님
                </a>
                <ul class="dropdown-menu dropdown-menu-dark dropdown-menu-end" aria-labelledby="dropdownMenuLink">
                    <li><a class="dropdown-item py-2" href="#">Profile</a></li>
                    <li><a class="dropdown-item py-2" href="/bookflix/member/logout">Logout</a></li>
                </ul>
                </c:if>
            </div>
        </div>
        <nav class="bg-dark">
            <ul class="container p-0 d-flex align-items-center my-0 collapse list-unstyled ">
                <li class="p-2 fw-semibold px-3"><a href="#" class="text-decoration-none text-white small">추천</a></li>
                <li class="nav-item dropdown ms-2">
                    <a class="nav-link dropdown-toggle text-white p-2" href="#" id="domesticMenu" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <span class="small fw-bold">국내도서</span>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="domesticMenu">
                        <li><a class="dropdown-item py-2 small" href="#">교양</a></li>
                        <li><a class="dropdown-item py-2 small" href="#">교육</a></li>
                        <li><a class="dropdown-item py-2 small" href="#">역사</a></li>
                    </ul>
                </li>
                <li class="nav-item dropdown ms-2">
                    <a class="nav-link dropdown-toggle text-white p-2" href="#" id="foreignMenu" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        <span class="small fw-bold">외국도서</span>
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="foreignMenu">
                        <li><a class="dropdown-item py-2 small" href="#">교양</a></li>
                        <li><a class="dropdown-item py-2 small" href="#">교육</a></li>
                        <li><a class="dropdown-item py-2 small" href="#">역사</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
    </header>