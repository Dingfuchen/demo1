package com.bos.demo1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface XbTestRepository extends JpaRepository<XbTest, Integer> {

    public List<XbTest> findXbTestByYearName(String yearName);

    public List<XbTest> findByYearNameOrderByIdDesc(String id);
}
