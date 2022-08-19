import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom';
import RMService from '../../services/RM.service';

const Detail = () => {

    const [personaje, setPersonaje] = useState({}); 
    const { id } = useParams();

    useEffect(() => {
        RMService.getCharacterById(id)
            .then((data) => setPersonaje(data))
            .catch((error) => console.log(error));
    }, []);

    return (
        <div className="row m-3">
            <div className="col-md-12">
                <div className="card flex-md-row mb-4 box-shadow h-md-250">
                    <div className="card-body d-flex flex-column align-items-start">
                        <strong className="d-inline-block mb-2 text-success">{personaje.species}</strong>
                        <h3 className="d-inline-block mb-0 text-dark">{personaje.name}</h3>
                        <div className="mb-1 text-muted">
                            {new Date(personaje.created).toLocaleDateString()}
                        </div>
                        <p className="card-text mb-auto">
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.
                            This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    </div>
                    <img className="h-100 d-inline-block rounded card-img-right flex-auto d-none d-md-block " height="auto" src={personaje.image} alt="personaje" />
                </div>
                <div className="btn-group">
                    <button type="button" className="btn btn-sm btn-outline-primary">
                        <Link to={"/"} className="nav-link">
                            Volver
                        </Link>
                    </button>
                </div>
            </div>
        </div>
    )
}
export default Detail
