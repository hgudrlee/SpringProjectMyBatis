package com.spring.diary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class DiaryController {
    @Autowired
    DiaryServiceImpl diaryService;

    /*@RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        SimpleDateFormat dateFormat =
                new SimpleDateFormat("hh:mm aa 'on' EEEE, MMMM dd, yyyy");
        Date now = new Date();
        String formattedDate = dateFormat.format(now);
        System.out.println(formattedDate);

        model.addAttribute("serverTime", 3);

        return "index";
    }*/

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String diarylist(Model model) {
        model.addAttribute("list", diaryService.getDiaryList());
        return "posts";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addPost() {
        return "addpostform";
    }

    @RequestMapping(value = "/addok", method = RequestMethod.POST)
    public String addPostOK(DiaryVO vo) {
        if (diaryService.insertDiary(vo) == 0) System.out.println("데이터 추가 실패");
        else System.out.println("데이터 추가 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id") int id, Model model) {
        DiaryVO diaryVO = diaryService.getDiary(id);
        model.addAttribute("diaryVO", diaryVO);
        return "editform";
    }

    @RequestMapping(value = "/editok", method = RequestMethod.POST)
    public String editPostOK(DiaryVO vo) {
        if (diaryService.updateDiary(vo) == 0) System.out.println("데이터 수정 실패");
        else System.out.println("데이터 수정 성공!!!");
        return "redirect:list";
    }

    @RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
    public String deletePost(@PathVariable("id") int id) {
        if (diaryService.deleteDiary(id) == 0) System.out.println(("데이터 삭제 실패"));
        else System.out.println("데이터 삭제 성공!!!");
        return "redirect:../list";
    }
}
