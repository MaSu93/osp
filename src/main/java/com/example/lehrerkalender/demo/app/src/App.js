import React from 'react';
import './App.css';
import { BrowserRouter, Route } from "react-router-dom";
import Auth from './sites/Auth';
import Overview from './sites/Overview';
import Calender from './sites/Calender';
import Courses from './sites/Courses';
import Test from './sites/Test';

function App() {
  return (
    <BrowserRouter>
      <Route exact path="/" component={Auth} />
      <Route path="/overview" component={Overview} />
      <Route path="/courses" component={Courses} />
      <Route path="/calender" component={Calender} />
      <Route path="/test" component={Test} />
    </BrowserRouter>
  );
}

export default App;
