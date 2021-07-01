package org.alfresco.alfrescofizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;


public class ExerciseTests {

    final static List<Integer> range1To20 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
    final static String FIZZBUZZ_EXPECTED_RESULT_WITH_RANGE_1_TO_20 = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
    final static String ALFRESCOFIZZBUZZ_EXPECTED_RESULT_WITH_RANGE_1_TO_20 = "1 2 alfresco 4 buzz fizz 7 8 fizz buzz 11 fizz alfresco 14 fizzbuzz 16 17 fizz 19 buzz";
    
    @Test
    void whenRunningFizzBuzz_ThenReturnExpectedOutput() {
        String result = new FizzBuzz().execute(range1To20);
        assertThat(result).isEqualTo(FIZZBUZZ_EXPECTED_RESULT_WITH_RANGE_1_TO_20);
    }
    
    @Test
    void whenOnteToThree() {
    	final List<Integer> inputList = new ArrayList<>();
    	inputList.add(1);
    	inputList.add(2);
    	inputList.add(3);
    	String result = new FizzBuzz().execute(inputList);
    	final String expected = "1 2 fizz";
    	assertEquals(expected, result);
    }
    
    @Test
    void whenOnteToFive() {
    	final List<Integer> inputList = new ArrayList<>();
    	inputList.add(1);
    	inputList.add(2);
    	inputList.add(3);
    	inputList.add(4);
    	inputList.add(5);
    	String result = new FizzBuzz().execute(inputList);
    	final String expected = "1 2 fizz 4 buzz";
    	assertEquals(expected, result);
    }


     @Test
     void whenRunningAlfrescoFizzBuzz_ThenReturnExpectedOutput() {
         String result = new AlfrescoFizzBuzz().execute(range1To20);
         assertThat(result).isEqualTo(ALFRESCOFIZZBUZZ_EXPECTED_RESULT_WITH_RANGE_1_TO_20, result);
     }

}
