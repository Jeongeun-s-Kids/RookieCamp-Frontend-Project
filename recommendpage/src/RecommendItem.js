import {Component} from 'react';

class RecommendItem extends Component{

    render(){
        return(
            <>
                <div class="lists">
                <dl class="prod_info">
                    <dt><i class="ico ico_gy bz type26"></i><span>AI 방역로봇</span></dt>
                    <dd>일생을 감염의 위험과 함께하는 엔데믹의 시대에
                        일상의 안전을 지키는 AI 로봇 기반의 새로운 방역 패러다임</dd>
                </dl>
                <span class="chk_wrap">
                    <input type="checkbox" name="ipt_chk" id="ipt_chk1" value="B201" data-prod-id="B201" data-prod-title="Biz인터넷"/>
                    <label for="ipt_chk1" onclick="location.href='https:/enterprise.kt.com/pd/P_PD_AI_RB_005.do';">
                        <span class="hide">Biz인터넷 상품 선택</span>
                    </label>
                </span>
                </div>
            </>
        )
    }
}

export default RecommendItem;