/**
 * Created by cutesimba on 2016/6/29.
 */
$(function(){
    $("#register").on("click",function(){
        $("#login-form").hide();
        $("#register-form").fadeIn();
        $("#login").removeClass("checked");
        $("#register").addClass("checked");
    });
    $("#login").on("click",function(){
        $("#register").removeClass("checked");
        $("#login").addClass("checked");
        $("#register-form").hide();
        $("#login-form").fadeIn();
    });
});
$("#sure").on("click",function(){
    var name = $("#name").val();
    var pwd = $("#pwd").val();
    var sex = "";
    $.ajax({
        type:'post',
        data:{'name':name,'pwd':pwd,'sex':sex},
        url:"http://localhost:8080/jt-ms/user_login.action",
        dataType:'json',
        success:function (result) {
            
        },
        error:function () {
            
        }
    });
})