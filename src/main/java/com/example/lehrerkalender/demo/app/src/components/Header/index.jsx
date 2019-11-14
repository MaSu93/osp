import React from 'react';
import request from 'axios';

export default class Header extends React.Component {
  state = {
    data: null
  }

  async componentDidMount() {
    const url = "/api/lehrer/gerd3";
    request(url).then((res) => console.log(res.data));
  }

  render() {
    return (
      <div>Header</div>
    )
  }
}
