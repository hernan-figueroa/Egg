const Cards = ({ personaje }) => {

    return (
        <div>
            <main>
                <div className="album py-5 bg-light">
                    <div className="container">

                        <div >
                            <div className="col">
                                <div className="card shadow-sm">
                                    <img src={personaje.image} alt="imagen"></img>
                                    <div className="card-body">
                                        <p className="card-text">{personaje.name}</p>
                                        <div className="d-flex justify-content-between align-items-center">
                                            <div className="btn-group">
                                                <button type="button" className="btn btn-sm btn-outline-secondary">View</button>
                                                <button type="button" className="btn btn-sm btn-outline-secondary">Edit</button>
                                            </div>
                                            <small className="text-muted">9 mins</small>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </main>
        </div>
    )
}

export default Cards
