//package com.bootcamp.commons;
//
//import com.bootcamp.commons.models.Criteria;
//import com.bootcamp.commons.models.Criterias;
//import com.bootcamp.commons.ws.utils.RequestParser;
//import com.bootcamp.entities.Axe;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.logging.Logger;
//
//public class SearchParserTest {
//
//    @Test
//    public void SearchTest(){
//        //test the searchParser
//        String request1="nom=%1000ORaxe<>axe2";
//        String request2="nom=%1000ORaxe<>axe2ORdescription=route";
//        String request3="description=routeANDbudget<140000";
//        String request4="description=routeANDbudget<140000ORaxe<>axe2ORdescription";
//        List<Integer>  lesCritere1= RequestParser.getOrderedIndexes(request1);
//
//        List<Integer>  lesCritere2= RequestParser.getOrderedIndexes(request2);
//        List<Integer>  lesCritere3= RequestParser.getOrderedIndexes(request3);
//        List<Integer>  lesCritere4= RequestParser.getOrderedIndexes(request4);
//
//    }
//}
