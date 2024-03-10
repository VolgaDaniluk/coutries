package com.danliuk.countries.repository.specificaton;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SearchCriteria {

    private String key;

    private SearchOperation operation;

    private String value;
}
