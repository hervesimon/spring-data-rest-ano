package fr.eudemia.springdatarestano.event;

import fr.eudemia.springdatarestano.domain.Programme;
import java.util.ArrayList;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler
public class ProgrammeEventHandler {

    @HandleBeforeSave
    public void handlerBeforeSave(Programme programme) {
        programme.setParticipants(new ArrayList<>(programme.getParticipants()));
    }

}
