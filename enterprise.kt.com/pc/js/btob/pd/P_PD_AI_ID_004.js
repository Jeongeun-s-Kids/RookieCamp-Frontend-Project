/** 상품서비스>AI>Solution>기가지니 인사이드 **/
var controller = $.extend(new $.CommonObj(),{
    wrapCls:'.kt_pc',
	eventInit:function() {

	}, 
	onCreate:function() {
	}
	
});

var mController = $.extend(new $.CommonObj(),{
    wrapCls:'.kt_mb',
	eventInit:function() {

	}, 
	onCreate:function() {

	}
	
});


$(document).ready(function(){
	controller.init();
	mController.init();
});
