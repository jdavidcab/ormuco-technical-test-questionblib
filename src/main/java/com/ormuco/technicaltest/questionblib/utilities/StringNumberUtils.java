package com.ormuco.technicaltest.questionblib.utilities;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * This class provides extra funcionality for Number.
 * 
 * @author Johann David Cabrera Mora
 * @since 1.0
 */
public class StringNumberUtils {

    /**
     * This value indicates number is greater than another number.
     */
    public static final int IS_GREATER_THAN = 1;
    
    /**
     * This value indicates number is equals than another number.
     */
    public static final int IS_EQUAL_THAN = 0;

    /**
     * This value indicates number is less than another number.
     */
    public static final int IS_LESS_THAN = -1;

    /**
     * Convert to Integer.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Integer}, 
     * returning {@code zero} if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toInteger( "" ) = 0;
     *   StringNumberUtils.toDouble( "A" ) = 0;
     *   StringNumberUtils.toInteger( null ) = 0;
     *   StringNumberUtils.toInteger( "123" ) = 123;
     * </pre>
     * 
     * @param strNum String to convert.
     * @return {@code Integer} value that represented by {@code String} value or 
     * {@code zero} if conversition fail.
     * 
     */
    public static Integer toInteger( final String strNum ) {
        return toInteger( strNum, 0 );
    }

    /**
     * Convert to Integer.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Integer}, 
     * returning a default value if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toInteger( "", null ) = null;
     *   StringNumberUtils.toDouble( "A", 0 ) = 0;
     *   StringNumberUtils.toInteger( null, 99999 ) = 99999;
     *   StringNumberUtils.toInteger( "123", null ) = 123;
     * </pre>
     * 
     * @param strNum String to convert.
     * @param defaultValue the default value returned if conversion fails.
     * @return {@code Integer} value that represented by {@code String} value or 
     * default value if conversition fail.
     * 
     */
    public static Integer toInteger( final String strNum, final Integer defaultValue ) {
        if ( strNum == null ) {
            return defaultValue;
        }
        
        try {
            return Integer.parseInt( strNum );
        } catch ( final NumberFormatException nfe ) {
            return defaultValue;
        }
    }

    /**
     * Convert to Long.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Long}, 
     * returning {@code zero} if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toLong( "" ) = 0;
     *   StringNumberUtils.toDouble( "A" ) = 0;
     *   StringNumberUtils.toLong( null ) = 0;
     *   StringNumberUtils.toLong( "123" ) = 123;
     * </pre>
     * 
     * @param strNum String to convert.
     * @return {@code Long} value that represented by {@code String} value or 
     * {@code zero} if conversition fail.
     * 
     */
    public static Long toLong( final String strNum ) {
        return toLong( strNum, 0L );
    }

