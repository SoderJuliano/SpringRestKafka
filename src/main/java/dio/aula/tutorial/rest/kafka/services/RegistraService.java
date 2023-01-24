package dio.aula.tutorial.rest.kafka.services;

import lombok.Data;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Data
public class RegistraService {

    private final KafkaTemplate<String, Object> template;

    public void adicionaEvento(String topico, Object dados){
        template.send(topico, dados);
    }
}
