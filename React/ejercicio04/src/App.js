import './App.css';
import Navbar from './components/public/Navbar';
import { Route, Routes } from 'react-router-dom';
import Main1 from './components/public/Main1';
import Main2 from './components/public/Main2';
import Footer from './components/public/Footer';

function App() {
  return (
    <div>
      <Navbar/>
      <Routes>
        <Route exact path={"/main1"} element={<Main1 />} />
        <Route exact path={"/main2"} element={<Main2 />} />
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
