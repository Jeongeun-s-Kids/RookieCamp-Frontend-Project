
// $('#hashtag_menu').appnd()

$(document).ready(function(){
    if(localStorage.getItem('resultList')){
        console.log(localStorage.getItem('resultList'));
        let results = JSON.parse(localStorage.getItem('resultList'));
        let urls = JSON.parse(localStorage.getItem('resultURL'));
        results.forEach(result => {
            console.log(result);
            let str = '<div class="conn_circle"></div>'
            str += '<div class="conn_bar"></div>'
                     + '<div id="hashtag_nav">'
                     + '<a href=""> # ' + result + '</a></div>';
    
            console.log(str);
            $('#hashtag_menu').append(str);
        });
    }
    
});