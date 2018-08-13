<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 2018/8/13
  Time: 上午11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ page import="static com.hotelsystem.utils.AesEncodeUtil.aesEncrypt" %>


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>无标题文档</title>
    <link href="html/css/style.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="html/js/jquery.js"></script>
</head>

<body>

<div class="place">
    <span>位置：</span>
    <ul class="placeul">
        <li><a href="#">首页</a></li>
        <li><a href="#">表单</a></li>
    </ul>
</div>


<div class="formbody">

    <div class="formtitle"><span>基本信息</span></div>

    <ul class="forminfo">
        <li><label>订单号</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.id}"/><i>注意，除了房费不可编辑其他</i></li>
        <li><label>房间号</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.room.id}"/><i></i></li>
        <li><label>入住时间</label><input  id="arrDay" type="text" class="dfinput" disabled="disabled" value=""/><i></i></li>
        <li><label>预计离开时间</label><input  id="leaveDay" type="text" class="dfinput" disabled="disabled" value="" /><i></i></li>
        <li><label>预计入住天数</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.stayDays}"/><i></i></li>
        <li><label>已付押金</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.pledgeMoney}"/><i></i></li>
        <li><label>已付房费</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.paidMoney}"/><i></i></li>
        <li><label>房间价格</label><input  type="text" class="dfinput" disabled="disabled" value="${maps.checkInBean.room.roomType.price}"/><i></i></li>
        <li><label>当前离开时间</label><input  id="timeNow" type="text" class="dfinput" disabled="disabled" value=""/><i></i></li>
        <li><label>实际入住天数</label><input  id="daynow" type="text" class="dfinput" disabled="disabled" value="${maps.overTime}"/><i></i></li>
        <li><label>预计应收房费</label><input  id="moeny" type="text" class="dfinput" disabled="disabled" value="${maps.money}"/><i></i></li>
        <li><label>应付房费</label><input  type="text" class="dfinput" value="注意，不能小于预计房费"/><i>人民币</i></li>
        <li><label>是否退房</label><input  type="text" class="dfinput" value=""/><i></i></li>
        <li><label>&nbsp;</label><input  type="button" class="btn" value="确认退房" onclick="ExitRoom()"/></li>
        <li><label>&nbsp;</label><input  type="button" class="btn" value="返回主页"/></li>

    </ul>

    <%
        String coude=request.getParameter("money");
        String encrypt = aesEncrypt("coude");
    %>

</div>


</body>
<script>
function getNowFormatDate() {
var date = new Date();
var seperator1 = "-";
var seperator2 = ":";
var month = date.getMonth() + 1;
var strDate = date.getDate();
if (month >= 1 && month <= 9) {
month = "0" + month;
}
if (strDate >= 0 && strDate <= 9) {
strDate = "0" + strDate;
}
var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
+ " " + date.getHours() + seperator2 + date.getMinutes()
+ seperator2 + date.getSeconds();
document.getElementById("timeNow").value=currentdate;
return currentdate;


}
getNowFormatDate();

function  nowday() {
   var arrDay=$("#arrDay").val();
   console.log(arrDay);
   var nowDay=getNowFormatDate();
   console.log(nowDay);
}
nowday();

function GMTToStr(time) {
    var dateStr=time.trim().split(" ");
    var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";
    var date = new Date(Date.parse(strGMT));
    var year = date.getFullYear();  //获取年
    var month = date.getMonth() + 1;    //获取月
    var day = date.getDate(); //获取日
    var hours = date.getHours();
    var minutes = date.getMinutes();
    var sec = date.getSeconds();
    var postDate = year+'-'+month+'-'+day+' '+hours+':'+minutes+ ':'+sec ;
    return postDate;
}
function date(arrtime,leavetime) {
    var arrTime=GMTToStr(arrtime);
    var leaveTime=GMTToStr(leavetime);
    console.log(arrTime);
    $("#arrDay").val(arrTime);
    $("#leaveDay").val(leaveTime);
}
date("${maps.checkInBean.arriveTime}","${maps.checkInBean.leaveTime}");


function ExitRoom() {
    var moenys= "<%=encrypt %>";
    console.log(moenys);
}
</script>
</html>
