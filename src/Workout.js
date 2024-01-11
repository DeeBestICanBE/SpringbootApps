
import React from 'react'
import { Container, Paper, TextField,Button } from '@material-ui/core'
import { makeStyles } from '@material-ui/core'
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const useStyles = makeStyles((theme)=> ({
    root: {
        '& > *': {
            margin:theme.spacing(1),
            width:'25ch'
        },
    },
}));


const WorkoutPlan = () => {

    const classes = useStyles();
    const paperStyle={padding:'50px 20px',width:600,margin:"20px auto"}
    const [workouts,setWorkouts] = useState('');
    const [duration,setDuration] = useState('');
    const [calsburned ,setcalsburned] = useState('');
    const [postmeal , setPostMeal] = useState('');
    const [streak,setStreak] = useState('');

    // let navigate = useNavigate();

    const handleClick =(e)=>{
        // e.preventDefault();
        const workout={workouts,duration,calsburned,postmeal};
        console.log(workout);
        fetch("http://localhost:8080/workout/add", {
            method:"POST",
            headers:{"Content-Type":"application/json"},
            body:JSON.stringify(workout)
        }).then(()=> {
            console.log("New Student added")
        })
    }

    // const onSubmit = () => {
        
    // }

  return (

<Container>
<Paper elevation={3} style={paperStyle}>
    <h1 style={{color:'orange'}}> Add Workout </h1>
    <form className={classes.root} noValidate autoComplete="off">
    <TextField id="standard-basic" label="WorkoutSplit"  variant="filled" value={workouts} onChange={(e)=>setWorkouts(e.target.value)} />
    <TextField id="filled-basic" label="Duration" variant="filled" value={duration} onChange={(e)=>setDuration(e.target.value)} />
    <TextField id="outlined-basic" label="CaloriesBurned" variant="outlined" value={calsburned} onChange={(e)=>setcalsburned(e.target.value)}/>
    <TextField id="outlined-basic" label="PostMeal" variant="outlined" value={postmeal} onChange={(e)=>setPostMeal(e.target.value)}/>
    <TextField id="outlined-basic" label="Streak" variant="outlined" value={streak} onChange={(e)=>setStreak(e.target.value)}/>
    <Button variant="contained" onClick={handleClick}>Submit</Button>
  </form>
  </Paper>
  </Container>
  )
}

export default WorkoutPlan;