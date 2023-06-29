package com.spring.exemple;

import com.spring.exemple.controller.TutorialController;
import com.spring.exemple.model.Tutorial;
import com.spring.exemple.repository.TutorialRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TutorialControllerTest {

    @Mock
    private TutorialRepository tutorialRepository;

    @InjectMocks
    private TutorialController tutorialController;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllTutorials() {
        // Mock data
        List<Tutorial> tutorials = new ArrayList<>();
        tutorials.add(new Tutorial("Tutorial 1", "Description 1", true));
        tutorials.add(new Tutorial("Tutorial 2", "Description 2", false));

        when(tutorialRepository.findAll()).thenReturn(tutorials);

        // Call the method
        ResponseEntity<List<Tutorial>> response = tutorialController.getAllTutorials(null);

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(tutorials, response.getBody());

        verify(tutorialRepository, times(1)).findAll();
        verifyNoMoreInteractions(tutorialRepository);
    }

    @Test
    public void testGetTutorialById() {
        // Mock data
        long tutorialId = 1L;
        Tutorial tutorial = new Tutorial("Tutorial 1", "Description 1", true);
        Optional<Tutorial> tutorialData = Optional.of(tutorial);

        when(tutorialRepository.findById(tutorialId)).thenReturn(tutorialData);

        // Call the method
        ResponseEntity<Tutorial> response = tutorialController.getTutorialById(tutorialId);

        // Verify the result
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(tutorial, response.getBody());

        verify(tutorialRepository, times(1)).findById(tutorialId);
        verifyNoMoreInteractions(tutorialRepository);
    }

}
