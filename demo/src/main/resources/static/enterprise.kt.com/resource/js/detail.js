
// $('#hashtag_menu').appnd()

$(document).ready(function(){
    if(localStorage.getItem('resultList')){
        console.log(localStorage.getItem('resultList'));
        let results = JSON.parse(localStorage.getItem('resultList'));
        console.log('lsenflwnelnflwnl' + results);
        // let urls = JSON.parse(localStorage.getItem('resultURL'));
        // var idx=Object.keys(results).length;
        // console.log('idx' + idx);
        var params={
            "cnt":1,
            "category": "food",
        }

        // idx--;
        // params['cnt'] = idx;
        console.log(params);
        var query_url = 'http://localhost:9999/product/productOne'
        let idx = 1;
        $('#nav_menu').empty();
        console.log('lengt' + Object.keys(results).length);
        results.forEach(result => {
            params['product1'] = result;
            console.log(result);
            
            let nav_category = '';
            switch(result){
                case 'communication':
                    nav_category='통신';
                    break;
                case 'smart':
                    nav_category='스마트 서비스';
                    break;
                case 'marketing':
                    nav_category='마켓팅';
                    break;
            }
            // 
            // console.log(idx);
            let str = `<li class="nav_item" id="nav_${idx}">`
                                + `<a href="#nav_${idx}" class="nav_btn">`
                                + nav_category + '</a>'
                                + '<div class="nav_subMenu">';
            $.ajax({
                headers: { 
                    'Accept': 'application/json',
                    'Content-Type': 'application/json' 
                },
                type:'POST',
                url:query_url,
                data: JSON.stringify(params),
                success:function(res){
                    console.log('--------------------');
                    console.log(res);
                    console.log(Object.keys(res).length);
                    
                    res.forEach(result => {
                        str += '<a href="' + result.link + '">'
                                + result.name
                                + '</a>'
                    });
                    
                    
                    str += '</div></li>';
                    console.log(str);
                    $(".nav_menu").append(str);
                    // idx++;
                },
                error:function(XMLHttpRequest, textStatus, errorThrown){
                    alert('통신 실패.');
                    console.log('통신 실패.');
                }
            });
            idx++;
           
        });
        
    }
    
});