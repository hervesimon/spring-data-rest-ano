package fr.eudemia.springdatarestano.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "programme")
@ToString(exclude = "participants")
public class Programme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "programme_generator")
    @SequenceGenerator(name = "programme_generator", sequenceName = "programme_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "programme", cascade = { CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
    @OrderBy("id")
    private List<Participant> participants;
    
    public void setParticipants(List<Participant> participants) {
        this.participants.clear();
        Optional.ofNullable(participants).ifPresent(this.participants::addAll);
        this.participants.forEach(p -> p.setProgramme(this));
    }

}
