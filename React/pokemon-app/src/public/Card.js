import React from 'react'


export const Card = ({ pokemon }) => {

    return (

        <div className="col">
            <div className="card shadow-sm">
                {pokemon.sprites ? (
                    <img src={pokemon.sprites.front_default} alt={pokemon.name} />
                ) : (
                    null
                )
                }
                <div className="card-body">
                    <h3 className="mb-0 text-dark">{pokemon}</h3>
                    <p className="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
                </div>
            </div>
        </div>
    )
}

