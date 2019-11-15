import React from "react";
import Paper from "@material-ui/core/Paper";
import { ViewState } from "@devexpress/dx-react-scheduler";
import {
  Scheduler,
  WeekView,
  Appointments,
  AllDayPanel
} from "@devexpress/dx-react-scheduler-material-ui";
import { MuiThemeProvider, createMuiTheme } from "@material-ui/core/styles";
import { blue } from "@material-ui/core/colors";
import { appointments } from "./data";
import './Calender.scss';
import plusicon from '../../assets/img/plusicon.png';
import calender from '../../assets/img/calender.jpg';
import Navigation from '../../components/Navigation';
import TransitionsModal from '../../components/Modal';

const theme = createMuiTheme({ palette: { type: "light", primary: blue } });

export default class Calendar extends React.PureComponent {
  state = {
    data: appointments,
    isWeek: true,
    isOpen: false
  }

  toggleView = () => this.setState(prevState => ({ isWeek: !prevState.isWeek }))
  openModal = () => this.setState({ isOpen: true })

  render() {
    const { data } = this.state;

    return (
      <div>
        <Navigation />
        <div className="header-wrapper">
          <div className="plusicon" onClick={this.openModal}>
            <img src={plusicon} alt="add" width="40px" height="40px" />
          </div>
          <div className="viewswitcher">
            {this.state.isWeek ? 'Wochenansicht' : 'Tagesansicht'}
          </div>
          <div className="cal" onClick={this.toggleView}>
            <img src={calender} width="45px" height="50px" alt="calender" />
          </div>
        </div>

        <TransitionsModal open={this.state.isOpen} onClose={() => this.setState({ isOpen: false })} />

        <MuiThemeProvider theme={theme}>
          <Paper>
            <Scheduler data={data}>
              <ViewState currentDate="2019-11-11" />
              <WeekView startDayHour={9} endDayHour={19} />
              <Appointments data={data} />
              <AllDayPanel />
            </Scheduler>
          </Paper>
        </MuiThemeProvider>
      </div>
    );
  }
}
