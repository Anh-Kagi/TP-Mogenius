package fr.polytech.tpmogenius.app.repository;

import fr.polytech.tpmogenius.app.model.Heart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HeartRepository extends JpaRepository<Heart, UUID> {
}
