import React from 'react';
import './Overview.scss';
import { withRouter } from 'react-router-dom';

class Overview extends React.Component {
  handleLogout = () => this.props.history.push("/");
  redirectCalender = () => this.props.history.push("/calender");
  redirectCourseList = () => this.props.history.push("/courses");

  render() {
    return (
      <div>
        <h1 className="title">
          <div>Lehrerkalender</div>
          <div>2019</div>
          <div className="logout" onClick={this.handleLogout}>Logout</div>
        </h1>
        <button onClick={this.redirectCalender}>Kalenderansicht</button>
        <button onClick={this.redirectCourseList}>Kursliste</button>
      </div>
    )
  }
}

export default withRouter(Overview);
