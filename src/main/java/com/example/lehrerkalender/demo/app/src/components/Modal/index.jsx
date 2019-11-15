import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Modal from '@material-ui/core/Modal';
import Backdrop from '@material-ui/core/Backdrop';
import Fade from '@material-ui/core/Fade';

const useStyles = makeStyles(theme => ({
  modal: {
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
  },
  paper: {
    position: 'absolute',
    top: '500px',
    left: '50%',
    zIndex: 100,
    backgroundColor: theme.palette.background.paper,
    border: '2px solid #000',
    boxShadow: theme.shadows[5],
    padding: theme.spacing(2, 4, 3),
  },
}));

export default function TransitionsModal(props) {
  const classes = useStyles();

  return (
    <div>
      <Modal
        aria-labelledby="transition-modal-title"
        aria-describedby="transition-modal-description"
        className={classes.modal}
        open={props.open}
        onClose={props.onClose}
        closeAfterTransition
        BackdropComponent={Backdrop}
        BackdropProps={{
          timeout: 500,
        }}
      >
        <Fade in={props.open}>
          <div className={classes.paper} style={{ transform: 'translateX(-50%)' }}>
            <h2 id="transition-modal-title">Termin erstellen</h2>
            <p id="transition-modal-description">
              <div><b>Not implemented yet.</b></div>
              <br />
              <div>Hier könnten Sie verschiedene Angaben auswählen, wie beispielsweise:</div>
              <br />
              <div><b>Datum:</b> 15.11.2019</div>
              <div><b>Uhrzeit:</b> 9:35 Uhr - 11:00 Uhr</div>
              <div><b>Teilnehmer:</b> Ich, Herr X</div>
              <div><b>Raum:</b> C007</div>
              <div><b>Kommentar:</b> Unser Freitagsmeeting</div>
              <br />
              <div>Danach können Sie den Termin bestätigen und wird anschließend im Kalendar angezeigt.</div>
            </p>
          </div>
        </Fade>
      </Modal>
    </div>
  );
}
