<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<html>
<head>
<title>用户统计</title>
<script type="text/javascript" src="http://cdn-hangzhou.goeasy.io/goeasy.js"></script>
<script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
<script src="${pageContext.request.contextPath}/js/china.js"></script>
<script>
    $(function () {

        var goEasy = new GoEasy({
            appkey: ""
        });
        goEasy.subscribe({
            channel: "regist",
            onMessage: function (message) {
                $.ajax({
                    type: 'post',
                    url: '${pageContext.request.contextPath}/user/selectNearlyThreeWeekRegistUser',
                    dataType: 'JSON',
                    success: function (data) {
                        console.log(data)
                        // 基于准备好的dom，初始化echarts实例
                        var myChart = echarts.init(document.getElementById('main'));

                        // 指定图表的配置项和数据
                        var option = {
                            title: {
                                text: '持明法洲近三周注册用户数量'
                            },
                            tooltip: {},
                            legend: {
                                data: ['注册数量']
                            },
                            xAxis: {
                                data: ["7天", "14天", "21天"]
                            },
                            yAxis: {},
                            series: [{
                                name: '注册数量',
                                type: 'bar',
                                data: [parseInt(data.a), parseInt(data.b), parseInt(data.c)]
                            }]
                        };

                        // 使用刚指定的配置项和数据显示图表。
                        myChart.setOption(option);
                    }

                })
            }
        });

        $.ajax({
            type: 'post',
            url: '${pageContext.request.contextPath}/user/selectNearlyThreeWeekRegistUser',
            dataType: 'JSON',
            success: function (data) {
                console.log(data)
                // 基于准备好的dom，初始化echarts实例
                var myChart = echarts.init(document.getElementById('main'));

                // 指定图表的配置项和数据
                var option = {
                    title: {
                        text: '前途近三周注册用户数量'
                    },
                    tooltip: {},
                    legend: {
                        data: ['注册数量']
                    },
                    xAxis: {
                        data: ["7天", "14天", "21天"]
                    },
                    yAxis: {},
                    series: [{
                        name: '注册数量',
                        type: 'bar',
                        data: [parseInt(data.a), parseInt(data.b), parseInt(data.c)]
                    }]
                };

                // 使用刚指定的配置项和数据显示图表。
                myChart.setOption(option);
            }

        })

    })


</script>
</head>

<body>
    <!-- 为 ECharts 准备一个具备大小（宽高）的 DOM -->
    <div id="main" style="width: 600px;height:400px;"></div>

</body>
</html>