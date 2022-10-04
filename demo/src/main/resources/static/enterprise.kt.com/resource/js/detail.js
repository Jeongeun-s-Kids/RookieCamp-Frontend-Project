
// $('#hashtag_menu').appnd()

$(document).ready(function(){
    if(localStorage.getItem('resultList')){
        console.log(localStorage.getItem('resultList'));
        let results = JSON.parse(localStorage.getItem('resultList'));

        var params={
            "cnt":1,
            "category": "food",
        }

        // idx--;
        // params['cnt'] = idx;
        console.log(params);
        let query_url = 'http://localhost:9999/product/productOne'

        // http://localhost:9999/enterprise.kt.com/pd/P_PD_CC_TE_005.do.html#nav_1
        let cur_url = document.location.href;
        console.log(cur_url);
        let url = cur_url.substr(43, 22);
        console.log(url);



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
                    // ../../enterprise.kt.com/pd/P_PD_CC_TE_006.do.html
                    res.forEach(result => {
                        // console.log(result.link.substr(27, 22));
                        if(url != result.link.substr(27, 22)){
                            str += '<a href="' + result.link + '">'
                                + result.name
                                + '</a>'
                        }
                        
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