package app.repository;

import app.domain.Trips;

public interface TripRepository {
Trips getById(Long id);

}
