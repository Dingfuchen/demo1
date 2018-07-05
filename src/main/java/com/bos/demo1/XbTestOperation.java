package com.bos.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class XbTestOperation {

    @Autowired
    private XbTestRepository xbTestRepository;

    @PostMapping(value = "/XbTest")
    public XbTest insertXbTestOperation (@RequestParam("yearName") String yearName, @RequestParam("quarter") String quarter,
                                         @RequestParam("quarterName") String quarterName) {
        XbTest xbTest = new XbTest();
        xbTest.setYearName(yearName);
        xbTest.setQuarter(quarter);
        xbTest.setQuarterName(quarterName);
        return xbTestRepository.save(xbTest);
    }

    @GetMapping(value="/XbTest/{id}")
    public XbTest xbTestFindOne(@PathVariable("id") Integer id) {
        XbTest xbTest = new XbTest();
        xbTest.setId(id);
        return xbTestRepository.getOne(id);
    }

    @GetMapping(value="/YearName/{yearName}")
    public List<XbTest> xbTestFindOne(@PathVariable("yearName") String yearName) {
        XbTest xbTest = new XbTest();
        xbTest.setYearName(yearName);
        return xbTestRepository.findByYearNameOrderByIdDesc(yearName);
    }
}