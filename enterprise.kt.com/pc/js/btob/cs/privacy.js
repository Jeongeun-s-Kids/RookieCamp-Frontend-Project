/** 개인정보처리방침 **/
var controller = $.extend(new $.CommonObj(),{
    wrapCls: '.kt_pc',
	eventInit:function() {

	}, 
	onCreate:function() {
	}
	
});

var mController = $.extend(new $.CommonObj(),{
    wrapCls: '.kt_mb',
	eventInit:function() {

	}, 
	onCreate:function() {

	}
	
});


$(document).ready(function(){
	controller.init();
	mController.init();
});
