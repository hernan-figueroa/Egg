import React, { useState } from 'react'

const Footer = () => {
    const [ingreso,setIngreso] = useState("");


    function onInput(event){
        setIngreso(event.target.value);
    }
    
    return (
            <footer className="py-3 my-4">
                <ul className="nav  border-bottom pb-3 mb-3 gap-3">
                    <li className="nav-item">Home</li>
                    <li className="nav-item">
                        <input onChange={onInput} type="text" className="form-control form-control-dark text-bg-dark"/>
                    </li>
                    <li className="nav-item">{ingreso} </li>
                </ul>
                <p className="text-center text-muted">© 2022 Company, Inc</p>
            </footer>
    )
}

export default Footer
