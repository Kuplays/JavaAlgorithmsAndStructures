import MathematicsProgression.LinearProgression;
import custom_collections.Stack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    void stackInstanceCreated() {
        Stack<String> st = new Stack<>();

        int expectedSize = 0;
        int actualSize = st.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void stackPushBySize() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 10; i++)
            st.push(i);
        for (int i = 0; i < 5; i++)
            st.pop();

        int expectedSize = 5;
        int actualSize = st.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void stackPushByTopElement() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 1000; i++)
            st.push(i);
        st.pop();

        int expectedElement = 998;
        int actualElement = st.top();

        assertEquals(expectedElement, actualElement);
    }

    @Test
    void stackPopTest() {
        Stack<Integer> st = new Stack<>();
        int actualElement = 0;

        for (int i = 0; i < 1000; i++)
            st.push(i);

        for (int i = 0; i < 10; i++)
            actualElement = st.pop();

        int expectedElement = 990;

        assertEquals(expectedElement, actualElement);
    }

    @Test
    void stackPopBySize() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 100000; i++)
            st.push(i);

        for (int i = 0; i < 100000; i++)
            st.pop();

        int expectedSize = 0;
        int actualSize = st.size();

        assertEquals(expectedSize, actualSize);
    }

    @Test
    void stackTopBySize() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 100; i++)
            st.push(i);

        int expectedElement = 99;
        int actualElement = st.top();

        assertEquals(expectedElement, actualElement);
    }

    @Test
    void isEmptyTestNotEmpty() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 10000; i++)
            st.push(i);

        boolean actualResult = st.isEmpty();

        assertFalse(actualResult);
    }

    @Test
    void isEmptyTestIsEmpty() {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 10000; i++)
            st.push(i);
        for (int i = 0; i < 10000; i++)
            st.pop();

        boolean actualResult = st.isEmpty();

        assertTrue(actualResult);
    }
}
