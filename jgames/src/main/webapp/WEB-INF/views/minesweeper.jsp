<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>J-Games</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/minesweeper.css"></link>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/minesweeper.js" defer></script>
  </head>
  <body data-context-path="${pageContext.request.contextPath}">
    <div class="wrapper">

      <div class="btn">
        <button class="reset" data-level="EASY">EASY</button>
        <button class="reset" data-level="NORMAL">NORMAL</button>
        <button class="reset" data-level="HARD">HARD</button>
      </div>

      <div class="board">
        <div class="close-cell" data-position="0"></div>
        <div class="flag-cell" data-position="1">
          <img src="${path}/img/flag_icon.svg" alt="">
        </div>
        <div class="reveal-cell" data-position="2">
          <img src="${path}/img/mine_icon.svg" alt="">
        </div>
        <div class="open-cell" data-position="3" data-adjacent="0"></div>
        <div class="open-cell" data-position="4" data-adjacent="1">
          <img src="${path}/img/number_1_icon.svg" alt="">
        </div>
      </div>

    </div>
  </body>
</html>
