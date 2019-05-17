$(function () {
    /*删除车辆*/
    $(".silkDel").click(function () {
        var carID=$(this).attr("id");
        var athis=$(this);
        if(confirm("确定删除?")){
        $.post("delCar",{"carID":carID},function (date) {
            if (date=="删除成功") {
                athis.parent().parent().parent().remove();
            }
            $("#hint").html(date)
        })
        }
    })
    $("#button_big").click(function () {
            window.location.href='usedCars';
    })

    /*验证申请车辆信息*/
    $("#tip-left").click(function () {
        checkCarID();
        checkStTime();
        checkReturnTime();
        checkDestination();
        checkColorpicker();
        if(checkCarID()&&checkStTime()&&checkReturnTime()&&checkDestination()&&checkColorpicker()){
            $("#usedCarsForm").submit();
        }
    })
    $("#carID").blur(checkCarID);
    $("#stTime").blur(checkStTime);
    $("#returnTime").blur(checkReturnTime);
    $("#datepicker").blur(checkDestination);
    $("#requestMileage").blur(checkColorpicker);
    /*验证申请编号*/
    function checkCarID(){
        var carID=$("#carID").val();
        if(carID==""||carID==null){
            $("#carIDErroy").html("")
            $("#carIDErroy").html("请选择编号");
            return false;
        }else{
            $("#carIDErroy").html("")
            return true;
        }
    }
    /*验证开始时间*/
    function checkStTime() {
        var date = new Date(+new Date() + 8 * 3600 * 1000).toISOString().replace(/T/g, ' ').replace(/\.[\d]{3}Z/, '');
        var stTime = $("#stTime").val();
        if (stTime == "" || stTime == null) {
            $("#dateErroy").html("")
            $("#dateErroy").html("开始时间不能为空");
            return false;
        } else if (stTime <= date) {
            $("#dateErroy").html("")
            $("#dateErroy").html("开始时间不能小于当前时间")
            return false;
        }else {
            $("#dateErroy").html("")
            return true;
        }
    }
    /*验证结束时间*/
    function checkReturnTime(){
        var date=new Date(+new Date()+8*3600*1000).toISOString().replace(/T/g,' ').replace(/\.[\d]{3}Z/,'');
        var returnTime=$("#returnTime").val();
        var stTime=$("#stTime").val();
        if(returnTime==""||returnTime==null){
            $("#dateErroy").html("")
            $("#dateErroy").html("结束时间不能为空");
            return false;
        } else if(returnTime==stTime){
            $("#dateErroy").html("结束时间不能等于开始时间");
            return false;
        }
        else {
                $("#dateErroy").html("")
                 return true;
             }
        }
    /*目得地*/
    function checkDestination() {
      var datepicker=  $("#datepicker").val();
        if(datepicker==""||datepicker==null){
            $("#datepickerError").html("")
            $("#datepickerError").html("目的地不能为空");
            return false;
        }else {
            $("#datepickerError").html("")
            return true;
        }
    }
    /*申请里程*/
    function checkColorpicker() {
        var requestMileage=  $("#requestMileage").val();
        if(requestMileage==""||requestMileage==null){
            $("#requestMileageError").html("")
            $("#requestMileageError").html("申请里程不能为空");
            return false;
        }
        else {
            $("#requestMileageError").html("")
            return true;
        }
    }




})