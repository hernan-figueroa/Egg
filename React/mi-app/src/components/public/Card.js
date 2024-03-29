import React from 'react'
import { Link } from 'react-router-dom'

export const Card = ({ personaje }) => {
    return (
        <div className="col">
            <div className="card shadow-sm">
                <img className="bd-placeholder-img card-img-top" width="100%" src={personaje.image} alt="personaje" />

                <div className="card-body">
                    <h3 className="mb-0 text-dark">{personaje.name}</h3>
                    <p className="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                    <div className="d-flex justify-content-between align-items-center">
                        <div className="btn-group">
                            <button type="button" className="btn btn-sm btn-outline-secondary">
                                <Link to={`/details/${personaje.id}`} className="nav-link">
                                    Detalle
                                </Link>
                            </button>
                        </div>
                        <small className="text-muted">9 mins</small>
                    </div>
                </div>
            </div>
        </div>
    )
}

