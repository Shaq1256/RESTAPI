package com.crud.tasks.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreatedTrelloCard {

    private String id;
    private String name;
    private String shortUrl;

}
