package com.spring.exemple;

import com.spring.exemple.model.Tutorial;
import com.spring.exemple.repository.TutorialRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class TutorialTests {
    @Autowired
    TutorialRepository repo;
    @Test
    @Rollback(false)
    public void testCreateTutorial(){
        Tutorial tutorialTest = new Tutorial("java 8","Spring boot",true);
        Tutorial savedTutorial= repo.save(tutorialTest);
        assertNotNull(savedTutorial);
    }
    @Test
    public void testFindByTitleExist(){
         String title="java 8";
         Tutorial tutorial=  repo.findTutorialByTitle(title);
         assertThat(tutorial.getTitle()).isEqualTo(title);
    }
    @Test
    public void testFindByTitleNotExist(){
        String title="java 11";
        Tutorial tutorial=  repo.findTutorialByTitle(title);
        assertNull(tutorial);
    }
    @Test
    public void testUpdateTutorial(){
      String TutoTitle ="pc";
      Tutorial tutorial = new Tutorial(TutoTitle,"Gamer i7",false);
        tutorial.setDescription("hp i5");
        repo.save(tutorial);
        Tutorial updateTutorial = repo.findTutorialByTitle(TutoTitle);
        assertThat(updateTutorial.getTitle()).isEqualTo(TutoTitle);
    }

}
