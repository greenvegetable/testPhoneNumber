package com.demo;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class PhoneCombinationTest {
    private PhoneCombination phoneCombination;
    @Before
    public void setUp() throws Exception {
        phoneCombination=new PhoneCombination();
    }

    @Test
    public void test_phoneNumberCombinations() {
        //todo
        //        Assert.assertEquals("equals", List<String>);
        //        Integer[] numberStr = {9};
        Integer[] numberStrArr = {2,3};
        //step 1:convert integer array into integer list
        List<Integer> resultList= new ArrayList<Integer>(Arrays.asList(numberStrArr));;

        //step 2: Check List Size whether is more than 0 and  less than 2
        assertThat(resultList, not(IsEmptyCollection.empty()));
        assertThat(resultList.size(), lessThanOrEqualTo(2));

        //step 3: Test number  whether is more than 1 and less than 100
        assertThat(resultList, everyItem(greaterThanOrEqualTo(2)));
        assertThat(resultList, everyItem(lessThanOrEqualTo(99)));
        phoneCombination.phoneNumberCombinations(numberStrArr);


    }

    @Test
    public void backtracking() {

    }

}