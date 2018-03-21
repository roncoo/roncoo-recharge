<#assign base=request.contextPath />
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <title>龙果支付-欢迎登录</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" />
    <link href="${base}/BJUI/login/css/login.css" rel="stylesheet" />
</head>
<body >
    <nav class="navbar-default">
        <div class="container">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="http://www.roncoo.net"><img alt="logo" src="${base}/BJUI/login/images/logo.png" style="height:100%;"></a>
                </div>
            </div>
        </div>
    </nav>
   
    <div style="background-color: #fe6a22;">
        <div class="container">
            <div class="row">
                <div class="col-md-8"><img src="${base}/BJUI/login/images/bg.png" style="width:100%;"></div>
                <div class="col-md-3" style="background-color:#fff;margin:80px 0;padding:30px 25px;">
                    <form class="form-signin" action="${base}/login" method="post">
                        <h3 class="form-signin-heading">密码登录</h3>
                        <h5 class="text-danger">${msg!''}</h5>
                        <label for="inputEmail" class="sr-only">账号</label>
                        <input type="text" name="username" id="inputEmail" class="form-control" placeholder="账号" required autofocus>
                        <br/>
                        <label for="inputPassword" class="sr-only">密码</label>
                        <input type="password" name="password" id="inputPassword" class="form-control" placeholder="密码" required>
                         <div class="checkbox">
                            <label><input type="checkbox" value="remember-me"> 记住我</label>
                        </div>
                        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
    <div style="background-color:#fff; width:100%;margin:50px auto;text-align:center;">Copyright &copy; 2015- <span id="year"></span> 领课网络</div>
<script language="javascript">var now=new Date();document.getElementById("year").innerHTML = now.getFullYear();</script>
</body>
</html>
