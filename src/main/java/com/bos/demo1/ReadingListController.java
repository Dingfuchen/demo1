//package com.bos.demo1;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/")
//public class ReadingListController {
//
//    Logger logger = LoggerFactory.getLogger(ReadingListRepository.class);
//
//    private ReadingListRepository readingListRepository;
//    @Autowired
//    public ReadingListController(
//            ReadingListRepository readingListRepository) {
//        this.readingListRepository = readingListRepository;
//    }
//
//    @RequestMapping(value="/{reader}", method=RequestMethod.GET)
//    public String readersBooks(
//            @PathVariable("reader") String reader,
//            Model model) {
//        List<Book> readingList =
//                readingListRepository.findByReader(reader);
//        logger.debug("测试");
//        if (readingList != null) {
//            model.addAttribute("books", readingList);
//        }
//        return "readingList";
//    }
//    @RequestMapping(value="/{reader}", method=RequestMethod.POST)
//    public String addToReadingList(
//            @PathVariable("reader") String reader, Book book) {
//        book.setReader(reader);
//        readingListRepository.save(book);
//        return "redirect:/{reader}";
//    }
//
//    @RequestMapping(value="/test", method=RequestMethod.GET)
//    public String testRender() {
//        return "123";
//    }
//}
//
