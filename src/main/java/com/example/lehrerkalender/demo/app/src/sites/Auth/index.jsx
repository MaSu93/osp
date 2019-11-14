import React from 'react';
import './Auth.scss';
import request from 'axios';
import { withRouter } from 'react-router-dom';

class Auth extends React.Component {
  state = {
    isValidUser: false
  }

  // init master user
  componentDidMount() {
    const url = "/api/lehrer";
    const data = { nutzerName:"fia71",passwort:"osp",name:"master" };
    request({ url, method: "POST", data })
      .then(res => console.log("Master User created!", res));
  }

  handleClick = async() => {
    const user = document.querySelector('#username').value;
    const pw = document.querySelector('#passwort').value;

    const url = "/api/lehrer/validate";
    const data = { nutzerName: user, passwort: pw };
    await request({ url, method: "POST", data })
      .then(res => this.setState({ isValidUser: res.data }));

    this.state.isValidUser || this.state.dummy ? this.props.history.push('/overview') : this.onError();
  }

  onError = () => {
    const err = document.querySelector('.error-msg');
    err.style.display = 'block';
  }

  render() {
    return (
      <div>
        <h1 className="title">
          <div>Lehrerkalender</div>
          <div>2019</div>
        </h1>

        <form>
          <label>
            <input type="text" name="nutzerName" id="username" className="input" maxlength="30" placeholder="Username" />
          </label>
          <label>
            <input type="text" name="passwort" id="passwort" className="input" maxlength="40" placeholder="Passwort" />
            <div className="error-msg">Die Eingabe des Benutzers oder Passworts ist falsch.</div>
          </label>
        </form>
        <button onClick={this.handleClick}>Login</button>
      </div>
    )
  }
}

export default withRouter(Auth);