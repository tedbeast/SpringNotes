package spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Digimon")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Digimon {
    @Id
    private int id;
    @Column
    private String name;
    @Column
    private int power;
}
