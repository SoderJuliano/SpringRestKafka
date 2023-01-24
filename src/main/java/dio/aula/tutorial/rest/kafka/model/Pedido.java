package dio.aula.tutorial.rest.kafka.model;

import java.math.BigDecimal;

public record Pedido(String codigo, String nome, BigDecimal valor) {}
