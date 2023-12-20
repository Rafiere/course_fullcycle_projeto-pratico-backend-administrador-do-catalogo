package dev.piccodev.domain;

/* Não pode ser uma entidade pois um modelo poderia implementar um ValueObject e
* uma entidade, e ele só pode ser um ou outro, por isso é uma classe abstrata, já
* que no Java não podemos herdar de duas classes diferentes. */

/* Uma entidade é definida pelo ID, os value objects são definidos pelos atributos no
* DDD.*/

public abstract class ValueObject {
}
