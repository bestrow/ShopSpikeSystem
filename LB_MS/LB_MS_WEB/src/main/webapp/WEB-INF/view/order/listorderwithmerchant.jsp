<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2">
    <tr>
        <td>支付金额</td>
        <td>订单生成时间</td>
        <td>支付状态</td>
        <td>收货人地址</td>
        <td>收货人电话</td>
        <td>收货人名称</td>
        <td>交易流水号</td>
        <td>购买数量</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${msorderList}" var="item">
        <tr>
            <td>${item.payamount}</td>
            <td>${item.createtime}</td>
            <td>${item.paystatus}</td>
            <td>${item.receivingadress}</td>
            <td>${item.receivingphone}</td>
            <td>${item.receivingname}</td>
            <td>${item.tradeserialnumber}</td>
            <td>${item.num}</td>
            <td>
                <c:if test="${item.paystatus == 1}">未支付</c:if>
                <c:if test="${item.paystatus == 2}">支付完成</c:if>
                <c:if test="${item.paystatus == 3}">退款成功</c:if>
                <c:if test="${item.paystatus == 5}">退款申请不成功</c:if>
                <c:if test="${item.paystatus == 4}">
                    <a href="javascript:void(0)" onclick="auditrefund('${item.tradeserialnumber}','3','${item.payamount}','${item.paytype}','${item.userid}'')" >退款审核通过</a>||
                    <a href="javascript:void(0)" onclick="auditrefund('${item.tradeserialnumber}','5','${item.payamount}','${item.paytype}')">退款审核不通过</a>
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    function auditrefund(tradeserialnumber,paystatus,payamount,paytype,userid) {
        window.location.href =
            "auditrefund?tradeserialnumber="+tradeserialnumber+"&&paystatus="+paystatus+"&&payamount="+payamount+"&&paytype="+paytype+"&&userid="+userid;
    }
</script>
</body>
</html>