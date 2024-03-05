<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link rel="stylesheet" href="resources/css/menu.css">
    <link rel="stylesheet" href="resources/css/mypage.css">
    <link href="resources//css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="resources/css/fontawesome.css">
    <link rel="stylesheet" href="resources/css/templatemo-cyborg-gaming.css">
    <link rel="stylesheet" href="resources/css/owl.css">
    <link rel="stylesheet" href="resources/css/animate.css">
    <link rel="stylesheet"href="https://unpkg.com/swiper@7/swiper-bundle.min.css"/>
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@100;200;300;400;500;600;700;800;900&display=swap" rel="stylesheet">

</head>
<body>
  <div id="js-preloader" class="js-preloader">
    <div class="preloader-inner">
      <span class="dot"></span>
      <div class="dots">
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>
  </div>
                   
  <%@ include file= "/WEB-INF/views/board/menu.jsp" %>
  <div class="container">
    <div class="row">
      <div class="col-lg-12">
        <div class="page-content">
          <div class="row">
            <div class="col-lg-12">
              <div class="main-profile ">
                <div class="row">
                                     
                    <ul>
                      <li><a href="myinfo_view">내 정보</a></li>
                      <li>잔여 포인트 <span id="remaining-points">${user_email.user_point}</span></li>
                      <li>포인트 충전
                        <a href="charge_view">
                          <button id="recharge-button" style="margin-left: 135px; background-color: #bb4ab1; color: #fff; border: none; padding: 5px 10px; border-radius: 5px; cursor: pointer; transition: background-color 0.5s;" onmouseover="this.style.backgroundColor='#a400b3'" onmouseout="this.style.backgroundColor='#bb4ab1'">충전하기</button>
                        </a>
                      </li>
                      <li><a href="Sponsorshipdetails_view"> 후원한 프로젝트 내역 </a> | <a href="registered_Project"> 등록한 프로젝트 </a> | <a href="review"> 리뷰 </a></li>
                    </ul>
                  </div>
                </div>
                 
                  </div>
                </div>
              </div>
            </div>
          </div>
  </div>
  <footer>
    <div class="container">
      <div class="row">
        <div class="col-lg-12">
          <p>Copyright © 2036 <a href="#">Cyborg Gaming</a> Company. All rights reserved. 
          
          <br>Design: <a href="https://templatemo.com" target="_blank" title="free CSS templates">TemplateMo</a>  Distributed By <a href="https://themewagon.com" target="_blank" >ThemeWagon</a></p>
        </div>
      </div>
    </div>
  </footer>
  <script src="resources/js/menu.js"></script>
  <script src="resources/jquery/jquery.min.js"></script>
  <script src="resources/bootstrap/js/bootstrap.min.js"></script>
  <script src="resources/js/isotope.min.js"></script>
  <script src="resources/js/owl-carousel.js"></script>
  <script src="resources/js/tabs.js"></script>
  <script src="resources/js/popup.js"></script>
  <script src="resources/js/custom.js"></script> 
  <script type="text/javascript">

//페이지 로드 시 잔여 포인트를 가져오기
// document.addEventListener('DOMContentLoaded', fetchRemainingPoints);
  </script>

</body>
</html>