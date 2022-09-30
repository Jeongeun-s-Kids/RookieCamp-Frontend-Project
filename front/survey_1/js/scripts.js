$(document).ready(function(){
    $('#resultBtn').click(function(){
        var idx=1;
        var params={
            "cnt":idx,
            "category": "food",
        }
        $('#lists_3 input:checked').each(function(){
            
            params['product'+(idx++)] = this.value;
            
        });
        idx--;
        params['cnt'] = idx;
        console.log(params);
        var query_url = 'http://localhost:9999/product'
        switch(idx){
            case 1:
                query_url += '/productOne';
                break;
            case 2:
                query_url += '/productTwo';
                break;
            case 3:
                query_url += '/productThree';
                break;
        }
    
        $.ajax({
            headers: { 
                'Accept': 'application/json',
                'Content-Type': 'application/json' 
            },
            type:'POST',
            url:query_url,
            data: JSON.stringify(params),
            success:function(res){
                let resultList = [];
                let resultURL = [];
                $('#result_num').empty();
                $("#result_num").append(Object.keys(res).length);
                $('#card_list').empty();
                res.forEach(result => {

                    resultList.push(result.name);
                    resultURL.push(result.link);

                    let str = '<div class="lists">'
                    str +='<dl class="prod_info" onclick="location.href=' + "'" + result.link + "'" + ';">' 
                            + '<dt class="description">' 
                            + '<img class="ico" src=' + "'" + './res/icons/'+ result.category + '/' + result.icon + "'" + 'style="width: 70px; height:70px;" alt=""/>'
                            + '<span>'+ result.name + '</span>' + '</dt>'
                            + '<dd class="description">' + result.content + '</dd>'
                            + '</dl></div>';

                    $("#card_list").append(str);
                });

                localStorage.setItem('resultList', JSON.stringify(resultList));
                localStorage.setItem('resultURL', JSON.stringify(resultURL));
            },
            error:function(XMLHttpRequest, textStatus, errorThrown){
                alert('통신 실패.');
                console.log('통신 실패.');
            }
        });
    });
});

function fnMove(seq){
    console.log('move');
    var offset = $("#recommend_"+ seq).offset();
    $('html, body').animate({scrollTop : offset.top}, 400);
}