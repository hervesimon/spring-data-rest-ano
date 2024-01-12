package fr.eudemia.springdatarestano.repository;

import fr.eudemia.springdatarestano.domain.Programme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "programmes", path = "programmes")
public interface ProgrammeRepository extends JpaRepository<Programme, Long> {
        
}
