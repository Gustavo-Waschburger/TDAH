package guga.nom.br.demomongo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collation="shows")
@Getter
@Setter
public class Shows {
    @Id
    private Integer show_id;
    private String location;
    private String date;
    private Integer available_tickets;
}
