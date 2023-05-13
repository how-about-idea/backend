package jpabook.springjpashop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WordRelationDto {
    private Long id;

    private String string;
}