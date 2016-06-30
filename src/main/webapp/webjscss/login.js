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