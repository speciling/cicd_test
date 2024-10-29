package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TestServiceTest {

    @Test
    void 덧셈_함수_테스트() {
        TestService testService = new TestService();

        int a = 1;
        int b = 2;

        Assertions.assertThat(testService.add(a, b)).isEqualTo(a+b);
    }

}