    /**
     * Convert to Long.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Long}, 
     * returning a default value if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toLong( "", null ) = null;
     *   StringNumberUtils.toDouble( "A", 0 ) = 0;
     *   StringNumberUtils.toLong( null, 99999 ) = 99999;
     *   StringNumberUtils.toLong( "123", null ) = 123;
     * </pre>
     * 
     * @param strNum String to convert.
     * @param defaultValue the default value returned if conversion fails.
     * @return {@code Long} value that represented by {@code String} value or 
     * default value if conversition fail.
     * 
     */
    public static Long toLong( final String strNum, final Long defaultValue ) {
        if( strNum == null ) {
            return defaultValue;
        }

        try {
            return Long.parseLong( strNum );
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert to Double.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Double}, 
     * returning {@code zero} if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toDouble( "" ) = 0;
     *   StringNumberUtils.toDouble( "A" ) = 0;
     *   StringNumberUtils.toDouble( null ) = 0;
     *   StringNumberUtils.toDouble( "1.23" ) = 1.23;
     * </pre>
     * 
     * @param strNum String to convert.
     * @return {@code Double} value that represented by {@code String} value or 
     * {@code zero} if conversition fail.
     * 
     */
    public static Double toDouble( final String strNum ) {
        return toDouble( strNum, 0.0d );
    }

    /**
     * Convert to Double.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Double}, 
     * returning a default value if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toDouble( "", null ) = null;
     *   StringNumberUtils.toDouble( "A", 0 ) = 0;
     *   StringNumberUtils.toDouble( null, 99999 ) = 99999;
     *   StringNumberUtils.toDouble( "1.23", null ) = 1.23;
     * </pre>
     * 
     * @param strNum String to convert.
     * @param defaultValue the default value returned if conversion fails.
     * @return {@code Double} value that represented by {@code String} value or 
     * default value if conversition fail.
     * 
     */
    public static Double toDouble( final String strNum, final Double defaultValue ) {
        if ( strNum == null ) {
            return defaultValue;
        }

        try {
            NumberFormat format = NumberFormat.getInstance( Locale.getDefault() );
            Number number = format.parse( strNum );
            return number.doubleValue();
        } catch (final ParseException nfe) {
            return defaultValue;
        }
    }

    /**
     * Convert to Double.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Double}, 
     * from specified Locale object, and returning {@code zero} if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toDouble( "" ) = 0;
     *   StringNumberUtils.toDouble( "A" ) = 0;
     *   StringNumberUtils.toDouble( null ) = 0;
     *   StringNumberUtils.toDouble( "1.23" ) = 1.23;
     * </pre>
     * 
     * @param strNum String to convert.
     * @param locale Locale object represents a specific geographic, cultural, or political region.
     * @return {@code Double} value that represented by {@code String} value or 
     * {@code zero} if conversition fail.
     * 
     */
    public static Double toDouble( final String strNum, final Locale locale ) {
        return toDouble( strNum, locale, 0.0d );
    }

    /**
     * Convert to Double.
     * 
     * <p>
     * This class allow to convert a {@code String} to an {@code Double}, 
     * from specified Locale object, and returning a default value if the conversion fails.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.toDouble( "", null ) = null;
     *   StringNumberUtils.toDouble( "A", 0 ) = 0;
     *   StringNumberUtils.toDouble( null, 99999 ) = 99999;
     *   StringNumberUtils.toDouble( "1.23", null ) = 1.23;
     * </pre>
     * 
     * @param strNum String to convert.
     * @param defaultValue the default value returned if conversion fails.
     * @param locale Locale object represents a specific geographic, cultural, or political region.
     * @return {@code Double} value that represented by {@code String} value or 
     * default value if conversition fail.
     * 
     */
    public static Double toDouble( final String strNum, final Locale locale, final Double defaultValue ) {
        if ( strNum == null ) {
            return defaultValue;
        }

        try {
            NumberFormat format = NumberFormat.getInstance( locale );
            Number number = format.parse( strNum );
            return number.doubleValue();
        } catch (final ParseException nfe) {
            return defaultValue;
        }
    }

    /**
     * Compare two {@code String}.
     * 
     * <p>
     * This method compares two version string as input and returns 
     * whether one is greater than, equal, or less than the other.
     * </p>
     * 
     * <p>
     * This method uses {@code Locale.getDefault()} from Java Virtual Machine
     * to specific geographic, cultural, or political region.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.compare( "", "" ) = 0;
     *   StringNumberUtils.compare( "strNum1", "strNum2" ) = 0;
     *   StringNumberUtils.compare( null, null ) = 0;
     *   StringNumberUtils.compare( "1.2", "1.1" ) = 1;
     *   StringNumberUtils.compare( "1.1", "1.1" ) = 0;
     *   StringNumberUtils.compare( "1.1", "1.2" ) = -1;
     * </pre>
     * 
     * @param strNum1 First {@code String} to evaluate.
     * @param strNum2 Second {@code String} to evaluate.
     * @return the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     * 
     */
    public static int compare( final String strNum1, final String strNum2 ) {
        return compare( strNum1, strNum2, Locale.getDefault() );
    }

    /**
     * Compare two {@code String}.
     * 
     * <p>
     * This method compares two version string as input and returns 
     * whether one is greater than, equal, or less than the other.
     * </p>
     * 
     * <pre>
     *   StringNumberUtils.compare( "", "", Locale.CANADA ) = 0;
     *   StringNumberUtils.compare( "strNum1", "strNum2", Locale.CANADA ) = 0;
     *   StringNumberUtils.compare( null, null, Locale.CANADA ) = 0;
     *   StringNumberUtils.compare( "1.2", "1.1", Locale.CANADA ) = 1;
     *   StringNumberUtils.compare( "1.1", "1.1", Locale.CANADA ) = 0;
     *   StringNumberUtils.compare( "1.1", "1.2", Locale.CANADA ) = -1;
     * </pre>
     * 
     * @param strNum1 First {@code String} to evaluate.
     * @param strNum2 Second {@code String} to evaluate.
     * @param locale Locale object represents a specific geographic, cultural, or political region.
     * @return the value 0 if strNum1 == strNum2; a value -1 if strNum1 < strNum2; 
     * and a value 1 if strNum1 > strNum2;
     * 
     */
    public static int compare( final String strNum1, final String strNum2, final Locale locale ) {
        Double doubleNum1 = toDouble( strNum1, locale );
        Double doubleNum2 = toDouble( strNum2, locale );

        if( doubleNum1 > doubleNum2 ) {
            return IS_GREATER_THAN;
        } else if( doubleNum1 < doubleNum2 ) {
            return IS_LESS_THAN;
        } else {
            return IS_EQUAL_THAN;
        }
    }
}
