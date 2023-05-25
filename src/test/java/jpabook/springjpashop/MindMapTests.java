package jpabook.springjpashop;


import jpabook.springjpashop.Entity.MindMap.MindMapEdge;
import jpabook.springjpashop.Entity.MindMap.MindMapEntity;
import jpabook.springjpashop.Entity.MindMap.MindMapNode;
import jpabook.springjpashop.repository.MakeSentenceRepository;
import jpabook.springjpashop.repository.MindMapRepository;
import jpabook.springjpashop.repository.WordRelationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MindMapTests {
    @Autowired
    MindMapRepository mindMapRepository;
    @Autowired
    MakeSentenceRepository makeSentenceRepository;

    @Autowired
    WordRelationRepository wordRelationRepository;
    @PersistenceContext
    EntityManager em;

    @Test
    public void mapping(){


    }

}
