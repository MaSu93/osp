import React from 'react';
import './Calender.scss';
import plusicon from '../../assets/img/plusicon.png';
import calender from '../../assets/img/calender.jpg';

export default class Calender extends React.Component {
  state = {
    isWeek: true
  }

  toggleView = () => this.setState(prevState => ({ isWeek: !prevState.isWeek }))

  render() {
    return (
      <div>
        <div className="header-wrapper">
          <div className="plusicon">
            <img src={plusicon} alt="add" width="40px" height="40px" />
          </div>
          <div className="viewswitcher">
            {this.state.isWeek ? 'Wochenansicht' : 'Tagesansicht'}
          </div>
          <div className="cal" onClick={this.toggleView}>
            <img src={calender} width="45px" height="50px" alt="calender" />
          </div>
        </div>
        <div class="calendar">
          <div class="day-of-week">
            <div>Mo</div>
            <div>Tu</div>
            <div>We</div>
            <div>Th</div>
            <div>Fr</div>
            <div>Sa</div>
            <div>Su</div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
          <div class="date-grid">
            <div><time datetime="2019-02-01">.</time></div>
            <div><time datetime="2019-02-02">.</time></div>
            <div><time datetime="2019-02-03">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
            <div><time datetime="2019-02-28">.</time></div>
          </div>
        </div>
      </div>
    )
  }
}