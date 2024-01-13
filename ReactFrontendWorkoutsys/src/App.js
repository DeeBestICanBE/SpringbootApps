
import './App.css';
import MenuAppBar from './AppBar';
import WorkoutPlan from './Workout';





function App() {
  return (
    <div className="App">
      <header className="App-header">
      <MenuAppBar/>
      </header>
      <div className='Login'>
        <div>
          <text>Workout App</text>
      <WorkoutPlan/>
        </div>
        </div>
     
    </div>
  );
}

export default App;
