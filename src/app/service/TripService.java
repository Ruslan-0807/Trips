package app.service;

import app.domain.Trips;

public interface TripService {
    Trips getById(Long id);

    void assignArticle(Trips trips);
}

