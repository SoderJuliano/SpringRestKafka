package dio.aula.tutorial.rest.kafka.controller;

import dio.aula.tutorial.rest.kafka.model.Pedido;
import dio.aula.tutorial.rest.kafka.services.RegistraService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class PedidosController {

    @Autowired
    private RegistraService registra;

    @PostMapping("register")
    public ResponseEntity<String> salvarPedidos(@RequestBody Pedido pedido)
    {
        registra.adicionaEvento("registraPedido", pedido);
        return ResponseEntity.ok("pedido registrado");
    }
}
