// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.ingenuity.salesquote.domain;

import com.ingenuity.salesquote.domain.Quote;
import com.ingenuity.salesquote.domain.QuoteDataOnDemand;
import com.ingenuity.salesquote.domain.QuoteIntegrationTest;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

privileged aspect QuoteIntegrationTest_Roo_IntegrationTest {
    
    declare @type: QuoteIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: QuoteIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext*.xml");
    
    declare @type: QuoteIntegrationTest: @Transactional;
    
    @Autowired
    private QuoteDataOnDemand QuoteIntegrationTest.dod;
    
    @Test
    public void QuoteIntegrationTest.testCountQuotes() {
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", dod.getRandomQuote());
        long count = Quote.countQuotes();
        Assert.assertTrue("Counter for 'Quote' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void QuoteIntegrationTest.testFindQuote() {
        Quote obj = dod.getRandomQuote();
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Quote' failed to provide an identifier", id);
        obj = Quote.findQuote(id);
        Assert.assertNotNull("Find method for 'Quote' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Quote' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void QuoteIntegrationTest.testFindAllQuotes() {
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", dod.getRandomQuote());
        long count = Quote.countQuotes();
        Assert.assertTrue("Too expensive to perform a find all test for 'Quote', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Quote> result = Quote.findAllQuotes();
        Assert.assertNotNull("Find all method for 'Quote' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Quote' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void QuoteIntegrationTest.testFindQuoteEntries() {
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", dod.getRandomQuote());
        long count = Quote.countQuotes();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Quote> result = Quote.findQuoteEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Quote' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Quote' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void QuoteIntegrationTest.testFlush() {
        Quote obj = dod.getRandomQuote();
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Quote' failed to provide an identifier", id);
        obj = Quote.findQuote(id);
        Assert.assertNotNull("Find method for 'Quote' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyQuote(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Quote' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void QuoteIntegrationTest.testMergeUpdate() {
        Quote obj = dod.getRandomQuote();
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Quote' failed to provide an identifier", id);
        obj = Quote.findQuote(id);
        boolean modified =  dod.modifyQuote(obj);
        Integer currentVersion = obj.getVersion();
        Quote merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'Quote' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void QuoteIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", dod.getRandomQuote());
        Quote obj = dod.getNewTransientQuote(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Quote' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Quote' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        Assert.assertNotNull("Expected 'Quote' identifier to no longer be null", obj.getId());
    }
    
    @Test
    public void QuoteIntegrationTest.testRemove() {
        Quote obj = dod.getRandomQuote();
        Assert.assertNotNull("Data on demand for 'Quote' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Quote' failed to provide an identifier", id);
        obj = Quote.findQuote(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Quote' with identifier '" + id + "'", Quote.findQuote(id));
    }
    
}
