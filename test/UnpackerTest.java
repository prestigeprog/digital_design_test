import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnpackerTest {
    private final Unpacker unpacker = new Unpacker();

    @Test
    @DisplayName("9[z]")
    public void easyTest() {
        String test = "9[z]";
        String actual = unpacker.unpack(test);
        String expected = "zzzzzzzzz";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("4[f3[t]6[y]]")
    public void mediumTest1() {
        String test = "4[f3[t]6[y]]";
        String actual = unpacker.unpack(test);
        String expected = "ftttyyyyyyftttyyyyyyftttyyyyyyftttyyyyyy";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("7[5[u]]lk2[7[rt]]ff4[6[w]]")
    public void mediumTest2() {
        String test = "7[5[u]]lk2[7[rt]]ff4[6[w]]";
        String actual = unpacker.unpack(test);
        String expected = "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuulkrtrtrtrtrtrtrtrtrtrtrtrtrtrtffwwwwwwwwwwwwwwwwwwwwwwww";
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("4[g3[y8[a]7[j]]]")
    public void hardTest1() {
        String test = "4[g3[y8[a]7[j]]]";
        String actual = unpacker.unpack(test);
        String expected = "gyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjgyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjy" +
                "aaaaaaaajjjjjjjgyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjgyaaaaaaaajjjjjjjyaaaaaaaajjjjjjjyaaaaaaaajjjjjjj";
        assertEquals(expected, actual);
    }
}