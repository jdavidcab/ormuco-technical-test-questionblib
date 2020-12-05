package com.ormuco.technicaltest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Locale;

import com.ormuco.technicaltest.questionblib.utilities.StringNumberUtils;

import org.junit.jupiter.api.Test;

public class StringNumberUtilisTest {

    /**
     * Strings to compare are not valid. With default Locale. Value returned 0.
     */
    @Test
    public void whenStringIsNotValid_thenReturn0(){
        assertEquals( 0, StringNumberUtils.compare( "strNum1", "strNum2" ), 
            "Strings to compare are not valid. With default Locale. Value returned 0." );
    }

    /**
     * First String is greater than second String. Specified Canada Locale. Value returned 1.
     */
    @Test
    public void whenStringGreaterThanLocaleCAValid_thenReturn1(){
        assertEquals( 1, StringNumberUtils.compare( "1.2", "1.1", Locale.CANADA ), 
            "First String is greater than second String. Specified Canada Locale. Value returned 1" );
    }

    /**
     * First String is greater than second String. Specified Colombia Locale. Value returned 1.
     */
    @Test
    public void whenStringGreaterThanWithLocaleCOValid_thenReturn1(){
        final Locale colombiaLocate = new Locale( "es", "CO" );
        assertEquals( 1, StringNumberUtils.compare( "1,2", "1,1", colombiaLocate ),
        "First String is greater than second String. Specified Colombia Locale. Value returned 1" );
    }

    /**
     * First String is equals than second String. Specified Canada Locale. Value returned 0.
     */
    @Test
    public void whenStringEqualsThanLocaleCAValid_thenReturn0(){
        assertEquals( 0, StringNumberUtils.compare( "1.2", "1.2", Locale.CANADA ),
        "First String is equals than second String. Specified Canada Locale. Value returned 0" );
    }

    /**
     * First String is less than second String. Specified Canada Locale. Value returned -1.
     */
    @Test
    public void whenStringLessThanLocaleCAValid_thenReturn0(){
        assertEquals( -1, StringNumberUtils.compare( "1.1", "1.2", Locale.CANADA ),
        "First String is less than second String. Specified Canada Locale. Value returned -1" );
    }
}
