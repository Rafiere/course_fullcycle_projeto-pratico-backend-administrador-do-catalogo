package dev.piccodev.domain.category;

public record CategorySearchQuery(int page, //A página da paginação que será buscada
                                  int perPage, //A quantidade de itens por página
                                  String terms, //O termo de busca. Se a pessoa buscar por "fil", poderá encontrar "filme", por exemplo
                                  String sort, //Os atributos que a paginação deverá ser feita (nome, descrição etc)
                                  String direction) { //Representa a direção da busca. Se ela será ascendente ou descendente.
}
