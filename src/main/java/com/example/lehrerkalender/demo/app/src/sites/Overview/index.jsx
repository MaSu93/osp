import React from 'react';
import './Overview.scss';
import { withRouter } from 'react-router-dom';
import Navigation from '../../components/Navigation';

class Overview extends React.Component {
  handleLogout = () => this.props.history.push("/");
  redirectCalender = () => this.props.history.push("/calender");
  redirectCourseList = () => this.props.history.push("/courses");

  render() {
    return (
      <div>
        <Navigation />
        <h1 className="title">
          <div>Übersicht</div>
          <div className="logout" onClick={this.handleLogout}>Logout</div>
        </h1>
        <button onClick={this.redirectCalender}>Kalenderansicht</button>
        <button onClick={this.redirectCourseList}>Kursliste</button>
      </div>
    )
  }
}

export default withRouter(Overview);
