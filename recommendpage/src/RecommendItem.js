import {Component} from 'react';
import './component/base.css';

class RecommendItem extends Component{
    constructor(props){
        super(props);
        // this.handleMouseHover = this.handleMouseHover.bind(this);
        
        this.state ={
            isHovering: false
        };
            
    }

    handleMouseHover = (e) => {
        this.setState({
            isHovering:!this.state.isHovering
        });
    }

    render(){
        return(
            <div className="lists" onMouseEnter={this.handleMouseHover} onMouseLeave={this.handleMouseHover}>
                <dl className="prod_info">
                    <dt>
                        <img className='ico' src={require('./res/icons/ai/airCleanerAI.png')} width='70px' height='70px' alt='' />
                        <span>AI 방역로봇</span>
                    </dt>
                    <dd>일생을 감염의 위험과 함께하는 엔데믹의 시대에
                        일상의 안전을 지키는 AI 로봇 기반의 새로운 방역 패러다임</dd>
                </dl>
            </div>
        )
    }
}

export default RecommendItem;