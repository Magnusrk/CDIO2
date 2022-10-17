import static org.junit.jupiter.api.Assertions.*;

class LanguageTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void setLanguage() {
        //SWAP LANGUAGE PACKS BETWEEN VALID AND INVALID
        Language.SetLanguage("da");
        Language.SetLanguage("en");
        Language.SetLanguage("");
        Language.SetLanguage("-1");
        Language.SetLanguage("en");
        Language.SetLanguage("da");

        //TEST da LANGUAGE PACK AFTER
        String test1Expected = "-1 -      asd1 -test DA 1";
        String test2Expected = "-.,-:`?test DA 2";
        String test3Expected = ":::\"\"\"\"\"\"\"test DA 3";
        String test4Expected = "+-.,123test DA 4";

        //Execute
        String test1Result = Language.GetString("test1");
        String test2Result = Language.GetString("test2");
        String test3Result = Language.GetString("test3");
        String test4Result = Language.GetString("test4");

        //Result
        assertEquals(test1Expected, test1Result);
        assertEquals(test2Expected, test2Result);
        assertEquals(test3Expected, test3Result);
        assertEquals(test4Expected, test4Result);
    }

    @org.junit.jupiter.api.Test
    void getString() {

        //TEST 1 - da language pack
        Language.SetLanguage("da");
        String test1Expected = "-1 -      asd1 -test DA 1";
        String test2Expected = "-.,-:`?test DA 2";
        String test3Expected = ":::\"\"\"\"\"\"\"test DA 3";
        String test4Expected = "+-.,123test DA 4";
        String test1Result = Language.GetString("test1");
        String test2Result = Language.GetString("test2");
        String test3Result = Language.GetString("test3");
        String test4Result = Language.GetString("test4");

        assertEquals(test1Expected, test1Result);
        assertEquals(test2Expected, test2Result);
        assertEquals(test3Expected, test3Result);
        assertEquals(test4Expected, test4Result);


        //TEST 2 - invalid language pack
        Language.SetLanguage("INVALID LANGUAGE");
        String expected = "STRING-NOT-FOUND";
        assertEquals(expected, Language.GetString("test"));

        //TEST 3 - en language pack
        Language.SetLanguage("en");
        test1Expected = "-1 -      asd1 -test EN 1";
        test2Expected = "-.,-:`?test EN 2";
        test3Expected = ":::\"\"\"\"\"\"\"test EN 3";
        test4Expected = "+-.,123test EN 4";
        test1Result = Language.GetString("test1");
        test2Result = Language.GetString("test2");
        test3Result = Language.GetString("test3");
        test4Result = Language.GetString("test4");

        assertEquals(test1Expected, test1Result);
        assertEquals(test2Expected, test2Result);
        assertEquals(test3Expected, test3Result);
        assertEquals(test4Expected, test4Result);

        //TEST 4 - non-existent key

        assertEquals(Language.GetString("INVALID STRING"), "STRING-NOT-FOUND");
    }
}