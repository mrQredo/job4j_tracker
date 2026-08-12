package ru.job4j.tracker.input;

import org.junit.jupiter.api.Test;
import ru.job4j.tracker.output.Output;
import ru.job4j.tracker.output.StubOutput;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {

    @Test
    void whenInvalidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(1);
    }

    @Test
    void whenValidInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[] {"77"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(77);
    }

    @Test
    void whenMultipleValidInputs() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"10", "25", "7", "99"}
        );
        ValidateInput input = new ValidateInput(output, in);

        int selected1 = input.askInt("Enter menu:");
        assertThat(selected1).isEqualTo(10);

        int selected2 = input.askInt("Enter menu:");
        assertThat(selected2).isEqualTo(25);

        int selected3 = input.askInt("Enter menu:");
        assertThat(selected3).isEqualTo(7);

        int selected4 = input.askInt("Enter menu:");
        assertThat(selected4).isEqualTo(99);
    }

    @Test
    void whenNegativeInput() {
        Output output = new StubOutput();
        Input in = new MockInput(
                new String[]{"-15"}
        );
        ValidateInput input = new ValidateInput(output, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected).isEqualTo(-15);
    }
}