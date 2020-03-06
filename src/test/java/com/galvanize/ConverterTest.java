package com.galvanize;

import com.galvanize.currency.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterTest {
    @Test
    public void convertToDollar(){
        assertEquals(new Dollar(), Converter.convertToDollar(new Franc()));
    }
}
