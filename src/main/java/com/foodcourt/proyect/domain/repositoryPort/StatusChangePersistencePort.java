package com.foodcourt.proyect.domain.repositoryPort;

import com.foodcourt.proyect.domain.model.StatusChange;
import java.util.List;

public interface StatusChangePersistencePort {

    public void registerStatusChange(StatusChange statusChange);

    List<StatusChange> getAll();
}
