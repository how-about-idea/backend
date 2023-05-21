package jpabook.springjpashop.Entity.MakeSentence;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jpabook.springjpashop.dto.MakeSentence.PatentSentenceDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity(name = "PatentSentence")
@Table(name = "PatentSentence")
public class PatentSentenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="patent_sentence_id")
    private Long id;

    @Column(name = "patent_sentence")
    private String patentSentence;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "make_sentence_id")
    private MakeSentenceEntity makeSentenceEntity;

    public PatentSentenceEntity(PatentSentenceDto dto){
        this.patentSentence = dto.getPatentSentence();
        this.makeSentenceEntity =dto.getMakeSentenceEntity();
    }
}
